package sample.Class;

import java.util.Date;

public class Transaksi {
    protected String idPeminjam ;
    protected Date tanggal_pinjam;
    protected Date tanggal_return;

    public Transaksi(String idAnggota, Date tanggal_pinjam, Date tanggal_return) {
        this.idPeminjam = idAnggota;
        this.tanggal_pinjam = tanggal_pinjam;
        this.tanggal_return = tanggal_return;
    }

    public String getIdPeminjam() {
        return idPeminjam;
    }

    public Date getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public Date getTanggal_return() {
        return tanggal_return;
    }

}
