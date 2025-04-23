package Lesson11_2;

public interface Shape {
    double getArea();

    double getPerimeter();

    default void printInfo() {
        System.out.println("Тип фигуры: " + this.getClass().getSimpleName());
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println();
    }
}
