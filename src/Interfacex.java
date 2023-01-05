public class Interfacex {

    public static void main(String[] args) {

        //Shape s = new Shape();

        Rectangle r = new Rectangle(5,8);
        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());


        Circle c = new Circle(7);
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());


        Shape myShape = new Rectangle(8,8);
        System.out.println("Shape/Rectangle Area: " + myShape.getArea());
        System.out.println("Shape/Rectangle Perimeter: " + myShape.getPerimeter());

        //proof of variable type... only run this after you have added the bottom line to the shape interface
        //System.out.println(myShape.interfaceVariable);
        //System.out.println(Shape.interfaceVariable);
        //myShape.interfaceVariable++;

    }
}

interface Shape {
    int interfaceVariable = 100;
    double getArea();
    double getPerimeter();

}

class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

}

class Circle implements Shape {
    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return r*r*3.1415;
    }
    @Override
    public double getPerimeter() {
        return 2*r*3.1415;
    }
}

//add this inside the Shape interface to see what type of variables are allowed
//
// int interfaceVariable=100;//proof of variable type try protected,default, private
//

interface two {
    void anything();
}