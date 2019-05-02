package week4.exercise4;

import java.util.Optional;

public class BasicGiftApplication {

    public static void main(String[] args) {

        Optional<String> giftBox = Optional.empty();
        System.out.println("The gift: " + giftBox);

        giftBox = Optional.of("Mouse.");
        System.out.println("The gift is: " + giftBox);

        System.out.println("Is there a present in the gift box? " + giftBox.isPresent());
    }
}

