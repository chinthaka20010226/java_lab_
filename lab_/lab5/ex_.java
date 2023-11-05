abstract class Shape{
    abstract double getArea(double value);

    abstract double getPerimeter(double value);
}

class Circle extends Shape{
    final double pi=3.14159;

    double getArea(double r){
        return pi*r*r;
    }

    double getPerimeter(double r){
        return 2*pi*r;
    }
}

class Square extends Shape{
    double getArea(double x){
        return x*x;
    }

    double getPerimeter(double x){
        return 4*x;
    }
}

class Demo{
    public static void main(String args[]){
        Shape s1=new Circle();
        Shape s2=new Square();

        System.out.println("Area of Circle:"+s1.getArea(5));
        System.out.println("Perimeter of Circle:"+s1.getPerimeter(5));
        System.out.println("Area of Square:"+s2.getArea(4));
        System.out.println("Perimeter of Square:"+s2.getPerimeter(4));
    }
}