package models.entities;

import models.enums.Therapy;

import java.text.SimpleDateFormat;

public class Patients extends User {
    private Doctors doctor;
    private Therapy therapy;
    private Nurse nurse;

    public Patients() {
    }

    public Patients(int id, String name, String surname, Doctors doctor, Therapy therapy,Nurse nurse) {
        super(id, name, surname);
        this.nurse=nurse;
        this.doctor = doctor;
        this.therapy = therapy;
    }

    public Patients(int id, String name, String surname) {
        super(id, name, surname);
    }


    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    public Therapy getTherapy() {
        return therapy;
    }

    public void setTherapy(Therapy therapy) {
        this.therapy = therapy;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "doctor=" + doctor +
                ", therapy=" + therapy +
                ", nurse=" + nurse +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void print(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("E dd.MM.yy hh:mm:ss a");
        System.out.printf("Patient -> %s %s\nTherapy -> %s \nDoctor ->  %s %s\nNurse  ->  %s %s\nStart time -> %s\nEnd time -> %s",
                this.name,
                this.surname,
                this.therapy,
                this.doctor.name,
                this.doctor.surname,
                this.nurse.name,
                this.nurse.surname,
                dateFormat.format(this.doctor.getStartDate()),
                dateFormat.format(this.doctor.getEndDate())
        );
    }
}
