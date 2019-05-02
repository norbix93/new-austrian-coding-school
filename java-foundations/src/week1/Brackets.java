package week1;

import java.util.Scanner;

public class Brackets {


    public static void main(String[] args) {

        System.out.println("Give me a name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();


        Integer length = name.length();
        String firstLetter = name.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();
        String lastLetter = name.substring(length - 1, length);
        lastLetter = lastLetter.toUpperCase();
        String middle = name.substring(1, length - 1);
        System.out.println(firstLetter + middle + lastLetter);


    }
}