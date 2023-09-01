public class Swap{
     public static void main(String args[]){
          int x=15,y=5,z=0;

          // with another variable,
          /*System.out.println("x and y value before swap : "+x+" and "+y);

          z=x;
          x=y;
          y=z;
          System.out.println("x and y value after swap : "+x+" and "+y);*/

          // without another variable,
          System.out.println("x and y value before swap : "+x+" and "+y);
          
          x=x+y;
          y=x-y;
          x=x-y;
          System.out.println("x and y value after swap : "+x+" and "+y);

     }

}