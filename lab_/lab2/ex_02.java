import java.util.*;

class Triangle{
    double a;
    double b;
    double c;

    Triangle(double a,double b,double c){
       this.a=a;
       this.b=b;
       this.c=c;
    }

    boolean triangleChecker(){
       if((this.a+this.b>this.c) & (this.a+this.c>this.b) & (this.b+this.c>this.a)){
           return true; 
       }
       return false;
    }

    double getPerimeter(){
        if(this.triangleChecker()){
            return this.a+this.b+this.c;
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.println("input side a : ");
        double side_a=input.nextDouble();
        System.out.println("input side b : ");
        double side_b=input.nextDouble();
        System.out.println("input side c : ");
        double side_c=input.nextDouble();

        Triangle t1=new Triangle(side_a,side_b,side_c);
        System.out.println("Perimeter : "+t1.getPerimeter());
    }
}




