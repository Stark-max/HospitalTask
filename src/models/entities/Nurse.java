package models.entities;

import models.enums.Therapy;

public class Nurse extends User implements Purpose{
    public Nurse() {
    }

    public Nurse(int id, String name, String surname) {
        super(id, name, surname);
    }
    @Override
    public void doTherapy(Therapy rh, Patients patient){
        patient.setTherapy(rh);
    }
}
