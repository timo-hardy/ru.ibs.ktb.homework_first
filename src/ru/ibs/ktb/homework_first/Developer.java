package ru.ibs.ktb.homework_first;

public class Developer extends Employee{
    private String developmentLanguage;
    private int developmentExperience;

    public Developer(String name, String surname, int age, String gender, String mail,
                     String developmentLanguage, int developmentExperience) {
        super(name, surname, age, gender, mail);
        this.developmentLanguage = developmentLanguage;
        this.developmentExperience = developmentExperience;
    }

    public String getDevelopmentLanguage() {
        return developmentLanguage;
    }

    public void setDevelopmentLanguage(String developmentLanguage) {
        this.developmentLanguage = developmentLanguage;
    }

    public int getDevelopmentExperience() {
        return developmentExperience;
    }

    public void setDevelopmentExperience(int developmentExperience) {
        this.developmentExperience = developmentExperience;
    }
}
