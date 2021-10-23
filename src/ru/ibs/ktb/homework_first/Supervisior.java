package ru.ibs.ktb.homework_first;

public class Supervisior extends Employee {
    private String password;
    private int bonusSalary;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public Supervisior(String name, String surname, int age, String gender, String mail, String password, int bonusSalary) {
        super(name, surname, age, gender, mail);
        this.password = password;
        this.bonusSalary = bonusSalary;
    }

    public Supervisior(String name, String surname, int age, String gender, String mail) {
        super(name, surname, age, gender, mail);
    }
}
