package com.practice.interviewquestion.streamapi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDataForListDifferntType {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

//        Iterate a Employe    [1]

        //employeeList.stream().forEach(System.out::println);

// How to sort employee by age   [2]

        //employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);

// how many Male and Female in organization   [3]

        //Map<String, Long> malaAndFemaleEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        //System.out.println(malaAndFemaleEmployee);

// Total Employee    [4]

        // long count = employeeList.stream().count();
        //System.out.println(count);

// Print all department  in organisation  2 @ways   [5]

        //employeeList.stream().map(e-> e.getDepartment()).distinct().forEach(System.out::println);
        //employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

//  What is the average age of male and female employees?  [6]

        //Map<String, Double> avergeAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        //System.out.println(avergeAge);

//  Get the details of highest paid employee in the organization?   [7]

        // Employee higestSalary = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get();
        //System.out.println(higestSalary);
        //Employee higestSalary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
        //System.out.println(higestSalary);

// Get the names of all employees who have joined after 2015?    [8]

         //List<Employee> afterJoin2015 = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).collect(Collectors.toList());
        //System.out.println(afterJoin2015);  all Employee Get
        // afterJoin2015.forEach(System.out::println);
        //afterJoin2015.stream().map(Employee::getName).forEach(System.out::println);

        // only employee Name get
        //employeeList.stream().filter(e-> e.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);


//  Count the number of employees in each department?  [9]


        //Map<String, Long> numberOfEmployeeinDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        //numberOfEmployeeinDept.entrySet().forEach(e-> {
        //    System.out.println(e.getKey() +" : "+e.getValue()); });


//        What is the average salary of each department?  [10]

        //Map<String, Double> averagesalary = employeeList.stream()
        //        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        //averagesalary.entrySet().forEach(e->{
          //  System.out.println(e.getKey()+" : "+e.getValue()); });
        //System.out.println(averagesalary);

//   Get the details of youngest male employee in the product development department?  [11]

        //Employee yongestEmoloyye = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).filter(e -> e.getDepartment().contains("Product")).findFirst().get();
        //System.out.println(yongestEmoloyye);
       /*
       Employee employee = employeeList.stream()
                .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                .min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(employee);
        */


//        Who has the most working experience in the organization?  [12]

        //Employee mostExperience = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get();
        //System.out.println(mostExperience);



//   How many male and female employees are there in the sales and marketing team?   [13]

        //Map<String, Long> malesAndFemaleInSales = employeeList.stream().filter(e -> e.getDepartment().contains("Sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        //System.out.println(malesAndFemaleInSales);


//   What is the average salary of male and female employees?      [14]


        //Map<String, Double> averageSalaryMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        //System.out.println(averageSalaryMaleAndFemale);


//   List down the names of all employees in each department?   [15] >> GOOD

       /*
        Map<String, List<Employee>> allDeptDetails = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        allDeptDetails.entrySet().forEach(e->{
            System.out.println(e.getKey());
            e.getValue().stream().forEach(System.out::println);
        });
       */


//  What is the average salary and total salary of the whole organization?   [16]

        //DoubleSummaryStatistics summarizedSalary = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        //System.out.println(summarizedSalary.getAverage());
        //System.out.println(summarizedSalary.getSum());
        //Double collect = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        //System.out.println(collect);
        //double sum = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        //double average = employeeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        //System.out.println(sum +"  ::  "+average);
        //employeeList.stream().mapToDouble(Employee::getSalary).average().ifPresent(System.out::println);


//  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.  [17]

       /* Map<Boolean, List<Employee>> collect = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() <= 25));
        collect.entrySet().forEach(e->{
            e.getValue().stream().filter(e1-> e1.getAge() <= 25).forEach(System.out::println);
        });*/
        /*
        Map<Boolean, List<Employee>> ageWise = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() <= 25));
        List<Employee> lessThan25 = ageWise.get(true);
        List<Employee> greaterThan25 = ageWise.get(false);
        lessThan25.forEach(System.out::println);
        greaterThan25.forEach(System.out::println);
        */

       // Sorting by Multiple variable
        /*
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getAge)
                .thenComparing(Employee::getId)
                ).forEach(e-> {
            System.out.println(e.getName()+" : "+e.getSalary()+" : "+e.getAge()+" : "+e.getId());
        });
        */

    }

}
