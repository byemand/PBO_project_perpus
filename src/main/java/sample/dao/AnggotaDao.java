package sample.dao;

import sample.Class.Anggota;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AnggotaDao implements DAO<Anggota> {
    @Override
    public ArrayList<Anggota> getAll() throws SQLException{
        String query = "SELECT * FROM anggota";
        Statement statement = db.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        ArrayList<Anggota> listAnggota = new ArrayList<>();
        while (resultSet.next()){
            String idAnggota = resultSet.getString("idAnggota");
            String nama = resultSet.getString("nama");
            String no_telp = resultSet.getString("noTelp");
            listAnggota.add(new Anggota(idAnggota,nama,no_telp));
        }
        return listAnggota;
    }

    @Override
    public boolean save (Anggota anggota){
        return false;
    }

    @Override
    public boolean update(Anggota anggota){
        return false;
    }
    @Override
    public boolean delete(Anggota anggota){
        return false;
    }

}
