package com.pajakku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //
        // HARAP GANTI BAGIAN INI
        // KARENA SAYA MENGGUNAKAN ABSOLUTE PATH
        //
        String inputFile = "/Users/aditya/Workspaces/researches/test-pajakku/backendtest/faktur_keluaran_case1_success.csv";
        String line;
        String delimiter = ";";

        // Create faktur result list
        List<FakturKeluaran> fakturList = new ArrayList<>();
        System.out.println("===================================");

        // Read CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            System.out.print("Parsing Data from CSV");
            while((line = br.readLine()) != null) {
                System.out.print(".");
                // Split by delimiter
                String lineWithNull = line.replace(";;", ";-;");
                String[] record = lineWithNull.split(delimiter);


                if (record[0].equals("FK") && !record[1].equals("KD_JENIS_TRANSAKSI")) {
                    // Detect Faktur Line
                    FakturKeluaran faktur = createFaktur(record);
                    // Create object faktur children
                    List<ObjekFakturKeluaran> objekFakturs = new ArrayList<>();
                    faktur.setObjekFakturs(objekFakturs);

                    // Add faktur to results
                    fakturList.add(faktur);
                } else if (record[0].equals("OF") && !record[1].equals("KODE_OBJEK")) {
                    // Detect Objek Faktur
                    // Get latest faktur in results
                    FakturKeluaran latestFaktur = fakturList.get(fakturList.size() - 1);

                    // Create new objek faktur
                    ObjekFakturKeluaran objekFaktur = createObjekFaktur(record);

                    // Add to latest faktur children
                    latestFaktur.addObjekFakturs(objekFaktur);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set summary parameters
        BigDecimal sumDPP = BigDecimal.ZERO;
        BigDecimal sumPPN = BigDecimal.ZERO;
        BigDecimal sumPPnBM = BigDecimal.ZERO;
        System.out.println();

        // Iterate from fakturList
        for (FakturKeluaran faktur: fakturList) {
            System.out.println();
            System.out.println(faktur.toString());

            List<ObjekFakturKeluaran> objekFakturs = faktur.getObjekFakturs();

            // Get faktur object dpp total and compare with faktur total DPP
            Function<ObjekFakturKeluaran, BigDecimal> dppMapper = objek -> objek.getDpp();
            BigDecimal objekFakturDPP = objekFakturs
                    .stream()
                    .map(dppMapper)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            Boolean dppMatch = faktur.getJumlahDPP().compareTo(objekFakturDPP) == 0;
            System.out.println("DPP Objek sama dengan faktur? : " + dppMatch.toString());

            // Get faktur object ppn total and compare with faktur total DPP
            Function<ObjekFakturKeluaran, BigDecimal> ppnMapper = objek -> objek.getPpn();
            BigDecimal objekFakturPPN = objekFakturs
                    .stream()
                    .map(ppnMapper)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            Boolean ppnMatch = faktur.getJumlahPPN().compareTo(objekFakturPPN) == 0;
            System.out.println("PPN Objek sama dengan faktur? : " + ppnMatch.toString());

            // Get faktur object dpp total and compare with faktur total DPP
            Function<ObjekFakturKeluaran, BigDecimal> ppnbmMapper = objek -> objek.getPpnbm();
            BigDecimal objekFakturPPnBM = objekFakturs
                    .stream()
                    .map(ppnbmMapper)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            Boolean ppnbmMatch = faktur.getJumlahPPnBM().compareTo(objekFakturPPnBM) == 0;
            System.out.println("PPnBM Objek sama dengan faktur? : " + ppnbmMatch.toString());

            // Calculate total DPP
            sumDPP = sumDPP.add(faktur.getJumlahDPP());
            sumPPN = sumPPN.add(faktur.getJumlahPPN());
            sumPPnBM = sumPPnBM.add(faktur.getJumlahPPnBM());
        }

        System.out.println();
        System.out.println("===================================");
        System.out.println("Jumlah DPP Total: " + sumDPP.toString());
        System.out.println("Jumlah PPN Total: " + sumPPN.toString());
        System.out.println("Jumlah PPnBM Total: " + sumPPnBM.toString());
        System.out.println("===================================");
    }

    private static FakturKeluaran createFaktur(String[] metadata) {
        // Function to map faktur array metadata
        // into new faktur object
        String kdTransaksi = metadata[1];
        String fgPengganti = metadata[2];
        String nomorFaktur = metadata[3];
        Integer masa = Integer.parseInt(metadata[4]);
        Integer tahun = Integer.parseInt(metadata[5]);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate tanggalFaktur = LocalDate.parse(metadata[6], formatter);

        String npwpPembeli = metadata[7];
        String namaPembeli = metadata[8];
        String alamatPembeli = metadata[9];
        BigDecimal jumlahDPP = new BigDecimal(metadata[10]);
        BigDecimal jumlahPPN = new BigDecimal(metadata[11]);
        BigDecimal jumlahPPnBM = new BigDecimal(metadata[12]);
        String idKeteranganTambahan = metadata[13];
        Integer fgUangMuka = Integer.parseInt(metadata[14]);
        BigDecimal uangMukaDPP = new BigDecimal(metadata[15]);
        BigDecimal uangMukaPPN = new BigDecimal(metadata[16]);
        BigDecimal uangMukaPPnBM = new BigDecimal(metadata[17]);
        String referensi = metadata[18];

        String additionalField1 = "";
        String additionalField2 = "";
        String additionalField3 = "";
        String additionalField4 = "";
        String additionalField5 = "";

        if (metadata.length > 19) {
            // Workaround, because not every FK data has the same
            // length
            additionalField1 = metadata[19];
            additionalField2 = metadata[20];
            additionalField3 = metadata[21];
            additionalField4 = metadata[22];
            additionalField5 = metadata[23];
        }


        return new FakturKeluaran(
                kdTransaksi, fgPengganti, nomorFaktur,
                masa, tahun, tanggalFaktur,
                npwpPembeli, namaPembeli, alamatPembeli,
                jumlahDPP, jumlahPPN, jumlahPPnBM,
                idKeteranganTambahan, fgUangMuka, uangMukaDPP,
                uangMukaPPN, uangMukaPPnBM, referensi,
                additionalField1, additionalField2, additionalField3,
                additionalField4, additionalField5);
    }

    private static ObjekFakturKeluaran createObjekFaktur(String[] metadata) {
        String kodeObjek = metadata[1];
        String namaObjek = metadata[2];
        BigDecimal hargaSatuan = new BigDecimal(metadata[3]);
        Double jumlahBarang = Double.parseDouble(metadata[4]);
        BigDecimal hargaTotal = new BigDecimal(metadata[5]);
        Double diskon = Double.parseDouble(metadata[6]);
        BigDecimal dpp = new BigDecimal(metadata[7]);
        BigDecimal ppn = new BigDecimal(metadata[8]);
        Double tarifPPnBm = Double.parseDouble(metadata[9]);
        BigDecimal ppnbm = new BigDecimal(metadata[10]);

        return new ObjekFakturKeluaran(
                kodeObjek, namaObjek, hargaSatuan,
                jumlahBarang, hargaTotal, diskon,
                dpp, ppn, tarifPPnBm, ppnbm
        );
    }
}