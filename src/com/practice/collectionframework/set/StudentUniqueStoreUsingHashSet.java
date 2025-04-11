package com.practice.collectionframework.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/**
 * Author: Sandeep Singh
 * Date: 05/04/25
 */

public class StudentUniqueStoreUsingHashSet {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(1,"sandeep"));
        listOfStudents.add(new Student(2,"sandeep"));
        listOfStudents.add(new Student(1,"sandeep"));
        listOfStudents.add(new Student(3,"kuldeep"));
        listOfStudents.add(new Student(4,"rishabh"));
        listOfStudents.add(new Student(4,"kuldeep"));

        HashSet<Student> setOfStudents = new HashSet<>(listOfStudents);
        setOfStudents.forEach(System.out::println);

    }

}


class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
