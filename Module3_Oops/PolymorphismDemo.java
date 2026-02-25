package Module3_Oops;
class Shape {
    void area() {
        System.out.println("Area:");
    }
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}


public class PolymorphismDemo {
      public static void main(String[] args) {
        Shape s1 = new Circle(6);    
        Shape s2 = new Rectangle(6, 6); 
        s1.area();  
        s2.area(); 
    }
    
}
