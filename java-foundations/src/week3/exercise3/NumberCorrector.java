package week3.exercise3;

public class NumberCorrector {



    public Integer correct(Double doubleNumber){
        Integer intValue = (int) Math.round(doubleNumber);
        System.out.println(Math.abs(intValue));
        return Math.abs(intValue);
    }

}
