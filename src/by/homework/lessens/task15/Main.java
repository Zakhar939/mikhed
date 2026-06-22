package by.homework.lessens.task15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static void raiseSalary(Map<Employee, String> employees, int amount) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee emp = entry.getKey();
            String profession = entry.getValue();

            if (profession.equals("Айтишник")) {
                emp.setSalary(emp.getSalary() + amount);
            }
        }
    }

    private static Map<String, Collection<Employee>> invertMap(Map<Employee, String> employees) {
        Map<String, Collection<Employee>> invertedMap = new HashMap<>();

        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee emp = entry.getKey();
            String profession = entry.getValue();

            if (!invertedMap.containsKey(profession)) {
                invertedMap.put(profession, new ArrayList<Employee>());
            }

            invertedMap.get(profession).add(emp);
        }

        return invertedMap;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Иван", "Иванов", 20, 11.11);
        Employee emp2 = new Employee(2,"Пётр", "Первый", 24, 22.22);
        Employee emp3 = new Employee(3,"Захар", "Михед", 26, 33.33);
        Employee emp4 = new Employee(4,"Максим", "Матусвич", 30, 44.44);
        Employee emp5 = new Employee(5,"Степан", "Сидоров", 55, 55.55);
        Employee emp6 = new Employee(6,"Толя", "Петров", 44, 66.66);
        Employee emp7 = new Employee(7,"Лера", "Большова", 76, 77.77);
        Employee emp8 = new Employee(8,"Катя", "Иванова", 12, 88.88);

        Map<Employee, String> employees = new HashMap<>();

        employees.put(emp1, "Слесарь");
        employees.put(emp2, "Айтишник");
        employees.put(emp3, "Айтишник");
        employees.put(emp4, "Слесарь");
        employees.put(emp5, "Учитель");
        employees.put(emp6, "Айтишник");
        employees.put(emp7, "Уборщица");
        employees.put(emp8, "Уборщица");

        raiseSalary(employees, 2026);
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee emp = entry.getKey();
            String profession = entry.getValue();
            System.out.println(emp.getName() + " (" + profession + ") - " + emp.getSalary());
        }
        // 1.6*
        Map<String, Collection<Employee>> invertedMap = invertMap(employees);
        for (Map.Entry<String, Collection<Employee>> entry : invertedMap.entrySet()) {
            String profession = entry.getKey();
            Collection<Employee> empList = entry.getValue();

            System.out.println(profession + " " + empList.size() + " сотрудник ");
            for (Employee emp : empList) {
                System.out.println(emp.getName() + " зарплата: " + emp.getSalary());
            }
        }
    }
}


