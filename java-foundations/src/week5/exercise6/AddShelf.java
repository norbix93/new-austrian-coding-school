package week5.exercise6;

public class AddShelf implements Step {
    @Override
    public void perform(Furniture furniture, Integer numberOfTimes) {
        Integer times = 1;
        while (times <= numberOfTimes) {
            times = times + 1;
            furniture.add("shelf");

        }
    }
}
