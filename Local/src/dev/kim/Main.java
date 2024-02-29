package dev.kim;


import dev.kim.domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kim" ,"Mouse", "11/12/2022");
        Employee e2 = new Employee("Kimmmm" ,"Mouse2", "11/12/2020");
        Employee e3 = new Employee("Kimiiii" ,"Mouse3", "11/12/2012");
        Employee e4 = new Employee("Kimwww" ,"Mouse4", "11/12/2021");
        Employee e5 = new Employee("Kim122" ,"Mouse5", "11/12/2010");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));

        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "year");

    }

    public static void printOrderedList(List<Employee> eList,String sortField ){
        int currentYear = LocalDate.now().getYear();

        class MyEmployee{
            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee (Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireDay().split("/")[2]);
                fullName = String.join(" ", containedEmployee.first(),containedEmployee.last());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName,yearsWorked);
            }
        }

        List< MyEmployee > list = new ArrayList<>();
        for (Employee employee:eList){
            list.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>(){

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
               if (sortField.equals("name")){
                   return o1.fullName.compareTo(o2.fullName);
               }
               return o1.yearsWorked - o2.yearsWorked;
            }
        };

        list.sort(comparator);
        for (MyEmployee myEmployee : list){
            System.out.println(myEmployee);
        }

    }

}
