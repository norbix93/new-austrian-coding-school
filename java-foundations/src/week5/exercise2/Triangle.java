package week5.exercise2;

import week5.exercise1.Shape;

public class Triangle implements Shape {
    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
