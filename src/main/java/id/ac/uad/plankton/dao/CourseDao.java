package id.ac.uad.plankton.dao;

import id.ac.uad.plankton.model.Course;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by gov on 16/10/15.
 */
public interface CourseDao {

    void insert (Course course) throws SQLException;

    void update (int kode,Course updatedCourse) throws SQLException;

    void delete (int kode) throws SQLException;

    Course FindByid (int kode);

    List<Course> findAll();

    List<Course> findByNameLike(String nama);
}
