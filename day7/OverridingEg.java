package day7;

class Shape {
    String name;
    Shape()
    {
        System.out.println("shape empty constructor");
    }
    Shape(String n)
    {
        this.name = n;
        System.out.println("shape param constructor");
    }
    void area()
    {
        System.out.println("area in shape");
    }
}
class Circle extends Shape
{
    double r,ar;
   // Circle() {}
    Circle(double r)
    {
        super("circle");
        this.r = r; System.out.println("circle param construtor");
    }
    void area() {
        ar = 3.14 * r * r;
        System.out.println("area of circle:"+ar);
    }
}
class Rectangle extends Shape {
    int ln,bd;
    Rectangle(int l,int b){
        super("rectangle");
        ln = l;
        bd = b;
    }
    void area()
    {
        System.out.println("area of rectangle:"+(ln*bd));
    }
}


public class OverridingEg {
    public static void main(String[] args) {
        // Circle c = new Circle(2.5);
        // Rectangle r = new Rectangle(10, 20);

        Shape sref;
        sref = new Shape(); //dynamic binding
        sref.area();
        sref = new Circle(2.5);
        sref.area();
        sref = new Rectangle(10, 20);
        sref.area();
    }

}