package id.ac.uad.plankton.dao.impl;

import id.ac.uad.plankton.dao.StudentDao;
import id.ac.uad.plankton.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gov on 13/10/15.
 */
public class StudentDaoImpl implements StudentDao {
    private final Connection connection;
    private int id_student;

    public StudentDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Student student) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student (id_student, nama_anak,address) VALUES (?,?,?)");
        preparedStatement.setInt(1, student.getId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getAddress());

        preparedStatement.executeUpdate();
    }

    @Override
    public void update(int id_student, Student updatedStudent) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student SET nama_anak=?,address=? WHERE id=?");
        preparedStatement.setString(1, updatedStudent.getName());
        preparedStatement.setString(2, updatedStudent.getAddress());
        preparedStatement.setInt(3, updatedStudent.getId());

        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(int id_student) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM MataKuliah WHERE id_makul=?");
        preparedStatement.setInt(1,id_student);
        ResultSet resultSet = preparedStatement.executeQuery();

    }

    @Override
    public Student findById(int id_student) {
        return null;
    }

    @Override
    public List<Student> findAll() {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_student,nama_anak,address AS alamat FROM student");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Student> studentList = new ArrayList<>();
            while (resultSet.next()) {
                Student student = new Student();

                student.setId(resultSet.getInt("id_student"));
                student.setName(resultSet.getString("nama"));
                student.setAddress(resultSet.getString("alamat"));

                studentList.add(student);
            }

            return studentList;

        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public List<Student> findByNameLike(String name) {
        return null;
    }
}
