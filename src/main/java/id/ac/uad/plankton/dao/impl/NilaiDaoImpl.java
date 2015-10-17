package id.ac.uad.plankton.dao.impl;

import id.ac.uad.plankton.dao.NilaiDao;
import id.ac.uad.plankton.model.Nilai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gov on 16/10/15.
 */
public class NilaiDaoImpl implements NilaiDao {
    private final Connection connection;

    public NilaiDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Nilai nilai) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Nilai (id,kode,nilai) VALUES (?,?,?)");
        preparedStatement.setInt(1, nilai.getId_student());
        preparedStatement.setInt(2, nilai.getKode());
        preparedStatement.setInt(3, nilai.getNilai());

        preparedStatement.executeUpdate();
    }

    @Override
    public void update(Nilai updateNilai) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Nilai SET kode=?, nilai=? WHERE id_student=? ");
        preparedStatement.setInt(1, updateNilai.getKode());
        preparedStatement.setInt(2, updateNilai.getId_student());
        preparedStatement.setInt(3, updateNilai.getNilai());

        preparedStatement.executeUpdate();

    }

    @Override
    public void delete(int id_student) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Nilai WHERE id_student=?");
        preparedStatement.setInt(1,id_student);

        preparedStatement.executeUpdate();

    }

    @Override
    public Nilai findById(int id_student) {
        Nilai nilai = new Nilai();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT nilai FROM nilai WHERE id_student=?");
            preparedStatement.setInt(1,id_student);
            ResultSet resulset = preparedStatement.executeQuery();
            while (resulset.next()){
                nilai.setNilai(resulset.getInt("nilai"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return nilai;
    }

    @Override
    public List<Nilai> findAll() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, kode, nilai FROM Nilai");
            ResultSet resultset = preparedStatement.executeQuery();

            List<Nilai>nilaiList = new ArrayList<>();
            while (resultset.next()){
                Nilai nilai = new Nilai();

                nilai.setId_student(resultset.getInt("id_student"));
                nilai.setKode(resultset.getInt("kode"));
                nilai.setNilai(resultset.getInt("nilai"));

                nilaiList.add(nilai);

            }

            return nilaiList;

        }catch (SQLException e){
            e.printStackTrace();
            return new ArrayList<>();
        }


    }


    @Override
    public List<Nilai> findByNameLike(String nama) {
        return null;
    }
}
