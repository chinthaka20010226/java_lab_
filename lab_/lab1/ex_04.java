import java.util.*;

class Triangle{
    double height;
    double base;
    double hypotenuse;

    Triangle(double height,double base){
        this.height=height;
        this.base=base;
    }

    double FindArea(){
        return 0.5*this.height*this.base;
    }

    double FindHypotenuse(){
        return Math.sqrt(Math.pow(this.height,2)+Math.pow(this.base,2));
    }

    double FindPerimeter(){
        if(this.hypotenuse == 0.0){
           this.hypotenuse=this.FindHypotenuse();
        }
        return this.height+this.base+this.hypotenuse;
    }
}

class Demo{
    public static void main(String args[]){
         Triangle t1=new Triangle(4,3);

         System.out.println("Area : "+t1.FindArea());
         //System.out.println("Hypotenuse : "+t1.FindHypotenuse());
         System.out.println("Perimeter : "+t1.FindPerimeter());
    }
}