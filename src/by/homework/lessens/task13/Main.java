package by.homework.lessens.task13;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Петров", "15.05.2000", "Минск", 3.1);
        Student student2 = new Student("Анна", "Сидорова", "20.08.2001", "Москва", 4.3);
        Student student3 = new Student("Елена", "Соколова", "05.12.2002", "Гродно", 3.9);

        Group group1 = new Group("33");
        Group group2 = new Group("55");
        Group group3 = new Group("66");

        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);

        Faculty faculty = new Faculty("IT");
        faculty.addGroup(group1);
        faculty.addGroup(group2);
        faculty.addGroup(group3);


        group1.removeStudentsByMark(4);

        for (Student s : group1.getStudents()) {
            System.out.println("  - " + s.getName() + " " + s.getSurname() +
                    ", балл: " + s.getAverageGrade());
        }

        group1.transferToGroup(group2);

        System.out.println("Группа 33: " + group1.getStudents().size() + " студентов");
        System.out.println("Группа 55: " + group2.getStudents().size() + " студентов");
        System.out.println("Группа 66: " + group3.getStudents().size() + " студентов");
        System.out.println("----------------");

        System.out.println("Группа 55: " + group2.getAverageGradeByGroup());

    }

}