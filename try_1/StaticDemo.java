public class StaticDemo{
     //instance variable
     int num1;

     //class / static variable
     static int num2;

     public StaticDemo(int num1){
          this.num1 = num1;

     }

     public static void main(String args[]){
          StaticDemo s1 = new StaticDemo(15);
          StaticDemo.num2 = 17;

          StaticDemo s2 = new StaticDemo(22);
          StaticDemo.num2 = 28;

          //s1
          System.out.println(s1.num1+" "+StaticDemo.num2); //15 28

          //s2
          System.out.println(s2.num1+" "+StaticDemo.num2); //22 28

     }


}