package ru.homeWork3;

import java.time.LocalDate;

/**
 * Класс, представляющий сотрудника - рабочего.
 */
public class Worker extends Employee {

    protected String task; // Задача сотрудника
    protected int level = 1; // Уровень сотрудника
    protected String post = "Worker"; // Должность сотрудника

    /**
     * Конструктор класса Worker.
     *
     * @param firstname Имя сотрудника
     * @param lastName Фамилия сотрудника
     * @param phone Номер телефона сотрудника
     * @param salary Зарплата сотрудника
     * @param birthday Дата рождения сотрудника
     * @param post Должность сотрудника
     */
    public Worker(String firstname, String lastName, String phone, int salary, LocalDate birthday, String post) {
        super(firstname, lastName, phone, salary, birthday);
        this.post = post;
    }

    /**
     * Получить текущую задачу.
     *
     * @return Текущая задача сотрудника
     */
    public String getTask() {
        return task;
    }

    /**
     * Установить задачу сотруднику.
     *
     * @param task Задача сотрудника
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * Получить уровень сотрудника.
     *
     * @return Уровень сотрудника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Переопределение метода toString для удобного вывода информации о рабочем.
     *
     * @return Строковое представление рабочего
     */
    @Override
    public String toString() {
        return post +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                ": task= '" + task + '\'' +
                ", level='" + level + '\'';
    }
}
