import java.util.*;

/*public class MinMaxGenerator{
     public static int MIN_VALUE(int[] x){
          int min=x[0];
          for(int i=1;i<x.length;i++){
             if(min>x[i]){
                min=x[i];
             }
          }
          return min;
     }

     public static int MAX_VALUE(int[] x){
          int max=x[0];
          for(int i=1;i<x.length;i++){
             if(max<x[i]){
                max=x[i];
             }
          }
          return max;
     }

     public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          int[] arr=new int[10];
          
          System.out.println("input 10 numbers : ");
          for(int i=arr.length;i>0;i--){
             System.out.print("input no."+(10-i+1)+" : ");
             arr[10-i]=input.nextInt();
          }

          System.out.println("Minimum value is : "+MinMaxGenerator.MIN_VALUE(arr));
          System.out.println("Maximum value is : "+MinMaxGenerator.MAX_VALUE(arr));

     }     

}*/


// ======================================================================================================


public class MinMaxGenerator{
     public static int MIN_VALUE(int x,int y){
          return y>x ? x : y;     
     
     }

     public static int MAX_VALUE(int x,int y){
          return y<x ? x : y;

     }

     public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          int num=0,min=0,max=0;
          
          System.out.println("input 10 numbers : ");
          for(int i=10;i>0;i--){
             System.out.print("input no."+(10-i+1)+" : ");
             num=input.nextInt();
             min=MIN_VALUE(num,min);
             max=MAX_VALUE(num,max);
             
          }

          System.out.println("Minimum value is : "+min);
          System.out.println("Maximum value is : "+max);

     }     

}


























