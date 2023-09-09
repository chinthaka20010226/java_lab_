package pkgA;

import java.util.*;

public class Calculator{
   static double average;
   static int range;

    protected static void getUserInputs(){
       Scanner input=new Scanner(System.in);

      //Another way,
      int num=0,sum=0,i=0;
      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;

      for(;i<5;i++){
         System.out.print("Enter num."+(i+1)+" : ");
         num=input.nextInt();
         sum += num;

         if(min>num){
            min = num;
         }
         if(max<num){
            max=num;
         }
      }
      average = sum/i;
      range = max - min;

       //by using one local variable,
       /* 
       int num=0,min=0,max=0;
       double sum=0;
       int i=0;
       System.out.print("input no."+(++i)+" : ");
       num=input.nextInt();

       min=max=num;

       for(;i<5;i++){
          sum += num;

          System.out.print("input no."+(i+1)+" : ");
          num=input.nextInt();
          
          if(num<min){
            min=num;
          }
          if(num>max){
            max=num;
          }
       }
       sum += num;

       this.average=sum/i;
       this.range=max-min;
       */
       
       //by using array,
       /*
       int[] arr;
       arr=new int[5];
       
       System.out.println("Input 5 numbers : ");
       for(int i=0;i<arr.length;i++){
          System.out.print("input no."+(i+1)+" : ");
          arr[i]=input.nextInt();
       }

       int sum=0;
       for(int x:arr){
          sum += x; 
       }

       this.average=sum/arr.length;

       int min=arr[0];
       int max=arr[0];
       for(int i=1;i<arr.length;i++){
          if(min>arr[i]){
             min=arr[i];
          }
          if(max<arr[i]){
             max=arr[i];
          }
       }

       this.range=max-min;
       */

    }

   protected static void displayValues(){
       System.out.println("average : "+average);
       System.out.println("range : "+range);
    }

}