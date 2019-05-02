package week12.exercise3;

public class LambdaExpressions {

    interface NumericTest {
        boolean computeTest(int n);
    }
    interface WordTest {
        boolean wordTest(String word);
    }
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n%2) == 0;
        NumericTest isOdd = (n) -> (n%2) == 1;
        NumericTest isPrime = (n) -> (n/2)%2 != 0;
        WordTest isPalindrome = (word) -> (new StringBuilder(word).reverse().toString().equals(word));

        System.out.println("The number is prime: " + isPrime.computeTest(19));
        System.out.println("The number is even: "+ isEven.computeTest(22));
        System.out.println("The number is odd: "+ isOdd.computeTest(21));
        System.out.println("The word is palindrome: " + isPalindrome.wordTest("madam"));
    }
   }
