import models.entities.Doctors;
import models.entities.Nurse;
import models.entities.Patients;
import models.enums.Therapy;

public class Main {
    public static void main(String[] args) {
        Doctors doctor = new Doctors(1,"Asan","Tom");
        Patients patient= new Patients(1,"Damir","Amanov");
        patient.setDoctor(doctor);
        doctor.doTherapy(Therapy.MEDICINE, patient);
        Nurse nurse = new Nurse(1,"Med","Sister");
        patient.setNurse(nurse);


        patient.print();
    }
}