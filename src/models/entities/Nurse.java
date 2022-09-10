package models.entities;

public class Nurse {
    private int id;
    public String fullName;
    private Therapy pTherapy;
    private Patients nursePatient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Therapy getpTherapy() {
        return pTherapy;
    }

    public void setpTherapy(Therapy pTherapy) {
        this.pTherapy = pTherapy;
    }
}
