package by.homework.lessens.task15;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int age;
    private double salary;

    public Employee(int id, String name, String surname, int age, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getName(){
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Сотрудник" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", surname: " + surname + '\'' +
                ", age: " + age +
                ", salary: " + salary;
    }
}
