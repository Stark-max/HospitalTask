package models.entities;

import models.enums.Therapy;



import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Doctors extends User{

    public Doctors() {
    }

    public Doctors(int id, String name, String surname) {
        super(id, name, surname);
    }



    public void healingInfo() {
        System.out.printf("Doctor -> %s %s\n",
                this.name,
                this.surname
        );
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
