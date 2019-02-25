package week5.exercise2;

import week5.exercise1.Shape;

public class Square implements Shape {
    @Override
    public String getName() {
        return "square";
    }

    @Override
    public String toString() {
        return getName();
    }
}
