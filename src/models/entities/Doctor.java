package models.entities;

public class Doctor extends People {

    public Doctor() {
    }

    public Doctor(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
