package ru.homeWork3;

import java.time.LocalDate;
import java.time.Period;

/**
 * Абстрактный класс, представляющий сотрудника.
 */
public abstract class Employee implements Comparable<Employee> {

    protected String firstname; // Имя сотрудника
    protected String lastName; // Фамилия сотрудника
    protected String phone; // Номер телефона сотрудника

    protected int salary; // Зарплата сотрудника
    protected LocalDate birthday; // Дата рождения сотрудника

    /**
     * Конструктор класса Employee.
     *
     * @param firstname Имя сотрудника
     * @param lastName Фамилия сотрудника
     * @param phone Номер телефона сотрудника
     * @param salary Зарплата сотрудника
     * @param birthday Дата рождения сотрудника
     */
    public Employee(String firstname, String lastName, String phone, int salary, LocalDate birthday) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.phone = phone;
        this.salary = salary;
        this.birthday = birthday;
    }

    // Геттеры и сеттеры для полей класса Employee

    /**
     * Получить имя сотрудника.
     *
     * @return Имя сотрудника
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Установить имя сотрудника.
     *
     * @param firstname Имя сотрудника
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Получить фамилию сотрудника.
     *
     * @return Фамилия сотрудника
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Установить фамилию сотрудника.
     *
     * @param lastName Фамилия сотрудника
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Получить номер телефона сотрудника.
     *
     * @return Номер телефона сотрудника
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Установить номер телефона сотрудника.
     *
     * @param phone Номер телефона сотрудника
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Получить зарплату сотрудника.
     *
     * @return Зарплата сотрудника
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Установить зарплату сотрудника.
     *
     * @param salary Зарплата сотрудника
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Получить дату рождения сотрудника.
     *
     * @return Дата рождения сотрудника
     */
    public int getBirthday() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthday, currentDate);
        // Получаем количество лет из периода
        int years = period.getYears();
        return years ;
    }

    /**
     * Установить дату рождения сотрудника.
     *
     * @param birthday Дата рождения сотрудника
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * Метод для сравнения сотрудников по фамилии.
     *
     * @param o Сотрудник, с которым происходит сравнение
     * @return Результат сравнения по фамилии
     */
    @Override
    public int compareTo(Employee o) {
        return lastName.compareTo(o.lastName);
    }
}
