package week4.exercise8;

import java.util.Optional;
import java.util.Random;

public class AdvancedGiftApplication {

    public static void main(String[] args) {

        Optional<String> giftBox = Optional.empty();
        System.out.println("Gift: " + giftBox);
        Box box = new Box("present");
        giftBox = Optional.of(box.getBox());
        System.out.println("Gift: " + giftBox);
        isTheGiftBoxPresent();
    }

    public static void isTheGiftBoxPresent() {
        Optional<String> myGiftBox = getGiftBox();
        if (myGiftBox.isPresent()) {
            System.out.println("Yeah, I have got a " + myGiftBox.get() + ".");
        } else {
            System.out.println("Oh, where is my gift box?");
        }
    }

    private static Optional<String> getGiftBox() {
        if (isGiftBoxThere()) {
            return Optional.of("present");
        } else {
            return Optional.empty();
        }
    }

    private static boolean isGiftBoxThere() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
