class Cast{
    public static double intToDouble(int x){
        return x;
    }

    public static long intToLong(int x){
        return x;
    }

    public static float intToFloat(int x){
        return x;
    }
 
    public static float longToFloat(long x){
        return x;
    }

    public static int doubleToInt(double x){
        return (int)x;
    }

    public static long doubleToLong(double x){
        return (long)x;
    }

    public static void main(String args[]){
         int x=5;
         double y=10.5;

         System.out.println("integer to double : "+intToDouble(x));
         System.out.println("integer to long : "+intToLong(x));
         System.out.println("integer to float : "+intToFloat(x));
         System.out.println("long to float : "+longToFloat(intToLong(x)));
         System.out.println("double to integer : "+doubleToInt(y));
         System.out.println("double to long : "+doubleToLong(y));
    }
}