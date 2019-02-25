package week7.exercise5;

public class PalindromeController {

    public Boolean isPalindrome(String word) {
        word.trim();
        if (word.length() < 2) {
            return false;
        }
        Integer left = 0;
        Integer right = word.length() - 1;
        while (left < right) {
            Character leftLetter = word.charAt(0);
            Character rightLetter = word.charAt(word.length() - 1);
            if (!leftLetter.equals(rightLetter)) {
                return false;
            } else
                left = left + 1;
            right = right - 1;
        }
        return true;
    }
}
