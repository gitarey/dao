package id.ac.uad.plankton;

import id.ac.uad.plankton.dao.CourseDao;
import id.ac.uad.plankton.dao.StudentDao;
import id.ac.uad.plankton.dao.impl.CourseDaoImpl;
import id.ac.uad.plankton.dao.impl.StudentDaoImpl;
import id.ac.uad.plankton.db.DatabaseConnection;
import id.ac.uad.plankton.model.Nilai;
import id.ac.uad.plankton.model.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by gov on 08/10/15.
 */
public class MainAplication {
    public static void main(String[] args) {//Student kunto = new Student(6,"kunto");

        //Student kunto = new Student(6,"kunto");
        //Course jono = new Course(3, "Ruby On Rails");
        Nilai gita = new Nilai(1, 2, 90);

        try {
            StudentDao studentDao = new StudentDaoImpl(DatabaseConnection.getInstance().getConnection());

            //studentDao.insert(kipli);
            //studentDao.delete(6);
            //studentDao.update(kipli);
            //System.out.println("Nama    : " + studentDao.findById(3).getNama());
            /*List<Student> studentList = studentDao.findAll();
            for (Student s : studentList) {
                System.out.println("Id      : " + s.getId());
                System.out.println("Nama    : " + s.getNama());
                System.out.println("--------------------------");
            }*/

            CourseDao courseDao = new CourseDaoImpl(DatabaseConnection.getInstance().getConnection());

            //courseDao.insert(kunto);
            //courseDao.update(kunto);
            // courseDao.delete(3);
            //System.out.println("Nama    : " + courseDao.findById(2).getName());
            /*List<Course> courseList = courseDao.findAll();
            for (Course c : courseList){
                System.out.println("Id Course   : " + c.getKode());
                System.out.println("Name        : " + c.getNama());
                System.out.println("--------------------------");
            }*/

            //NilaiDao nilaiDao = new NilaiDaoImpl(DatabaseConnection.getInstance().getConnection());

            //nilaiDao.insert(kunto);
            //nilaiDao.update(kunto);
            //nilaiDao.delete(1);
            //System.out.println("Nilai   : " + nilaiDao.findById(2).getNilai());
            /*List<Nilai> nilaiList = nilaiDao.findAll();
            for (Nilai n : nilaiList){
                System.out.println("Id      : " + n.getId());
                System.out.println("Kode    : " + n.getKode());
                System.out.println("Nilai   : " + n.getNilai());
                System.out.println("--------------------------");
            }*/

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}