package week5.exercise1;

public class CircleApplication {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Circle: " + circle.getName());

        Shape shape = circle;
        System.out.println("Shape: " + shape.getName());

        Circle circle1 = new Circle();
        Shape anotherShape = circle1;
        System.out.println("Another shape :" + anotherShape.getName());

    }
}






