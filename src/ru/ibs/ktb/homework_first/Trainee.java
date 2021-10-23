package ru.ibs.ktb.homework_first;

public class Trainee extends Employee {
    private String developmentLanguage;
    private int developmentExperience;
    private String urlGitHub;

    public Trainee(String name, String surname, int age, String gender, String mail, String developmentLanguage, int developmentExperience, String urlGitHub) {
        super(name, surname, age, gender, mail);
        this.developmentLanguage = developmentLanguage;
        this.developmentExperience = developmentExperience;
        this.urlGitHub = urlGitHub;
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

    public String getUrlGitHub() {
        return urlGitHub;
    }

    public void setUrlGitHub(String urlGitHub) {
        this.urlGitHub = urlGitHub;
    }

    public String sayTrainee(){
        return "Hello IBS";
    }

    @Override
    public boolean isNotWork() {
        return super.isNotWork();
    }
}
