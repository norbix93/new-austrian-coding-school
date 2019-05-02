package week1;

import java.util.Arrays;
import java.util.List;

public class PickBasketballEquipment {


    public static void main(String[] args) {

        List<String> clothes = Arrays.asList("blouse", "sneakers", "tie", "sandals", "jeans", "short pants", "tank",
                "blazer");
        String tank = clothes.get(6);
        String shortPants = clothes.get(5);
        String sneakers = clothes.get(1);

        System.out.println("Hansel will wear a " + tank + ", " + shortPants + " and " + sneakers);

    }
}