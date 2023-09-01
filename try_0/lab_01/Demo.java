public class Demo{
     public static void main(String args[]){
          // create an object,
          Triangle triangleObject = new Triangle(4,3);

          System.out.println("Area is : "+triangleObject.FindArea());
          System.out.println("Hypotenuse is : "+triangleObject.FindHypotenuse());
          System.out.println("Perimeter is : "+triangleObject.FindPerimeter());

     }

}



class Triangle{
     double height;
     double base;
     double hypotenuse;


     // constructor method,
     public Triangle(double height,double base){
          this.height = height;
          this.base = base;
          this.hypotenuse = 0.0;
 
     }

     public double FindArea(){
          return 0.5 * this.height * this.base;

     }

     public double FindHypotenuse(){
          return Math.sqrt(Math.pow(this.height,2) + Math.pow(this.base,2));

     }

     public double FindPerimeter(){
          if(this.hypotenuse == 0.0){
             this.hypotenuse=this.FindHypotenuse();

          }

          return this.height + this.base + this.hypotenuse;

     }

}

























