package com.practice.leetcode.priorityqueue;

/**
 * Author: SANDEEP
 * Date: 08-10-2024
 */



/*
Comparable<Student> Ka use hamsa Class main implement kar
ka hi hota hai isma hum
kabhi Array.sort() main implementation nahi da sakta
*/

// Using implement Comprable implement and @override a compareTo()
class Student /*implements Comparable<Student>*/ {
    int roll;
    String name;
    int age;

    Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    /*      Sorting By Roll NUmber

    @Override
    public int compareTo(Student stu) {
        return this.roll - stu.roll;
    }
    */


   /*      Sorting By Name
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
    */
}

public class CustomComprator {

    public static void printStu(Student[] st) {
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }
    }

    public static void main(String[] args) {
        Student st[] = new Student[5];
        st[0] = new Student(8, "sandeep", 26);
        st[1] = new Student(4, "kuldeep", 21);
        st[2] = new Student(1, "rishabh", 18);
        st[3] = new Student(10, "vivek", 29);
        st[4] = new Student(7, "aman", 25);
        printStu(st);
        //Arrays.sort(st);  Using this for a Comprable sort
    /*
      Arrays.sort(st, new Comparator<Student>() {            // Way 1 to use Comprator
            @Override
            public int compare(Student s1, Student s2) {
                return s1.roll - s2.roll;
            }
        });
    */
        //Sorting By roll Number
        //Arrays.sort(st, (s1, s2) -> s1.roll - s2.roll);  // Way 2 to use Compartor usingg Lamda

        // Sorting using Name     Way >>1
        // Arrays.sort(st,(s1,s2)-> s1.name.compareTo(s2.name));

        /*
        Arrays.sort(st, new Comparator<Student>() {            // Way 2 Soting using Name
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        */

        System.out.println("After Sort");
        printStu(st);
    }

}