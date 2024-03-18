package ru.homeWork3;

import java.util.Comparator;

/**
 * Класс компаратора для сортировки сотрудников по зарплате.
 */
public class SortTypeComarator implements Comparator<Employee> {

    /**
     * Сравнивает двух сотрудников по их зарплате.
     *
     * @param o1 Первый сотрудник
     * @param o2 Второй сотрудник
     * @return Отрицательное целое число, если зарплата первого сотрудника меньше зарплаты второго,
     *         нуль, если зарплаты равны, и положительное целое число, если зарплата первого сотрудника больше зарплаты второго.
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
