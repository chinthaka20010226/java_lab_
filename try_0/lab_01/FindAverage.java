// Method - 01(return value by using ststic method),

/*public class FindAverage{
     public static double findAverage(double x,double y,double z){
          return (x+y+z)/3;

     }

     public static void main(String args[]){
          double x=10,y=5,z=15;

          System.out.println("Average value is : "+findAverage(x,y,z));

     }

}*/


// Method - 02(return value(NOT Static) by creating object),

/*public class FindAverage{
     public double findAverage(double x,double y,double z){

          return (x+y+z)/3;

     }

     public static void main(String args[]){
          double x=10,y=5,z=15;

          FindAverage f=new FindAverage();

          double avg = f.findAverage(x,y,z);

          System.out.println("Average is : "+avg);

     }

}*/


// Method - 03(print value(NOT Static) by creating object)

public class FindAverage{
     public void findAverage(double x,double y,double z){
          System.out.println((x+y+z)/3);

     }

     public static void main(String args[]){
          double x=10,y=5,z=15;

          FindAverage f=new FindAverage();

          f.findAverage(x,y,z);

     }

}


















