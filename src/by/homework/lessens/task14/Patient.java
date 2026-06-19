package by.homework.lessens.task14;

import java.util.Objects;

public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(int id, String firstName, String lastName, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }
    public String getFullName() {
        return lastName + " " + firstName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Patient patient = (Patient) object;
        return age == patient.age &&
                Objects.equals(firstName, patient.firstName) &&
                Objects.equals(lastName, patient.lastName) &&
                Objects.equals(diagnosis, patient.diagnosis) &&
                gender == patient.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, diagnosis, age, gender);
    }

    @Override
    public String toString() {
        return "пациент " +
                "id: " + id +
                " ,имя: " + firstName +
                ", фамилия: " + lastName +
                ", диагноз: " + diagnosis  +
                ", лет: " + age +
                ", пол: " + gender;
    }

}
