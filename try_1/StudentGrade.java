import java.util.*;

public class StudentGrade{
     public static double countAverage(int[] arr){
          int sum=0;
          for(int x:arr){
              sum += x;
          }

          return sum/arr.length;

     }

     public static int noOfFailSubjects(int[] arr){
          int count=0;
          for(int i=0;i<arr.length;i++){
              if(arr[i] < 50){
                 count++;
              }
          }

          return count;

     }

     public static int noOfPassSubjects(int[] arr){
          int count=0;
          for(int i=0;i<arr.length;i++){
              if(arr[i] >= 50){
                 count++;
              }
          }

          return count;

     }

     public static int[] readMarks(int[] arr,int x){
          int[] temp=new int[arr.length+1];
          for(int i=0;i<arr.length;i++){
             temp[i]=arr[i];
          }
          temp[arr.length]=x;

          return temp;

     }

     public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          int i=1;
          System.out.print("Input marks of subject "+i+" : ");
          int marks=input.nextInt();

          int[] arrMarks=new int[0];

          //Read marks 
          while(marks != -1){
              i++;
              arrMarks=readMarks(arrMarks,marks);
              System.out.print("Input marks of subject "+i+" : ");
              marks=input.nextInt();

          }

          //No.of subjects,
          System.out.println("No.of subjects : "+arrMarks.length);

          //No.of pass subjects
          System.out.println("No.of pass subjects : "+noOfPassSubjects(arrMarks));

          //No.of fail subjects
          System.out.println("No.of pass subjects : "+noOfFailSubjects(arrMarks));

          //Count average,
          System.out.println("Average of subjects marks : "+countAverage(arrMarks));

     }
}





