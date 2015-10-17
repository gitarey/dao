package id.ac.uad.plankton.dao.impl;

import id.ac.uad.plankton.dao.CourseDao;
import id.ac.uad.plankton.model.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gov on 16/10/15.
 */
public class CourseDaoImpl implements CourseDao{
    private final Connection connection;

    public CourseDaoImpl(Connection connection){
        this.connection = connection;
    }

    @Override
    public void insert(Course course) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Course (kode,nama) VALUES (?,?)");
        preparedStatement.setInt(1, course.getKode());
        preparedStatement.setString(1, course.getNama());

        preparedStatement.executeUpdate();
    }

    @Override
    public void update(int kode, Course updatedCourse) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Course SET nama=? WHERE kode=?");
        preparedStatement.setString(1, updatedCourse.getNama());
        preparedStatement.setInt(1, updatedCourse.getKode());

        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(int kode) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Course WHERE kode=?");
        preparedStatement.setInt(1,kode);

        preparedStatement.executeUpdate();

    }

    @Override
    public Course FindByid(int kode) {
        Course course = new Course();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT FROM Course WHERE kode=?");
            preparedStatement.setInt(1,kode);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                course.setNama(resultSet.getString("nama"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return course;
    }

    @Override
    public List<Course> findAll() {
        try {
            PreparedStatement preparedStatement= connection.prepareStatement("SELECT kode AS id,nama AS name FROM Course");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Course> courseList = new ArrayList<>();
            while (resultSet.next()){
                Course course = new Course();

                course.SetKode(resultSet.getInt("kode"));
                course.setNama(resultSet.getString("name"));

                courseList.add(course);
            }

            return courseList;

        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();

        }

    }

    @Override
    public List<Course> findByNameLike(String nama) {
        return null;
    }
}
