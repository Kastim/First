package com.company;
import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 * Публичный класс Department – подразделения некоторой организации.
 * Класс не хранит явным образом номер подразделения и имя организации, частью которой является
 */
public class Department {
     public static void main(String[] Args) {

        // Приватные поля класса (доступные только внутри класса):
        // Разные подразделения имеют разные имена.
        String name;
        //Класс хранит явным образом массив своих работников.
        ArrayList employees;

        // Конструктор может принимать имя и массив работников.
        //public Department(){
        }
        //public Department(String name, ArrayList employees){
          //  this.name = name;
            //this.employees = employees;

        Department department0 = new Department();
        department0.name = "Production";


        //Публичный класс Employee - работник некоторой организации.
        //Класс не хранит явным образом номер или имя подразделения и организации, в которой работает работник.
       class Employee {

            // Каждый работник характеризуется фамилией.
            private String lastName;
            // Каждый работник получает определенное жалование.
            private double salary;
            private int workingHours;

            // Публичные методы и конструкторы (доступные всем другим классам):
            public Employee() {
            }
            // Конструктор может принимать фамилию,зп, часы.
            public Employee(String lastName, double salary, int workingHours) {
                this.lastName = lastName;
                this.salary = salary;
                this.workingHours = workingHours;
            }
                public double getSalary() {
                    return salary;
            }
                public double getTotalSalary() {
                    return salary * workingHours;
            }
                Employee employee0 = new Employee("Ivanov",20,50);
                Employee employee1 = new Employee("Petrov",10,50);
                Employee employee2 = new Employee("Sidorov",10,70);

                ArrayList <Employee> employees = new ArrayList <>();
                ArrayList employees.add(employee0);
                employees.add(employee1);

            }
        }
    }
}