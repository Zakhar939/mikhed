package by.homework.lessens.task14;

public class Main {
    public static void main(String[] args) {

        Otdelenie cardiology = new Otdelenie("кардио", "сердечные заболевания");
        Otdelenie neurology = new Otdelenie("нервы", "нервная система");

        Palata menPalata1 = new Palata("101", PalataType.men);
        Palata menPalata2 = new Palata("102", PalataType.men);
        Palata womenPalata1 = new Palata("201", PalataType.women);
        Palata womenPalata2 = new Palata("202", PalataType.women);

        cardiology.addPalata(menPalata1);
        cardiology.addPalata(womenPalata1);
        neurology.addPalata(menPalata2);
        neurology.addPalata(womenPalata2);

        Patient patient1 = new Patient(1, "саша", "петров", "головная боль", 33, Gender.men);
        Patient patient2 = new Patient(2, "петя", "сидоров", "зуб", 56, Gender.men);
        Patient patient3 = new Patient(3, "маша", "иванова", "сердце", 78, Gender.women);
        Patient patient4 = new Patient(4, "даша", "полякова", "почки", 55, Gender.women);

        menPalata1.addPatient(patient1);
        menPalata2.addPatient(patient2);
        womenPalata1.addPatient(patient3);
        womenPalata2.addPatient(patient4);

        System.out.println(cardiology);
        System.out.println(neurology);

        System.out.println("------------");

        Patient duplicatePatient = new Patient(1, "гена", "алексеев", "печень", 33, Gender.men);
        menPalata1.addPatient(duplicatePatient);

        cardiology.printMenAndWomenCount();
        neurology.printMenAndWomenCount();
        System.out.println("------------");

        menPalata2.addPatientByDiagnosis(patient1);
        menPalata2.addPatientByDiagnosis(patient2);

        Patient patient5 = new Patient(5, "алексей", "кузнецов", "сердце", 45, Gender.men);
        // гена добавится в 101 палату
        menPalata1.addPatientByDiagnosis(patient5);

        System.out.println("------------");

        menPalata1.printAllPatients();
        womenPalata2.printAllPatients();
        menPalata2.printAllPatients();
    }
}


