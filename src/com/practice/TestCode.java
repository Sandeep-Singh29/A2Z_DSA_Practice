package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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


class TestCode {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("sandeep", "kanpur", "hr"));
        list.add(new Student("aman", "delhi", "hr"));
        list.add(new Student("rohit", "delhi", "developer"));
        list.add(new Student("vivek", "bihar", "testing"));


//        Map<String, Student> collect = list.stream().collect(Collectors.toMap(Student::getName, student -> student));
//        List<Student> collect1 = list.stream().filter(dep -> "hr".equals(dep.getDepartment())).collect(Collectors.toList());
//        System.out.println(collect1);
//        collect1.stream().forEach(System.out::println);

        String name = "happynewyear";

//        String collect = Arrays.stream(name.split("")).distinct().collect(Collectors.joining());
//        System.out.println(collect);

        Map<String, Long> collect = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Long> m : collect.entrySet()) {
            builder.append(m.getKey());
        }
        System.out.println(builder);
    }
}





