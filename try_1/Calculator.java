package pkgA;

import java.util.*;

public class Calculator{
    double average;
    int range;

    public void getUserInputs(){
       Scanner input=new Scanner(System.in);
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

    }

    public void displayValues(){
       System.out.println("average : "+this.average);
       System.out.println("range : "+this.range);
    }

}