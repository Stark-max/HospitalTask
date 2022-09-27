package models.enums;


import java.util.Random;

public enum Therapy {
    MEDICINE,
    PROCEDURE,
    OPERATION;

    public static Therapy doTherapy() {
        int pick = new Random().nextInt(Therapy.values().length);
        return Therapy.values()[pick];
    }
}
