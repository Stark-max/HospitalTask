package models.entities;

import models.enums.Therapy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patients extends User {
    public Nurse nurse;
    public Doctors doctor;
    private Therapy therapy;
    private Date startDate;
    private Date endDate;


    public Patients() {
    }

    public Patients(int id, String name, String surname ,Therapy therapy) {
        super(id, name, surname);
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
                ", therapy=" + therapy +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void print(){
        System.out.printf("Patient -> %s %s\n",
                this.name,
                this.surname
        );
    }

    public void printOwnInfo(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("E dd.MM.yy hh:mm:ss a");
        System.out.printf("Patient -> %s %s\nTherapy -> %s\nDoctor -> %s %s\nNurse -> %s %s\nStart time -> %s\nEnd time -> %s\n",
                this.name,
                this.surname,
                therapy.name(),
                doctor.getName(),
                doctor.getSurname(),
                nurse.getName(),
                nurse.getSurname(),
                dateFormat.format(this.startDate),
                dateFormat.format(this.endDate)
        );
    }
}
