package com.pajakku;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class FakturKeluaran {
    // Class properties
    private String kdTransaksi;
    private String fgPengganti;
    private String nomorFaktur;
    private LocalDate tanggalFaktur;
    private Integer masa;
    private Integer tahun;
    private String npwpPembeli;
    private String namaPembeli;
    private String alamatPembeli;
    private BigDecimal jumlahDPP;
    private BigDecimal jumlahPPN;
    private BigDecimal jumlahPPnBM;
    private String idKeteranganTambahan;
    private Integer fgUangMuka;
    private BigDecimal uangMukaDPP;
    private BigDecimal uangMukaPPN;
    private BigDecimal uangMukaPPnBM;
    private String referensi;
    private String nikPembeli;
    private String additionalField1;
    private String additionalField2;
    private String additionalField3;
    private String additionalField4;
    private String additionalField5;
    private List<ObjekFakturKeluaran> objekFakturs;

    public FakturKeluaran() {}

    public FakturKeluaran(
        String kdTransaksi,
        String fgPengganti,
        String nomorFaktur,
        Integer masa,
        Integer tahun,
        LocalDate tanggalFaktur,
        String npwpPembeli,
        String namaPembeli,
        String alamatPembeli,
        BigDecimal jumlahDPP,
        BigDecimal jumlahPPN,
        BigDecimal jumlahPPnBM,
        String idKeteranganTambahan,
        Integer fgUangMuka,
        BigDecimal uangMukaDPP,
        BigDecimal uangMukaPPN,
        BigDecimal uangMukaPPnBM,
        String referensi,
        String additionalField1,
        String additionalField2,
        String additionalField3,
        String additionalField4,
        String additionalField5
    ) {
        this.kdTransaksi = kdTransaksi;
        this.fgPengganti = fgPengganti;
        this.nomorFaktur = nomorFaktur;
        this.masa = masa;
        this.tahun = tahun;
        this.tanggalFaktur = tanggalFaktur;
        this.npwpPembeli = npwpPembeli;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.jumlahDPP = jumlahDPP;
        this.jumlahPPN = jumlahPPN;
        this.jumlahPPnBM = jumlahPPnBM;
        this.idKeteranganTambahan = idKeteranganTambahan;
        this.fgUangMuka = fgUangMuka;
        this.uangMukaDPP = uangMukaDPP;
        this.uangMukaPPN = uangMukaPPN;
        this.uangMukaPPnBM = uangMukaPPnBM;
        this.referensi = referensi;
        this.additionalField1 = additionalField1;
        this.additionalField2 = additionalField2;
        this.additionalField3 = additionalField3;
        this.additionalField4 = additionalField4;
        this.additionalField5 = additionalField5;
    }

    // Getter and setter
    public String getKdTransaksi() {
        return kdTransaksi;
    }

    public void setKdTransaksi(String kdTransaksi) {
        this.kdTransaksi = kdTransaksi;
    }

    public String getFgPengganti() {
        return fgPengganti;
    }

    public void setFgPengganti(String fgPengganti) {
        this.fgPengganti = fgPengganti;
    }

    public String getNomorFaktur() {
        return nomorFaktur;
    }

    public void setNomorFaktur(String nomorFaktur) {
        this.nomorFaktur = nomorFaktur;
    }

    public LocalDate getTanggalFaktur() {
        return tanggalFaktur;
    }

    public void setTanggalFaktur(LocalDate tanggalFaktur) {
        this.tanggalFaktur = tanggalFaktur;
    }

    public Integer getMasa() {
        return masa;
    }

    public void setMasa(Integer masa) {
        this.masa = masa;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public String getNpwpPembeli() {
        return npwpPembeli;
    }

    public void setNpwpPembeli(String npwpPembeli) {
        this.npwpPembeli = npwpPembeli;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }

    public BigDecimal getJumlahDPP() {
        return jumlahDPP;
    }

    public void setJumlahDPP(BigDecimal jumlahDPP) {
        this.jumlahDPP = jumlahDPP;
    }

    public BigDecimal getJumlahPPN() {
        return jumlahPPN;
    }

    public void setJumlahPPN(BigDecimal jumlahPPN) {
        this.jumlahPPN = jumlahPPN;
    }

    public BigDecimal getJumlahPPnBM() {
        return jumlahPPnBM;
    }

    public void setJumlahPPnBM(BigDecimal jumlahPPnBM) {
        this.jumlahPPnBM = jumlahPPnBM;
    }

    public String getIdKeteranganTambahan() {
        return idKeteranganTambahan;
    }

    public void setIdKeteranganTambahan(String idKeteranganTambahan) {
        this.idKeteranganTambahan = idKeteranganTambahan;
    }

    public Integer getFgUangMuka() {
        return fgUangMuka;
    }

    public void setFgUangMuka(Integer fgUangMuka) {
        this.fgUangMuka = fgUangMuka;
    }

    public BigDecimal getUangMukaDPP() {
        return uangMukaDPP;
    }

    public void setUangMukaDPP(BigDecimal uangMukaDPP) {
        this.uangMukaDPP = uangMukaDPP;
    }

    public BigDecimal getUangMukaPPN() {
        return uangMukaPPN;
    }

    public void setUangMukaPPN(BigDecimal uangMukaPPN) {
        this.uangMukaPPN = uangMukaPPN;
    }

    public BigDecimal getUangMukaPPnBM() {
        return uangMukaPPnBM;
    }

    public void setUangMukaPPnBM(BigDecimal uangMukaPPnBM) {
        this.uangMukaPPnBM = uangMukaPPnBM;
    }

    public String getReferensi() {
        return referensi;
    }

    public void setReferensi(String referensi) {
        this.referensi = referensi;
    }

    public String getNikPembeli() {
        return nikPembeli;
    }

    public void setNikPembeli(String nikPembeli) {
        this.nikPembeli = nikPembeli;
    }

    public String getAdditionalField1() {
        return additionalField1;
    }

    public void setAdditionalField1(String additionalField1) {
        this.additionalField1 = additionalField1;
    }

    public String getAdditionalField2() {
        return additionalField2;
    }

    public void setAdditionalField2(String additionalField2) {
        this.additionalField2 = additionalField2;
    }

    public String getAdditionalField3() {
        return additionalField3;
    }

    public void setAdditionalField3(String additionalField3) {
        this.additionalField3 = additionalField3;
    }

    public String getAdditionalField4() {
        return additionalField4;
    }

    public void setAdditionalField4(String additionalField4) {
        this.additionalField4 = additionalField4;
    }

    public String getAdditionalField5() {
        return additionalField5;
    }

    public void setAdditionalField5(String additionalField5) {
        this.additionalField5 = additionalField5;
    }

    public List<ObjekFakturKeluaran> getObjekFakturs() {
        return objekFakturs;
    }

    public void setObjekFakturs(List<ObjekFakturKeluaran> objekFakturs) {
        this.objekFakturs = objekFakturs;
    }

    public void addObjekFakturs(ObjekFakturKeluaran object) {
        objekFakturs.add(object);
    }

    public String toString() {
        return "Faktur: " + namaPembeli + ", Tanggal: " + tanggalFaktur.toString();
    }
}
