package week10.exercise3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class smsFilter {

    private List<SMS> sms = readSMS();

    private List<SMS> readSMS() {
        return new smsReader().getSMS("week10/exercise3/sms.csv");
    }


    protected List<String> getMostFrequentWord() {
        return sms.stream()
                .filter(sms -> sms.getSender().equalsIgnoreCase("ham"))
                .map(word -> word.getText().split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " which appears " + e.getValue() + " times")
                .limit(1)
                .collect(Collectors.toList());
    }
    protected List<String> getMostFrequentLetter() {
        return sms.stream()
                .filter(sms -> sms.getSender().equalsIgnoreCase("ham"))
                .map(word -> word.getText().split(" "))
                .flatMap(Stream::of)
                .map(letter->letter.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " which appears " + e.getValue() + " times")
                .limit(1)
                .collect(Collectors.toList());
    }



    protected List<String> getRatioBetweenHamAndSpam() {
        return sms.stream()
                .map(e -> e.getSender())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> (e.getKey() + " | " + (e.getValue() * 100) / sms.size() ) + "%")
                .collect(Collectors.toList());

    }
    protected List<Integer> getLongestSpamMessage(){
        return sms.stream()
                .filter(e->e.getSender().equalsIgnoreCase("spam"))
                .map(e->e.getText())
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()))
                .entrySet()
                .stream()
                .sorted((element1,element2)-> element2.getKey().compareTo(element1.getKey()))
                .limit(1)
                .map(e->e.getValue().get(0).length())
                .collect(Collectors.toList());
    }
}




