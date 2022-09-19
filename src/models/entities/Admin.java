package models.entities;

import models.enums.Therapy;

import java.util.Calendar;
import java.util.Date;

public class Admin {
    public void doTherapy(Therapy therapy, Patients patient, Doctors doctors,Nurse nurse) {
        Date today = new Date();
        patient.setTherapy(therapy);
        patient.setStartDate(today);
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DATE, 5);
        patient.setEndDate(cal.getTime());
        patient.setDoctor(doctors);
        patient.setNurse(nurse);
    }
}
