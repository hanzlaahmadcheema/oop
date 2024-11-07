package OOP.LabTask5.First;

public class Main {
    public static void main(String[] args) {
        Shape find = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + find.area());

     find = new Circle(7);
    System.out.println("Circle Area: " + find.area());

         find = new Triangle(3, 4, 5);


        System.out.println("Triangle Area: " + find.area());

    }
}