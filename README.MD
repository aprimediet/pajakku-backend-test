# Test Backend

Disini saya menggunakan bahasa pemrograman java, script dibagi menjadi 3 file:

- Main.java: untuk menjalankan program utama
- FakturKeluaran.java: Object Faktur Keluaran (FK)
- ObjekFakturKeluaran.java: Object Objek Faktur Keluaran (OF)

Karena saya menggunakan absolute path untuk membaca file csv, harap disesuaikan dengan
file csv pada local path pada file Main.java, line: 18

Contoh output keluaran program:

```
===================================
Parsing Data from CSV...............................................................................................................................................

Faktur: PT. MATAHARI PUTRA PRIMA TBK, Tanggal: 2018-02-26
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: PT. SURIATAMA MAHKOTA KENCANA, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: PT. MATAHARI PUTRA PRIMA TBK, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: FEBRIZAL MADJID, IR, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: FEBRIZAL MADJID, IR, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: AMRAN SYARIF, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: PT. MATAHARI PUTRA PRIMA TBK, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: PT. MATAHARI PUTRA PRIMA TBK, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: PT. MATAHARI PUTRA PRIMA TBK, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: PT. SURIATAMA MAHKOTA KENCANA, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: FEBRIZAL MADJID, IR, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: SINGGALANG ASRI, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: SINGGALANG ASRI, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

Faktur: SINGGALANG ASRI, Tanggal: 2018-02-27
DPP Objek sama dengan faktur? : true
PPN Objek sama dengan faktur? : true
PPnBM Objek sama dengan faktur? : true

===================================
Jumlah DPP Total: 110758146
Jumlah PPN Total: 11075762
Jumlah PPnBM Total: 0
===================================

```