package week10.exercise2;

public class StudentApplication {

    public static void main(String[] args) {
        StudentSummarizer summarizer = new StudentSummarizer();
        System.out.println(summarizer.getNumberOfAllEducationLevelAppearances());
        System.out.println("Parent education level appearances sorted top bottom:");
        summarizer.getNumberOfAllEducationLevelAppearances().forEach(System.out::println);
        System.out.println("Number of students with high parent education and lower scores than 60: "
                + summarizer.getStudentWithHighParentalEducationAndLowScores());
        System.out.println("Genders and average scores of the top four average score students:");
        summarizer.getTopStudents().forEach(System.out::println);
        System.out.println("Is there any student with a parent education " +
                "level of some high school that has at least 97 " +
                "in every topic? \n" + summarizer.hasAnyStudentWithParentalEducationLevelOfHighSchool97Points());
    }

}
