package by.homework.lessens.task14;

import java.util.ArrayList;
import java.util.List;

public class Palata {
    private String number;
    private PalataType type;
    private List<Patient> patients;

    public Palata(String number, PalataType type) {
        this.number = number;
        this.type = type;
        this.patients = new ArrayList<>();
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public PalataType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public boolean addPatient(Patient patient) {
        if (patient.getGender() == Gender.men && type != PalataType.men) {
            System.out.println("men нельзя в women палату");
            return false;
        }
        if (patient.getGender() == Gender.women && type != PalataType.women) {
            System.out.println("womew нельзя в men палату");
            return false;
        }
        if (patients.contains(patient)) {
            System.out.println("уже есть в палате");
            return false;
        }
        if (patients.size() >= 3) {
            System.out.println("В палате уже 3 пациента");
            return false;
        }

        patients.add(patient);
        return true;
    }

    public boolean removePatient(Patient patient) {
        return patients.remove(patient);
    }

    public int getPatientCount() {
        return patients.size();
    }

    @Override
    public String toString() {
        return "палата: " +
                "номер: " + number +
                " тип: " + type +
                ", пациент: " + patients;
    }

    public boolean addPatientByDiagnosis(Patient patient) {
        if (patients.isEmpty()) {
            return addPatient(patient);
        }


        String firstDiagnosis = patients.get(0).getDiagnosis();

        if (!patient.getDiagnosis().equals(firstDiagnosis)) {
            System.out.println("диагноз " + patient.getDiagnosis() +
                    "' не совпадает с диагнозом в палате '" + firstDiagnosis);
            return false;
        }

        return addPatient(patient);
    }

    public void printAllPatients() {
        System.out.println("пациенты в палате " + number  + type);
        if (patients.isEmpty()) {
            System.out.println("Палата пустая");
            return;
        }

        for (int i = 0; i < patients.size(); i++) {
            System.out.println((i + 1) + ". " + patients.get(i).getFullName() +
                    ", Возраст: " + patients.get(i).getAge() +
                    ", Диагноз: " + patients.get(i).getDiagnosis());
        }
        System.out.println("Всего: " + patients.size());
    }

}

