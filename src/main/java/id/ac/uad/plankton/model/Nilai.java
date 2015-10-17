package id.ac.uad.plankton.model;

/**
 * Created by gov on 16/10/15.
 */
public class Nilai {
    private int id;
    private Course course;
    private Student student;
    private int nilai;

    public Nilai(){

    }

    public Nilai(int id, Course course, Student student, int nilai) {
        this.id = id;
        this.course = course;
        this.student = student;
        this.nilai = nilai;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Course getCourse(){
        return course;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    public Student getStudent(){
        return student;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public int getNilai(){
        return nilai;
    }

    public void setNilai(int nilai){
        this.nilai = nilai;
    }
}
