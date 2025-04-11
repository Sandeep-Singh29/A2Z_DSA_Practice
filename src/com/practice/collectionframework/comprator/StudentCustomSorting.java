package com.practice.collectionframework.comprator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 08/04/25
 */

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", gpa=" + gpa;
    }
}


public class StudentCustomSorting {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("sandeep", 4.2));
        studentList.add(new Student("kuldeep", 3.2));
        studentList.add(new Student("aman", 2.2));
        studentList.add(new Student("vivek", 5.2));

        //Iterate using steam
        studentList.forEach(System.out::println);

        //        soring using Name
//        studentList.sort((s1,s2)-> s1.getName().length()-s2.getName().length());
//        studentList.sort(Comparator.comparing(Student::getName));  // other way
        //        soring using GPA



      /*  way 1
        studentList.sort((s1, s2) -> { // this sorting descending wise
            if (s2.getGpa() - s1.getGpa() > 0) {
                return 1;
            } else if (s2.getGpa() - s1.getGpa() < 0) {
                return -1;
            } else {
                return 0;
            }
        });
        */

//        way 2
        Comparator<Student> comparing = Comparator.comparing(Student::getGpa);
//        studentList.sort(comparing);  // for ascending order
//        studentList.sort(comparing.reversed()); for descending order
        studentList.sort(Comparator.comparing(Student::getGpa).reversed());
        System.out.println("After Sort by Name");
        studentList.forEach(System.out::println);

    }
}
