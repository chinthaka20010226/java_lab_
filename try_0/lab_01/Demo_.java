public class Demo_{
     public static void main(String args[]){
          Calculator calcObject=new Calculator(12,0);

          System.out.println("Addition of two number : "+calcObject.Addition());
          System.out.println("Subtraction of two number : "+calcObject.Subtraction());
          System.out.println("Multiplication of two number : "+calcObject.Multiplication());
          System.out.println("Division of two number : "+calcObject.Division());
          System.out.println("Modulus of two number : "+calcObject.Modulus());

     }

}


class Calculator{
     private int number1;
     private int number2;

     // constructor method,
     public Calculator(int x,int y){
          this.number1 = x;
          this.number2 = y;

     }

     public int Addition(){
          return (this.number1+this.number2);            

     }
 
     public int Subtraction(){
          return (this.number1-this.number2);

     }

     public int Multiplication(){
          return (this.number1*this.number2);

     }

     public double Division(){
          if(this.number2 == 0){
             System.out.println("Invalid input");
             return 0;
          }
          return (this.number1/this.number2);

     }

     public int Modulus(){
          if(this.number2 == 0){
             System.out.println("Invalid input");
             return 0;
          }
          return (this.number1%this.number2);

     }

}