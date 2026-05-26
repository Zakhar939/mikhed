package by.homework.lessens.task7;

public class Student {

    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageGrade;

    public Student(int id, String name, String surname, String faculty, int course, String group, int averageGrade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageGrade = averageGrade;

    }

    public Student() {

    }

    public void info() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("faculty: " + faculty);
        System.out.println("course: " + course);
        System.out.println("group: " + group);
        System.out.println("averageGrade: " + averageGrade);
    }
    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }
    public String getGroup() {
        return this.group;
    }
    public void ttt(int newAverageGrade, String newGroup) {
        this.averageGrade = newAverageGrade;
        this.group = newGroup;
    }


    public Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student s : students) {
            if (s != null && s.averageGrade > mark) {
                count++;
            }
        }

        Student[] result = new Student[count];

        int index = 0;
        for (Student s : students) {
            if (s != null && s.averageGrade > mark) {
                result[index] = s;
                index++;
            }
        }

        return result;
    }
}