package by.homework.lessens.task13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupNumber;
    private List<Student> students;

    public Group() {
        this.students = new ArrayList<>();
    }

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber='" + groupNumber + '\'' +
                ", students=" + students +
                '}';
    }

    public void removeStudentsByMark(int mark) {
        System.out.println("Удаляем студентов с баллом ниже " + mark + " из группы " + groupNumber);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);

            if (student.getAverageGrade() < mark) {
                System.out.println("Удаляем: " + student.getName() + " " +
                        student.getSurname() + " (балл: " +
                        student.getAverageGrade() + ")");
                students.remove(i);
                i--;
            }


        }

    }
    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            System.out.println("В группе " + groupNumber + " меньше 2 студентов (" +
                    students.size() + "). Переводим в группу " + newGroup.getGroupNumber());

            newGroup.getStudents().addAll(students);

            students.clear();

            System.out.println("Переведено студентов: " + newGroup.getStudents().size());
        } else {
            System.out.println("В группе " + groupNumber + " хватает (" +
                    students.size() + "). Не переводим");
        }

    }
    public double getAverageGradeByGroup() {
        if (students.isEmpty()) {
            return 0;
        }
        double sum = 0;

        for (Student student : students) {
            sum += student.getAverageGrade();
        }
        return sum / students.size();
    }
}
