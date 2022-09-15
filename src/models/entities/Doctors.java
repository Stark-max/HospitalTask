package models.entities;

import models.enums.Therapy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Doctors extends User implements Purpose{

    private Date startDate;
    private Date endDate;

    public Doctors() {
    }

    public Doctors(int id, String name, String surname) {
        super(id, name, surname);
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

    public void endTime(){
        Date date = this.startDate;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 5);
        this.endDate = cal.getTime();
    }

    @Override
    public void doTherapy(Therapy rh, Patients patient) {
        patient.setTherapy(rh);
        Date today = new Date();
        this.startDate =today;
        endTime();
    }
}
