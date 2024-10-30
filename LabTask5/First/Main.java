package LabTask5.First;

public class Main {
    public static void main(String[] args) {
        Shape myRectangle = new Rectangle(5, 10);
        Shape myCircle = new Circle(7);
        Shape myTriangle = new Triangle(3, 4, 5);

        System.out.println("Rectangle Area: " + myRectangle.area());
        System.out.println("Rectangle Perimeter: " + myRectangle.perimeter());

        System.out.println("Circle Area: " + myCircle.area());
        System.out.println("Circle Perimeter: " + myCircle.perimeter());

        System.out.println("Triangle Area: " + myTriangle.area());
        System.out.println("Triangle Perimeter: " + myTriangle.perimeter());
    }
}