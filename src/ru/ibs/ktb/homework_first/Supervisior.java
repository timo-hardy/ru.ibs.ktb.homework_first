package ru.ibs.ktb.homework_first;

public class Supervisior extends Employee {
    private String password;
    private int salary;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Supervisior(String name, String surname, int age, String gender, String mail, String password, int salary) {
        super(name, surname, age, gender, mail);
        this.password = password;
        this.salary = salary;
    }

    public Supervisior(String name, String surname, int age, String gender, String mail) {
        super(name, surname, age, gender, mail);
    }
}
