package module;

import enams.StudentProfile;
import enams.StudyProfile;

public class Statistics {
    private StudyProfile profile;
    private float avgExam;
    private int numberOfStudent;
    private int NumberOfUniversity;
    private String universityNames;

    public StudyProfile getStudentProfile() {
        return profile;
    }

    public float getAvgExam() {
        return avgExam;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public int getNumberOfUniversity() {
        return NumberOfUniversity;
    }

    public String getUniversityNames() {
        return universityNames;
    }

    public Statistics setStudyProfile(StudyProfile profile) {
        this.profile = profile;
        return this;
    }

    public Statistics setAvgExam(float avgExam) {
        this.avgExam = avgExam;
        return this;
    }

    public Statistics setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
        return this;
    }

    public Statistics setNumberOfUniversity(int numberOfUniversity) {
        NumberOfUniversity = numberOfUniversity;
        return this;
    }

    public Statistics setUniversityNames(String universityNames) {
        this.universityNames = universityNames;
        return this;
    }

}
