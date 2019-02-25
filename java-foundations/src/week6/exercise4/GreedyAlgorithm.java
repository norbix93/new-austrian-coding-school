package week6.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyAlgorithm {

    public List<Money> change(Integer amount) {
        List<Money> change = new ArrayList<>();
        List<Money> kindsOfCoins = coins();

        for (int i = 0; i < kindsOfCoins.size(); i++) {
            Money coin = kindsOfCoins.get(i);
            Integer divisor = coin.getValue();
            Integer numberOfCoins = amount / divisor;
            for (int j = 0; j < numberOfCoins; j++) {
                change.add(coin);

            }
            amount = amount % divisor;

        }
        return change;
    }

    public List<Money> coins() {
        List<Money> kindsOfCoins = Arrays.asList(new Cent50(), new Cent20(), new Cent10(), new Cent5(), new Cent2(), new Cent1());
        return kindsOfCoins;
    }


}


