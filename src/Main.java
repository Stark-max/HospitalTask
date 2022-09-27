import models.entities.Register;
import models.entities.Doctor;
import models.entities.Nurse;
import models.entities.Panel;
import models.entities.Patient;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Register admin = new Register();
        /*Nurse nurse = new Nurse(1,"Med","Sister");
        Nurse nurse2 = new Nurse(2,"Med","Sister");
        Nurse nurse3 = new Nurse(3,"Med","Sister");*/
       /* Doctors doctor = new Doctors(1,"Asan","Tom");
        Doctors doctor2 = new Doctors(2,"As","To");
        Patients patient= new Patients(1,"Damir","Amanov");
        Patients patient2= new Patients(2,"Dir","Aman");
        Patients patient3= new Patients(3,"Dar","Aov");
        Patients patient4= new Patients(4,"Dr","Av");
        Patients patient5= new Patients(5,"Dir","Kanat");
        Patients patient6= new Patients(6,"Dar","Ata");
        Patients patient7= new Patients(7,"Damir","Anov");
        Patients patient8= new Patients(8,"Drs","Kata");
        Patients patient9= new Patients(9,"Dir","Sama");
        Patients patient10= new Patients(10,"Dr","Tara");
        admin.doTherapy(Therapy.MEDICINE, patient,doctor,nurse);
        admin.doTherapy(Therapy.OPERATION, patient2,doctor,nurse);
        admin.doTherapy(Therapy.PROCEDURE, patient3,doctor,nurse);
        admin.doTherapy(Therapy.MEDICINE, patient4,doctor,nurse2);
        admin.doTherapy(Therapy.OPERATION, patient5,doctor,nurse2);
        admin.doTherapy(Therapy.OPERATION, patient6,doctor2,nurse2);
        admin.doTherapy(Therapy.MEDICINE, patient7,doctor2,nurse3);
        admin.doTherapy(Therapy.PROCEDURE, patient8,doctor2,nurse3);
        admin.doTherapy(Therapy.PROCEDURE, patient9,doctor2,nurse3);
        admin.doTherapy(Therapy.OPERATION, patient10,doctor2,nurse3);
        patient.print();
        patient2.print();
        patient3.print();
        patient4.print();
        patient5.print();
        patient6.print();
        patient7.print();
        patient8.print();
        patient9.print();
        patient10.print();
        doctor.healingInfo();
        doctor2.healingInfo();
        nurse.healingInfo();
        nurse2.healingInfo();
        nurse3.healingInfo();
        patient.printOwnInfo();
        patient2.printOwnInfo();
        patient3.printOwnInfo();
        patient4.printOwnInfo();
        patient5.printOwnInfo();
        patient6.printOwnInfo();
        patient7.printOwnInfo();
        patient8.printOwnInfo();
        patient9.printOwnInfo();
        patient10.printOwnInfo();*/
        ArrayList<Doctor>doctorList=new ArrayList<>();
        Doctor doctor = new Doctor(1, "Леонид Морозов");
        Doctor doctor2 = new Doctor(2, "Олег Семёнов");
        doctorList.add(doctor);
        doctorList.add(doctor2);

        ArrayList<Nurse> nurseList =new ArrayList<>();
        Nurse nurse = new Nurse(1, "MedSisterA");
        Nurse nurse2 = new Nurse(2, "MedSisterB");
        Nurse nurse3 = new Nurse(3, "MedSisterC");
        nurseList.add(nurse);
        nurseList.add(nurse2);
        nurseList.add(nurse3);

        ArrayList<Patient> patientsList = new ArrayList<>();
        Patient patient = new Patient(1, "Дамир Аманов");
        Patient patient2 = new Patient(2, "Алексей Иванов");
        Patient patient3 = new Patient(3, "Артём Смирнов");
        Patient patient4 = new Patient(4, "Вадим Кузнецов");
        Patient patient5 = new Patient(5, "Владимир Попов");
        Patient patient6 = new Patient(6, "Данил Петров");
        Patient patient7 = new Patient(7, "Денис Соколов");
        Patient patient8 = new Patient(8, "Дмитрий Михайлов");
        Patient patient9 = new Patient(9, "Егор Новиков");
        Patient patient10 = new Patient(10, "Кирилл Фёдоров");
        patientsList.add(patient);
        patientsList.add(patient2);
        patientsList.add(patient3);
        patientsList.add(patient4);
        patientsList.add(patient5);
        patientsList.add(patient6);
        patientsList.add(patient7);
        patientsList.add(patient8);
        patientsList.add(patient9);
        patientsList.add(patient10);
        Panel panel = new Panel();
        panel.appointment(patientsList,doctorList,nurseList);
        panel.healing(patientsList);
        panel.duringTherapy(patientsList);
        panel.printInfo(patientsList);
        doctorList.remove(doctor2);
        System.out.println("2222222222222222222222222222222222222222222");
        panel.appointment(patientsList,doctorList,nurseList);
        panel.printInfo(patientsList);
    }
}