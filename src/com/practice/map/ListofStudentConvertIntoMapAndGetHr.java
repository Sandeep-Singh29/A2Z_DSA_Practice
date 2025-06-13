package com.practice.map;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String name;
    String address;
    String department;

    Student(String name, String address, String department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}


public class ListofStudentConvertIntoMapAndGetHr {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("sandeep", "kanpur", "hr"));
        list.add(new Student("aman", "delhi", "hr"));
        list.add(new Student("rohit", "delhi", "developer"));
        list.add(new Student("vivek", "bihar", "testing"));


        Map<String, Student> collect = list.stream().collect(Collectors.toMap(Student::getName, student -> student));
        collect.entrySet().forEach(System.out::println);
        List<Student> collect1 = list.stream().filter(dep -> "hr".equals(dep.getDepartment())).collect(Collectors.toList());
        System.out.println(collect1);
        collect1.forEach(System.out::println);

    }
}
