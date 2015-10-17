package id.ac.uad.plankton.dao;

import id.ac.uad.plankton.model.Nilai;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by gov on 16/10/15.
 */
public interface NilaiDao {
    void insert (Nilai nilai) throws SQLException;

    void update (Nilai updateNilai) throws SQLException;

    void delete (int id_student) throws SQLException;

    Nilai findById(int id_student);

    List<Nilai>findAll();

    List<Nilai>findByNameLike(String nama);
}
