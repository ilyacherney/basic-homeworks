package ru.otus.ilyacherney.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        //1
        System.out.println(method1(2,12));

        //2
        List<Integer> list2= new ArrayList<>();
        list2.add(2);
        list2.add(6);
        list2.add(8);
        list2.add(1);
        list2.add(0);
        System.out.println(method2((ArrayList<Integer>) list2));

        //3
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        System.out.println(list3);
        method3(5, list3);
        System.out.println(list3);

        //4
        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        System.out.println(list4);
        method4(5, list4);
        System.out.println(list4);

        //5
        Employee employee1 = new Employee("Ilya", 26);
        Employee employee2 = new Employee("Julia", 23);
        Employee employee3 = new Employee("Andrew", 36);
        Employee employee4 = new Employee("Olya", 18);
        Employee employee5 = new Employee("Nadya", 23);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        System.out.println(method5(employees));

        //6
        System.out.println(method6(employees, 23));

        //7
        System.out.println(method7(employees, 24));

        //8
        System.out.println(method8(employees));
    }

    public static List<Integer> method1(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    public static int method2 (ArrayList<Integer> inputNumbers){
        int outputNumbers = 0;
        for (int i = 0; i <= inputNumbers.size()-1; i++) {
            if (inputNumbers.get(i) > 5) {
                outputNumbers += inputNumbers.get(i);
            }
        }
        return outputNumbers;
    }

    public static void method3 (int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    public static void method4 (int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1);
        }
    }

    public static List<String> method5(List<Employee> employees){
        List<String> employeesNames = new ArrayList<>();
        for (Employee employee : employees) {
            employeesNames.add(employee.getName());
        }
        return employeesNames;
    }

    public static List<Employee> method6(List<Employee> employees, int minAge) {
        List<Employee> outputEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                outputEmployees.add(employee);
            }
        }
        return outputEmployees;
    }

    public static boolean method7(List<Employee> employees, int minAverageAge) {
        int averageAge;
        int agesSum = 0;
        int counter = 0;

        for (Employee employee : employees) {
            agesSum += employee.getAge();
            counter++;
        }

        averageAge = agesSum / counter;
        System.out.println("averageAge: " + averageAge);

        if (averageAge > minAverageAge) return true;
        else return false;
    }

    public static Employee method8(List<Employee> employees) {
        Employee yongestEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < yongestEmployee.getAge())
                yongestEmployee = employee;
        }
        return yongestEmployee;
    }
}
