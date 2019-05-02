package week5.exercise2;

import week5.exercise1.Circle;
import week5.exercise1.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicShapesApplicaton {

    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("Shape :" + circle);
        Square square = new Square();
        System.out.println("Shape :" + square);
        Triangle triangle = new Triangle();
        System.out.println("Shape :" + triangle);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        System.out.println("Shapes :" + shapes);
        for (Shape shape : shapes) {
            System.out.println("Shape name: " + shape);
        }
    }
}
