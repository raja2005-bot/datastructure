package day7;
interface Shape {
    double pi = 3.14;
    void area();
    void show();
    
}
class Circle implements Shape{
    double r,ar;
    Circle(double r){
        this.r = r;
    }
    public void area(){
        ar = 3.14*r*r;
    }
    public void show(){
        System.out.println("area of Circle : "+ar);
    }
}

public class InterfaceClassProgram {
    public static void main(String[] args) {
        Shape refs;
        refs = new Circle(2.5);
        refs.area();
        System.out.println(Shape.pi);
        System.out.println(Circle.pi);
    }
}
