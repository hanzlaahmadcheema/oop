package OOP.LabTask5.First;

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
            this.radius = radius;
    }
    
    @Override
    double area() {
            return Math.PI * radius * radius;
    }
    
}