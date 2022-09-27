package models.entities;

import models.enums.Therapy;

import java.util.Date;

public class Patient extends People {
    public int admission=0;
    public Nurse nurse;
    public Doctor doctor;
    public Therapy therapy;
    public Date start;
    public Date end;

    public Patient() {
    }
    public Patient(int id, String name) {
        super(id, name);
    }

    public Patient(int admission,int id, String name, Nurse nurse, Doctor doctor, Therapy therapy, Date start) {
        super(id, name);
        this.admission=admission;
        this.nurse = nurse;
        this.doctor = doctor;
        this.therapy = therapy;
        this.start = start;
    }

    public int getAdmission() {
        return admission;
    }

    public void setAdmission(int admission) {
        this.admission = admission;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Therapy getTherapy() {
        return therapy;
    }

    public void setTherapy(Therapy therapy) {
        this.therapy = therapy;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Patient{" +
                ", id=" + id +
                ", admission=" + admission +
                ", name='" + name + '\'' +
                "nurse=" + nurse +
                ", doctor=" + doctor +
                ", therapy=" + therapy +
                ", start=" + start +
                ", end=" + end+
                "}\n"
                ;
    }

}
