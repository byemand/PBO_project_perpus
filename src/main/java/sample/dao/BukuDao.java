package sample.dao;

import sample.Class.Buku;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class BukuDao implements DAO<Buku> {
    @Override
    public ArrayList<Buku> getAll() throws SQLException {
        String query = "SELECT * FROM buku";

        Statement statement = db.createStatement();

        ResultSet result = statement.executeQuery(query);

        ArrayList<Buku> listBuku = new ArrayList<>();
        while (result.next()) {
            int idBuku = result.getInt("idBuku");
            String judul = result.getString("judul");
            String pengarang = result.getString("pengarang");
            String penerbit = result.getString("penerbit");
            int tahunTerbit = result.getInt("tahunTerbit");
            String jenisBuku = result.getString("jenisBuku");
            listBuku.add(new Buku(idBuku, judul, pengarang, penerbit, tahunTerbit, jenisBuku));
        }
        return listBuku;
    }
    @Override
    public boolean save(Buku buku) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Buku buku) {
        return false;
    }

    @Override
    public boolean delete(Buku buku) throws SQLException {
        return false;
    }
}
