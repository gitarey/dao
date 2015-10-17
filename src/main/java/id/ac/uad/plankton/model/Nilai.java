package id.ac.uad.plankton.model;

/**
 * Created by gov on 16/10/15.
 */
public class Nilai {
    private int id_student;
    private int kode;
    private int nilai;

    public Nilai(){

    }

    public Nilai(int id_student, int kode, int nilai) {
        this.id_student = id_student;
        this.kode = kode;
        this.nilai = nilai;
    }

    public int getId_student(){
        return id_student;
    }

    public void setId_student(int id_student){
        this.id_student = id_student;
    }

    public int getKode(){
        return kode;
    }

    public void setKode(int kode){
        this.kode = kode;
    }

    public int getNilai(){
        return nilai;
    }

    public void setNilai(int nilai){
        this.nilai = nilai;
    }
}
