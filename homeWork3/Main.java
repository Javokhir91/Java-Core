package ru.homeWork3;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Создание экземпляров классов Manager и Worker инициализируется
        // закомментированными строками ниже. Их исключение обусловлено тем, что
        // эти объекты не используются в дальнейшем коде.

//        Manager artem =
//                new Manager("Artem", "Nesterov", "+7777777", 900000,
//                        LocalDate.of(2020,12,12), "Manager");

//        Worker javokhir =
//                new Worker("Javokhior", "Rakhmatov", "+8888888", 50000,
//                        LocalDate.of(2021, 11, 11), "Worker");
//
//        Worker kristina =
//                new Worker("Kristina", "Bazil", "+9999999", 50000,
//                        LocalDate.of(2021, 11, 11), "Worker");
//
//        Worker anna =
//                new Worker("Anna", "Kudryashka", "+6666666", 50000,
//                        LocalDate.of(2021, 11, 11), "Worker");
//
//        Worker sasha =
//                new Worker("Aleksandr", "Brunov", "+5555555", 50000,
//                        LocalDate.of(2021, 11, 11), "Worker");

        // Массив сотрудников, включая менеджеров и рабочих.
        Employee[] employees = {
                new Manager("Artem", "Nesterov", "+7777777", 900000,
                        LocalDate.of(1971,12,12), "Manager"),
//                new Worker("Javokhior", "Rakhmatov", "+8888888", 50000,
//                        LocalDate.of(2021, 11, 11), "Worker"),
                new Worker("Kristina", "Bazil", "+9999999", 30000,
                        LocalDate.of(1991, 11, 11), "Worker"),
                new Worker("Anna", "Kudryashka", "+6666666", 50000,
                        LocalDate.of(1992, 11, 11), "Worker"),
                new Worker("Aleksandr", "Brunov", "+5555555", 50000,
                        LocalDate.of(1972, 11, 11), "Worker")
        };


        System.out.println("*".repeat(10) + "--Сортировка--" + "*".repeat(10));

        // Сортировка массива сотрудников.
        Arrays.sort(employees);

        // Создание компаратора для сортировки сотрудников по типу.
        Comparator<Employee> employeeComparator = new SortTypeComarator();

        // Сортировка с использованием компаратора.
        Arrays.stream(employees).sorted(employeeComparator);

        // Вывод отсортированных сотрудников.
        Arrays.asList(employees).forEach(System.out::println);

        // Вывод разделителя после сортировки.
        System.out.println("*".repeat(100));

        // Выплата бонуса рабочим.
        Manager.Bonus(employees, 5000);

        // Вывод обновленной информации о сотрудниках после выплаты бонусов.
        Arrays.asList(employees).forEach(System.out::println);


        System.out.println("*".repeat(100));

        // Присвоение задачи сотруднику по фамилии.
        Manager.Task(employees, "Kudryashka", "Zadacha", 1);

        // Вывод обновленной информации о сотрудниках после присвоения задачи.
        Arrays.asList(employees).forEach(System.out::println);


        System.out.println("*".repeat(100));

        Arrays.asList(employees).forEach(employee -> System.out.println(employee.getBirthday()));
    }
}
