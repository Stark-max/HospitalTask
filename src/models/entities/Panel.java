package models.entities;


import models.enums.Therapy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Panel {

    public void appointment(ArrayList<Patient> patient, ArrayList<Doctor> doctor, ArrayList<Nurse> nurse) {
        Random random = new Random();
        for (int i = 0; i < patient.size(); i++) {
            Patient p = patient.get(i);
            int ad=p.getAdmission();
            p.setAdmission(ad+1);
            Doctor d = doctor.get(random.nextInt(doctor.size()));
            Nurse n = nurse.get(random.nextInt(nurse.size()));
            p.setDoctor(d);
            p.setNurse(n);
        }
    }

    public void healing(ArrayList<Patient> patient) {
        Therapy therapy = null;
        Date today = new Date();
        for (Patient p : patient) {
            p.setTherapy(Therapy.doTherapy());
            p.setStart(today);
        }
    }

    public void duringTherapy(ArrayList<Patient> patient) {
        for (Patient p : patient) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(p.getStart());
            cal.add(Calendar.DATE, 5);
            p.setEnd(cal.getTime());
        }
    }

    public void printInfo(ArrayList<Patient> patient) {
        for (Patient p : patient) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("E dd.MM.yy hh:mm:ss a");
            System.out.printf("Doctor -> %s\nPatient -> %s\nAdmission -> %s\nTherapy -> %s\nNurse -> %s\nStart time -> %s\nEnd time -> %s\n",
                    p.getDoctor(),
                    p.getName(),
                    p.getAdmission(),
                    p.getTherapy().name(),
                    p.getNurse().getName(),
                    dateFormat.format(p.getStart()),
                    dateFormat.format(p.getEnd())
            );
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
}

