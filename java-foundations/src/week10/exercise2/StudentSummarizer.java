package week10.exercise2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSummarizer {

    private List<Student> students = readStudents();

    public static List<Student> readStudents() {
        return new StudentReader().getStudents("week10/exercise2/students-performance.csv");
    }

    /*protected Long getNumberOfParentalEducationAppearances() {
        return students.stream()
                .map(student -> student.getParentalLevelOfEducation())
                .count();*/


    protected List<String> getNumberOfAllEducationLevelAppearances() {
        return students.stream()
                .map(student -> student.getParentalLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
    }


    protected Long getStudentWithHighParentalEducationAndLowScores() {
        return students.stream()
                .filter(student -> student.getParentalLevelOfEducation().contains("master's"))
                .filter(student -> student.getMathScore() < 60)
                .filter(student -> student.getReadingScore() < 60)
                .filter(student -> student.getWritingScore() < 60)
                .count();

    }

    protected List<String> getTopStudents() {
        return students.stream()
                .map(student -> (student.getMathScore() + student.getWritingScore() + student.getReadingScore()) / 3
                        + " | " + student.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .collect(Collectors.toList());
    }

    protected boolean hasAnyStudentWithParentalEducationLevelOfHighSchool97Points() {
        return students.stream()
                .filter(student -> student.getParentalLevelOfEducation().equals("some high school"))
                .anyMatch(student -> student.getMathScore() >= 97
                        && student.getReadingScore() >= 97
                        && student.getWritingScore() >= 97);
    }
}




