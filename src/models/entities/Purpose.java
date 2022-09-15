package models.entities;

import models.enums.Therapy;

public interface Purpose {
    void doTherapy(Therapy rh, Patients patient);
}
