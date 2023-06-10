package sample.Class;

public class Anggota {
    protected String idAnggota;
    protected String nama;
    protected String noTelp;

    public Anggota(String idAnggota, String nama, String no_telp){
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.noTelp = no_telp;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }
    @Override
    public String toString (){
        return this.getIdAnggota() + " - " + this.getNama();
    }

}
