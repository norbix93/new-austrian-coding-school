package week10.exercise3;

public class smsApplication {

    public static void main(String[] args) {

        smsFilter filter = new smsFilter();
        System.out.println("Ham/spam ratio:" + filter.getRatioBetweenHamAndSpam());
        System.out.println("Most used ham word: "+ filter.getMostFrequentWord());
        System.out.println("Most frequent ham letter: "+ filter.getMostFrequentLetter());
        System.out.println("Longest spam message: "+ filter.getLongestSpamMessage());



    }
}
