package ru.ibs.ktb.homework_first;

public class Developer extends Employee {
    private String developmentLanguage;
    private int developmentExperience;
    private String projects;

    public Developer(String name, String surname, int age, String gender, String mail,
                     String developmentLanguage, int developmentExperience, String projects) {
        super(name, surname, age, gender, mail);
        this.developmentLanguage = developmentLanguage;
        this.developmentExperience = developmentExperience;
        this.projects = projects;
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

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public String sayDeveloper() {
        return "Hello";
    }

    @Override
    public boolean isWork() {
        return super.isWork();
    }
}
