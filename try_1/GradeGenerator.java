import java.util.*;

/*public class GradeGenerator{
     int marks;

     public GradeGenerator(int marks){
          this.marks=marks;
 
     }

     String findGrade(){
          if((this.marks>=0) && (this.marks<=100)){
             if(this.marks>=75){
                return "Your grade is A";
             }
             else if(this.marks>=65){
                return "Your grade is B";
             }
             else if(this.marks>=55){
                return "Your grade is C";
             }
             else{
                return "Subject Fail";
             }
          }
          return "Invalid marks";


          //switch(this.marks){
          //   case (this.marks<0) || (this.marks>100):
          //      return "Invalid marks";
          //   case this.marks>=75:
          //      return "Your grade is A";
          //   case this.marks>=65:
          //      return "Your grade is B";
          //   case this.marks>=55:
          //      return "Your grade is C";
          //   default:
          //      return "Subject Fail";
          //}

     }

     public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          System.out.print("input your marks : ");
          int marks=input.nextInt();

          GradeGenerator g1=new GradeGenerator(marks);

          System.out.println(g1.findGrade());
 
     }

}*/


// ============================================================================================


public class GradeGenerator{
     double x;
     double y;

     public GradeGenerator(double x,double y){
          this.x=x;
          this.y=y;
     }

     void checkPositive(){
          if((this.x>=0) && (this.y>=0)){
              System.out.println("x and y positive numbers");
          }
          else if((this.x>=0) && (this.y<0)){
              System.out.println("Only x positive");
          }
          else if((this.x<0) && (this.y>=0)){
              System.out.println("Only y positive");
          }
          else{
              System.out.println("x and y not a positive numbers");
          }
     }
 
     void checkDiffPositive(){
          if((this.x-this.y)>=0){
             System.out.println("Different between x and y, a positive number");
          }
          else{
             System.out.println("Different between x and y, not a positive number");
          }
     }

     void checkYRange(){
          if((this.y>20) && (this.y<50)){
             System.out.println("y is in range 20 - 50");    
          }
          else{
             System.out.println("y is not in range 20 - 50"); 
          }
     }

     void checkYDigit(){
          int count=1;
          //Narrow casting
          int temp=(int)this.y;
   
          while((temp /= 10) != 0.0){
             count++;
          }
          
          if(count == 3){
             System.out.println("y is a 3 digits number");
          }
          else{
             System.out.println("y is not a 3 digits number");
          }
          
     }

     void checkOdd(){
          if(((this.x %= 2) == 1) && ((this.y %= 2) == 1)){
             System.out.println("Both x and y are odd number");
          }
          else if(((this.x %= 2) == 1) && ((this.y %= 2) == 0)){
             System.out.println("Only x is odd");
          }
          else if(((this.x %= 2) == 0) && ((this.y %= 2) == 1)){
              System.out.println("Only y is odd");
          }
          else{
             System.out.println("Both x and y are not odd number");
          }
     }


     public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          System.out.print("input value of x : ");
          double x=input.nextDouble();
          System.out.print("input value of y : ");
          double y=input.nextDouble();

          GradeGenerator g1=new GradeGenerator(x,y);

          g1.checkPositive();
          g1.checkDiffPositive();
          g1.checkYRange();
          g1.checkYDigit();
          g1.checkOdd();
 
     }

}


























