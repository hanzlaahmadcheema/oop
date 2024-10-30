package LabTask5.First;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}
