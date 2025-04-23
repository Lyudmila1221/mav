package Lesson11_2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5)
        };

        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}
