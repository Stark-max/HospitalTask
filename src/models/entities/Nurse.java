package models.entities;

import models.enums.Therapy;

import java.text.SimpleDateFormat;

public class Nurse extends User{
    public Nurse() {
    }

    public Nurse(int id, String name, String surname) {
        super(id, name, surname);
    }


    public void healingInfo() {
        System.out.printf("Nurse -> %s %s\n",
                this.name,
                this.surname
        );
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
