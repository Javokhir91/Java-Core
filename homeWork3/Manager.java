package ru.homeWork3;

import java.time.LocalDate;

/**
 * Класс, представляющий сотрудника - менеджера.
 */
public class Manager extends Employee {

    private String post = "Manager"; // Должность
    private String task; // Задача
    private int level; // Уровень

    /**
     * Конструктор класса Manager.
     *
     * @param firstname Имя сотрудника
     * @param lastName Фамилия сотрудника
     * @param phone Номер телефона сотрудника
     * @param salary Зарплата сотрудника
     * @param birthday Дата рождения сотрудника
     * @param post Должность сотрудника
     */
    public Manager(String firstname, String lastName, String phone, int salary, LocalDate birthday, String post) {
        super(firstname, lastName, phone, salary, birthday);
        this.post = post;
    }

    /**
     * Метод для выплаты бонуса сотрудникам.
     *
     * @param employees Массив сотрудников
     * @param bonus Размер бонуса
     */
    public static void Bonus(Employee[] employees, int bonus) {
        for (Employee employee : employees) {
            if (employee instanceof Worker) {
                if (employee.getBirthday() < 45) { // Проверка возраста
                    employee.setSalary(employee.getSalary() + bonus); // Добавление бонуса к зарплате
                }
            }
        }
    }

    /**
     * Метод для назначения задачи сотруднику.
     *
     * @param employees Массив сотрудников
     * @param lastName Фамилия сотрудника
     * @param task Задача
     * @param level Уровень задачи
     */
    public static void Task(Employee[] employees, String lastName, String task, int level) {
        boolean flag = false;
        for (Employee employee : employees) {
            if (employee instanceof Worker) {
                if (employee.getLastName().equals(lastName) && ((Worker) employee).getLevel() == level) {
                    ((Worker) employee).setTask(task);
                    flag = true;
                }
            }
        }
        if (!flag) { // Если не найден подходящий сотрудник
            for (Employee employee : employees) {
                if (employee instanceof Manager) {
                    ((Manager) employee).setTask(task); // Назначение задачи менеджеру
                    break;
                }
            }
        }
    }

    /**
     * Получить текущую задачу.
     *
     * @return Текущая задача
     */
    public String getTask() {
        return task;
    }

    /**
     * Установить задачу.
     *
     * @param task Задача
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * Получить уровень менеджера.
     *
     * @return Уровень менеджера
     */
    public int getLevel() {
        return level;
    }

    /**
     * Переопределение метода toString для удобного вывода информации о менеджере.
     *
     * @return Строковое представление менеджера
     */
    @Override
    public String toString() {
        return post +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                ": task= " + task;
    }
}
