package week5.reflectionw5;

import week5.exercise6.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {

    List<String> parts = new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);

    }

    @Override
    public String toString() {
        return "TvTable{parts=";
    }
}
