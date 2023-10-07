abstract class Shape{
    abstract double getArea(double r);
    abstract double getPerimeter(double r);
}

class Circle extends Shape{
    double getArea(double r){
        return 3.14159*r*r;
    }

    double getPerimeter(double r){
        return 2*3.14159*r;
    }
}

class Square extends Shape{
    double getArea(double l){
        return l*l;
    }

    double getPerimeter(double l){
        return 4*l;
    }
}

public class Example{
    public static void main(String args[]){
        Shape shape1=new Circle();

        System.out.println("Circle, \n\tArea : "+shape1.getArea(5)+"\n\t"+"Perimeter : "+shape1.getPerimeter(5));

        Shape shape2=new Square();

        System.out.println("Square, \n\tArea : "+shape2.getArea(5)+"\n\t"+"Perimeter : "+shape2.getPerimeter(5));
    }
}