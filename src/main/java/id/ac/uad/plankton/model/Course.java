package id.ac.uad.plankton.model;

/**
 * Created by gov on 16/10/15.
 */
public class Course {

    private int kode;
    private String nama;
    private Course course;
    private Student student;
    private String nilai;

    public Course(){

    }
    public Course(int kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }

    public int getKode(){
        return kode;
    }

    public void SetKode(int kode){
        this.kode = kode;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }



}

