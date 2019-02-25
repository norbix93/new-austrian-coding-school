package week9.reflectionw9;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSummarizer {


    private List<Student> students = readStudents();

    private static List<Student> readStudents() {
        return new StudentReader().getStudents("week9/reflectionw9/students-performance.csv");
    }

    public Long getNumberOfFemaleStudents() {
        return students.stream()
                .filter(student -> student.getGender().equals("female"))
                .count();
    }

    public Long getNumberOfMaleStudents() {
        return students.stream()
                .filter(student -> student.getGender().equals("male"))
                .count();
    }

    public List<String> getParentalEducationLevelsSortedAlphabetically() {
        return students.stream()
                .map(student -> student.getLevelOfEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public Long getStudentsWithScoresHigherThan90() {
        return students.stream()
                .filter(student -> student.getMathScore() > 90)
                .filter(student -> student.getReadingScore() > 90)
                .filter(student -> student.getWritingScore() > 90)
                .count();
    }

    public List<String> getTopStudentsGender() {
        return students.stream()
                .filter(student -> student.getMathScore() == 100)
                .filter(student -> student.getReadingScore() == 100)
                .filter(student -> student.getWritingScore() == 100)
                .map(student -> student.getGender())
                .collect(Collectors.toList());

    }
}
