package ru.ibs.ktb.homework_first;

public abstract class Employee {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String mail;

    public Employee(String name, String surname, int age, String gender, String mail) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isWork(){
        return true;
    }

    public boolean isNotWork(){
        return true;
    }
}
