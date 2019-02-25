package week9.exercise3;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me a word to cipher: ");
        String inputText = scanner.nextLine();
        System.out.println(caesar.cipher(inputText, 1));

    }
}
