package week8.exercise4;

import java.util.function.Function;

public class PowerLevelScouter {

    public Integer scout(String name) {
        return calculate(name, n -> makeLettersASCII(n));
    }

    public Integer scoutEnhanced(String name) {
        return calculate(name, n -> makeLettersASCII(n.toLowerCase()));
    }

    private Integer makeLettersASCII(String name) {
        Integer sum = 0;
        for (int i = 0; i < name.length(); i++) {
            Character letter = name.charAt(i);
            Integer ascii = (int) letter;
            sum += ascii;
        }
        return sum;

    }

    private Integer calculate(String name, Function<String, Integer> transformation) {
        Integer apply = transformation.apply(name);
        return apply;
    }

}

