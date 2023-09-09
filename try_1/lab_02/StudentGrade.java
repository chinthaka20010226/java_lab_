import java.util.*;

/*public class StudentGrade{
     public static double countAverage(int[] arr){
          if(arr.length > 0){
            int sum=0;
            for(int x:arr){
               sum += x;
            }

            return (double)sum/arr.length;
          }
          return 0;

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
          System.out.print("You can input -1 >>>> terminate\nOR\nYou can input marks of subject "+i+" : ");
          int marks=input.nextInt();

          int[] arrMarks=new int[0];

          //Read marks 
          while(marks != -1){
              i++;
              arrMarks=readMarks(arrMarks,marks);
              System.out.print("You can input -1 >>>> terminate\nOR\nYou can input marks of subject "+i+" : ");
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
}*/


// ============================================================================================================================================

public class StudentGrade{
     public static void main(String args[]){
          Scanner input=new Scanner(System.in);

          int marks=0;
          int sum=0;
          int noOfTotalSubjects=0;
          int noOfPassSubjects=0;
          int noOfFailSubjects=0;
          double avg=0;

          while(true){
              System.out.print("Enter the marks of subject "+(noOfTotalSubjects+1)+"(terminate for -1)"+" : ");
              marks=input.nextInt();

              if(marks == -1){
                 break;
              }
              if(marks>=0 && marks<=100){
                 noOfTotalSubjects++;

                 sum += marks;

                 if(marks >= 50){
                    noOfPassSubjects++;
                 }
                 else{
                    noOfFailSubjects++;
                 }
                 
              }
              else{
                 System.out.println("Invalid marks, try again");
              }
          }
          
          if(noOfTotalSubjects > 0){
             avg = sum / noOfTotalSubjects;
          }

          //No.of subjects,
          System.out.println("No.of subjects : "+noOfTotalSubjects);

          //No.of pass subjects
          System.out.println("No.of pass subjects : "+noOfPassSubjects);

          //No.of fail subjects
          System.out.println("No.of pass subjects : "+noOfFailSubjects);

          //Count average,
          System.out.println("Average of subjects marks : "+avg);
     }
}
































