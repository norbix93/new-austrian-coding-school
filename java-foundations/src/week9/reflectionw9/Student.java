package week9.reflectionw9;

public class Student {

    private String gender;
    private String levelOfEducation;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;

    public Student(String gender, String levelOfEducation, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.levelOfEducation = levelOfEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }
}
