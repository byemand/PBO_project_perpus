package sample.Class;

import java.util.Date;

public class Buku {
    private int idBuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunTerbit;
    private String jenisBuku;

    public Buku(int idBuku, String judul, String pengarang, String penerbit, int tahunTerbit, String jenisBuku) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.jenisBuku = jenisBuku;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }
}
