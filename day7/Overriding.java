package day7;

class Shape{
    String name;
    Shape(){                   // empty constructor
        System.out.println("Shape empty construcotr");
    }
    Shape(String n){        // parameterized constructor
        this.name = n;
        System.out.println("Shape param Constructor");
    }
    void area(){
        System.out.println("area in shape");
    }
}
class Circle extends Shape{
    double r,ar;
    Circle(double r){
        super("circle");
        this.r = r;
        System.out.println("circle param Constructor");
    }
    void area(){
        ar = 3.14*r*r;
        System.out.println("area of circle : "+ar);
    }
    
}


public class Overriding {
    public static void main(String[] args) {
        Circle c = new Circle(3.4);
        c.area();       // overriding
        Shape sref;
        sref = c;       // dynamic binding
        sref.area();
    }
}
