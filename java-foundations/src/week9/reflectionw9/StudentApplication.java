package week9.reflectionw9;


public class StudentApplication {


    public static void main(String[] args) {
        StudentSummarizer summarizer = new StudentSummarizer();
        System.out.println("Number of female students: " + summarizer.getNumberOfFemaleStudents());
        System.out.println("Number of male students " + summarizer.getNumberOfMaleStudents());
        System.out.println("Parental education level sorted alphabetically: "
                +summarizer.getParentalEducationLevelsSortedAlphabetically());
        System.out.println("Number of students with scores higher than 90: "+summarizer.getStudentsWithScoresHigherThan90());
        System.out.println("Number of students with scores equal to 100: "+summarizer.getTopStudentsGender().size());
        System.out.println("Gender of these students are: " + summarizer.getTopStudentsGender());

    }
}
