import java.util.*;

class Triangle{
    double area(double a,double b,double c){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    double area(double per_height,double base){
        return 0.5*per_height*base;
    }

    public static void main(String args[]){
        Triangle t1=new Triangle();

        System.out.println("Area of triangle by using Area of triangle formula: "+t1.area(5,4));
        System.out.println("Area of triangle by using Heron's formula: "+t1.area(5,4,7));
    }
}