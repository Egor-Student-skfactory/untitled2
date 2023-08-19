package org.example;

public enum StudyProfile {

    MEDICINE("Медецина"),
    PHYSICS("Физика"),
    ECOLOGY("Экология"),
    BIOLOGY("Физика");



   private final String profileName;


    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
    public String getProfileName(){
        return this.profileName;
    }
}
