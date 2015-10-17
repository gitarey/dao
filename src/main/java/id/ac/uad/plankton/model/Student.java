package id.ac.uad.plankton.model;

/**
 * Created by gov on 13/10/15.
 */
public class Student {

    private int id_student;
    private String nama_anak;
    private String address;

    public Student() {
    }

    public Student(int id_student, String nama_anak, String address) {
        this.id_student = id_student;
        this.nama_anak = nama_anak;
        this.address = address;
    }

    public static Student of(int id, String name, String address) {
        return new Student(id, name, address);
    }

    public int getId() {
        return id_student;
    }

    public void setId(int id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return nama_anak;
    }

    public void setName(String name) {
        this.nama_anak = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}