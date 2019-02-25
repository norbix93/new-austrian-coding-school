package week8.robomime;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpecialMoves {

    protected Set getSpecialMoves() {
        Set<String> tricks = new HashSet<>();
        FileReader reader = new FileReader();
        Sensor sensor = new Sensor();
        List<String> lines = reader.getLines("week8/robomime/robomime.txt");
        for (String line : lines) {
            String modifiedLine = sensor.decryptTricks(line);
            tricks.add(modifiedLine);
        }
        return tricks;
    }

    protected Integer getNumberOfTricks() {
        getSpecialMoves();
        Integer times = 0;
        for (int i = 0; i < getSpecialMoves().size(); i++) {
            times = times + 1;
        }
        return times;
    }
}
