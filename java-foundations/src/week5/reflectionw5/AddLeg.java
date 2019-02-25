package week5.reflectionw5;

import week5.exercise6.Furniture;
import week5.exercise6.Step;

public class AddLeg implements Step {
    @Override
    public void perform(Furniture furniture, Integer numberOfTimes) {
        Integer times = 1;
        while (times<=numberOfTimes){
            times = times+1;
            furniture.add("leg");

    }
}
}
