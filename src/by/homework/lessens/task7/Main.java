package by.homework.lessens.task7;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student(
//                1,
//                "ZAKHAR",
//                "MIKHED",
//                "JAVA",
//                2,
//                "QWERTY",
//                8
//        );
//        student.info();
//
//        System.out.println("-----------");
//
//        student.changeGroup("YTREWQ");
//
//        System.out.println("newгруппа: " + student.getGroup());
//        System.out.println("-----------");
//
//
//        student.ttt(7, "gjgj");
//        student.info();
//    }

        Student[] students = new Student[5];

        Student student1= new Student(1, "gfgf", "Тfgf", "ие", 1964, "123", 81);
        Student student2 = new Student(2, "gfgf", "Тfgf", "ие", 1964, "123", 70);
        Student student3 = new Student(3, "gfgf", "Тfgf", "ие", 1964, "123", 2);
        Student student4 = new Student(4, "gfgf", "Тfgf", "ие", 1964, "123", 252);
        Student student5 = new Student(5, "gfgf", "Тfgf", "ие", 1964, "123", 52);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        Student example = new Student();
        Student[] filtered = example.getStudents(students, 80);

        System.out.println("Студенты с оценкой выше 80:");


        for (Student s : filtered) {
            s.info();
        }
    }
}
