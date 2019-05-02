package week7.exercise3;

import java.util.List;

public class Numbers {

    public Integer getBiggest(List<Integer> numbers) {
        Integer biggest = numbers.get(0);
        for (int times = 0; times < numbers.size(); times++)
            for (Integer number : numbers) {
                if (biggest < number) {
                    biggest = number;
                }

            }
        return biggest;

    }

    public Integer getSmallest(List<Integer> numbers) {
        Integer smallest = numbers.get(0);
        for (int times = 0; times < numbers.size(); times++)
            for (Integer number : numbers) {
                if (smallest > number) {
                    smallest = number;
                }
            }
        return smallest;
    }

}
