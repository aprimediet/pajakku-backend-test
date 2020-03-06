package com.pajakku;

import java.math.BigDecimal;

public class ObjekFakturKeluaran {
    // Class properties
    private String kodeObjek;
    private String namaObjek;
    private BigDecimal hargaSatuan;
    private Double jumlahBarang;
    private BigDecimal hargaTotal;
    private Double diskon;
    private String keterangan;
    private BigDecimal dpp;
    private BigDecimal ppn;
    private Double tarifPPnBM;
    private BigDecimal ppnbm;

    // Constructor
    public ObjekFakturKeluaran() {}

    public ObjekFakturKeluaran(
            String kodeObjek,
            String namaObjek,
            BigDecimal hargaSatuan,
            Double jumlahBarang,
            BigDecimal hargaTotal,
            Double diskon,
            BigDecimal dpp,
            BigDecimal ppn,
            Double tarifPPnBM,
            BigDecimal ppnbm

    ) {
        this.kodeObjek = kodeObjek;
        this.namaObjek = namaObjek;
        this.hargaSatuan = hargaSatuan;
        this.jumlahBarang = jumlahBarang;
        this.hargaTotal = hargaTotal;
        this.diskon = diskon;
        this.dpp = dpp;
        this.ppn = ppn;
        this.tarifPPnBM = tarifPPnBM;
        this.ppnbm = ppnbm;
    }

    // Getter and setter
    public String getKodeObjek() {
        return kodeObjek;
    }

    public void setKodeObjek(String kodeObjek) {
        this.kodeObjek = kodeObjek;
    }

    public String getNamaObjek() {
        return namaObjek;
    }

    public void setNamaObjek(String namaObjek) {
        this.namaObjek = namaObjek;
    }

    public BigDecimal getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(BigDecimal hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public Double getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(Double jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public BigDecimal getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(BigDecimal hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public Double getDiskon() {
        return diskon;
    }

    public void setDiskon(Double diskon) {
        this.diskon = diskon;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public BigDecimal getDpp() {
        return dpp;
    }

    public void setDpp(BigDecimal dpp) {
        this.dpp = dpp;
    }

    public BigDecimal getPpn() {
        return ppn;
    }

    public void setPpn(BigDecimal ppn) {
        this.ppn = ppn;
    }

    public Double getTarifPPnBM() {
        return tarifPPnBM;
    }

    public void setTarifPPnBM(Double tarifPPnBM) {
        this.tarifPPnBM = tarifPPnBM;
    }

    public BigDecimal getPpnbm() {
        return ppnbm;
    }

    public void setPpnbm(BigDecimal ppnbm) {
        this.ppnbm = ppnbm;
    }

    public String toString() {
        return "Objek Faktur: " + kodeObjek;
    }
}