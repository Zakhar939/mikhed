package by.homework.lessens.task14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Otdelenie {
    private String name;
    private String description;
    private Set<Palata> palatas;

    public Otdelenie(String name, String description) {
        this.name = name;
        this.description = description;
        this.palatas = new HashSet<>();
    }

    public Set<Palata> getPalatas() {
        return palatas;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void addPalata(Palata palata) {
        palatas.add(palata);
    }

    public boolean removePalata(Palata palata) {
        return palatas.remove(palata);
    }

    public int getPalataCount() {
        return palatas.size();
    }

    public List<Patient> getAllPatients() {
        List<Patient> allPatients = new ArrayList<>();
        for (Palata palata : palatas) {
            allPatients.addAll(palata.getPatients());
        }
        return allPatients;
    }

    @Override
    public String toString() {
        return "отделение " +
                "называется " + name  +
                ", диагноз: " + description +
                ", палата " + palatas;
    }

    public void printMenAndWomenCount() {
        int menCount = 0;
        int womenCount = 0;

        for (Palata palata : palatas) {
            for (Patient patient : palata.getPatients()) {
                if (patient.getGender() == Gender.men) {
                    menCount++;
                } else if (patient.getGender() == Gender.women) {
                    womenCount++;
                }
            }
        }
        System.out.println("Мужчин: " + menCount);
        System.out.println("Женщин: " + womenCount);
        System.out.println("Всего: " + (menCount + womenCount));
    }
}
