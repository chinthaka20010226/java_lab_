public class Cast{
     // narrow casting
     public static long doubleToLong(double d){              
          return (long)d;

     }

     // narrow casting
     public static int doubleToInt(double d){
          return (int)d;

     }

     // narrow casting 
     public static float longToFloat(long l){
          return (float)l;

     }

     public static float integerToFloat(int x){
          float f = x;

          return x;

     }
  
     // wider convertion
     public static long integerToLong(int x){
          long l = x;

          return x;

     }

     // wider convertion, 
     public static double integerToDouble(int x){
          double d = x;

          return d;

     }

     public static void main(String args[]){
          int x=5;
          double y=10.5;

          System.out.println("x value to double : "+integerToDouble(x));
          System.out.println("x value to long : "+integerToLong(x));
          System.out.println("x value to float : "+integerToFloat(x));

          long conLong = integerToLong(x);
          System.out.println("conLong value to float : "+longToFloat(conLong));

          System.out.println("y value to int : "+doubleToInt(y));

          System.out.println("y value to long : "+doubleToLong(y));

     }

}