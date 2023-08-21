package org.example;

public enum StudyProfile {

    MEDICINE("Медецина"),
    PHYSICS("Физика"),
    ECOLOGY("Экология"),
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    JURISPRUDENCE("Юриспруденция"),
    BIOLOGY("Физика"),
    LINGUISTICS("Лингвист");



   private final String profileName;


    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
    public String getProfileName(){
        return this.profileName;
    }
}
