package week4.evaluationw4;

import week4.exercise9.FileReader;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobodogApplication {

    public static void main(String[] args) {

        FileReader reader = new FileReader();
        List<String> lines = reader.getLines("week4/evaluationw4/robodog.txt");
        for (String line : lines) {
            List<String> newLine = Arrays.asList(line.replace("!", ""));
            Set<String> commands = new HashSet<>(newLine);
            System.out.println(commands);
        }
    }
}

