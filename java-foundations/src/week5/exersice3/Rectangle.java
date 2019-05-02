package week5.exersice3;

import week5.exercise1.Shape;

public class Rectangle implements Colored, Shape {
    @Override
    public String getColor() {
        return "blue";
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return getColor() + " " + getName();
    }

}
