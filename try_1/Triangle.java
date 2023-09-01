import java.util.*;

public class Triangle{
     double a;
     double b;
     double c;

     public Triangle(double a,double b,double c){
          this.a=a;
          this.b=b;
          this.c=c;

     }

     boolean triangleChecker(){
          //if((this.a+this.b)>this.c & (this.a+this.c)>this.b & (this.b+this.c)>this.a){
          //   return true;
          //}
          //return false;

          return (this.a+this.b)>this.c & (this.a+this.c)>this.b & (this.b+this.c)>this.a ? true : false;
    
     }

     double getPerimeter(){
          if(this.triangleChecker()){
             return this.a+this.b+this.c;
          }
          System.out.println("Not valid Triangle");
          return 0;

     }

     public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          System.out.print("input length of side a : ");
          double a=input.nextDouble();
          System.out.print("input length of side b : ");
          double b=input.nextDouble();
          System.out.print("input length of side c : ");
          double c=input.nextDouble();

          Triangle t1=new Triangle(a,b,c);

          System.out.println("Is triangle valid : "+t1.triangleChecker());
          System.out.println("Perimeter of triangle : "+t1.getPerimeter());

     }


}













