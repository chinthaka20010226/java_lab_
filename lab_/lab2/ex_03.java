import java.util.*;

/*
class GradeGenerator{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.print("input your subject marks : ");
        int marks=input.nextInt();

        if((marks <= 100) & (marks >= 0)){
           System.out.println("Student Marks for Subject: "+marks);
           if(marks >= 75){
              System.out.println("Grade for the subject: A");
           }
           else if(marks >= 65){
              System.out.println("Grade for the subject: B");
           }
           else if(marks >= 55){
              System.out.println("Grade for the subject: C");
           }
           else{
              System.out.println("Subject Fail");
           }
        }
    }
}
*/



class GradeGenerator{
    public static void checkPositive(double x,double y){
       if((x >= 0) & (y >= 0)){
          System.out.println("x and y positive numbers");
       }
       else{
          System.out.println("both are not positive");
       }
    }

    public static void checkDifferentPositive(double x,double y){
       if((x-y) >= 0){
          System.out.println("difference between x and y, is a positive");
       }
       else{
          System.out.println("difference between x and y, is not a positive");
       }
    }

    public static void checkYBetween(double y){
       if((y>=20) & (y<=50)){
          System.out.println("y is in range 20-50");
       }
       else{
          System.out.println("y is not in range 20-50");
       }
    }

    public static void checkYDigitsCount(double y){
        int count=0;
        while(y>0){
           count++;
           y/=10;
        }

        if(count == 3){
           System.out.println("y is a 3 digit number");
        }
        else{
           System.out.println("y is not a 3 digit number");
        }
    }

    public static void checkValuesOdd(double x,double y){
       if((x%2!=0) & (y%2!=0)){
          System.out.println("both x and y values are odd numbers");
       }
       else{
          System.out.println("both x and y values are not odd numbers");
       }
    }

    public static void main(String args[]){
         double x=55.0;
         double y=12.0;

         checkPositive(x,y);
         checkDifferentPositive(x,y);
         checkYBetween(y);
         checkYDigitsCount(y);
         checkValuesOdd(x,y);
    }
}






















