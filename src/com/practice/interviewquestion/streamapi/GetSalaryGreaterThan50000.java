package com.practice.interviewquestion.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 12/07/25
 */

public class GetSalaryGreaterThan50000 {
    static class Employee {
        private String name;
        private double salary;
        private int age;
        private int department;

        public Employee(String name, double salary, int age, int department) {
            this.name = name;
            this.salary = salary;
            this.age = age;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getDepartment() {
            return department;
        }

        public void setDepartment(int department) {
            this.department = department;
        }
    }


    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Amit", 60000, 30, 1),
                new Employee("Sandeep", 60000, 30, 1),
                new Employee("Neha", 40000, 25, 2),
                new Employee("Raj", 70000, 30, 1),
                new Employee("Sneha", 52000, 28, 2),
                new Employee("Vikram", 48000, 30, 3)
        );

        // Filter salary > 50000 and group by age
        Map<Double, List<Employee>> result = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .collect(Collectors.groupingBy(Employee::getSalary));

        result.forEach((salary, empList) -> {
            System.out.println("salary: " + salary);
            empList.forEach(e -> System.out.println(" , EmployeeName: " + e.getName()));
        });
    }
}

