package models.entities;

import models.entities.User;

public class Nurse extends People {

    public Nurse() {
    }

    public Nurse(int id, String name) {
        super(id,name);
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
