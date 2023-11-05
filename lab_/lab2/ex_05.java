import java.util.*;

class StudentGrade{
    public static double calculateAverage(int[] marksArr){
        int sum=0;
        for(int i:marksArr){
           sum+=i;
        }
        return countNoOfSubjects(marksArr) == 0 ? 0 : sum/countNoOfSubjects(marksArr);
    }   
        
    public static int countNoOfFailSubjects(int[] marksArr){
        int count=0;
        for(int i:marksArr){
           if(i < 50){
              count++;
           }
        }
        return count;
    } 

    public static int countNoOfPassSubjects(int[] marksArr){
        int count=0;
        for(int i:marksArr){
           if(i >= 50){
              count++;
           }
        }
        return count;
    } 

    public static int countNoOfSubjects(int[] marksArr){
        return marksArr.length;
    } 

    public static void printMarksArray(int[] marksArr){
        System.out.print("[");
        for(int i:marksArr){
           System.out.print(i+", ");
        }
        System.out.println("\b\b]");
    }

    public static int[] createArrayMarks(int[] marksArr,int marks){
        int[] tempMarksArr=new int[marksArr.length+1];
        for(int i=0;i<marksArr.length;i++){
           tempMarksArr[i]=marksArr[i];
        }
        tempMarksArr[marksArr.length]=marks;
        return tempMarksArr;
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.println("input subject marks(for terminate press -1):");
        int marks=input.nextInt();

        int[] marksArr=new int[0];

        while(marks != -1){
           marksArr=createArrayMarks(marksArr,marks);
           System.out.println("input subject marks(for terminate press -1):");
           marks=input.nextInt();
        }

        printMarksArray(marksArr);

        System.out.println("Total Number Of Subjects: "+countNoOfSubjects(marksArr));
        System.out.println("Total Number Of Pass Subjects: "+countNoOfPassSubjects(marksArr));
        System.out.println("Total Number Of Fail Subjects: "+countNoOfFailSubjects(marksArr));
        System.out.println("Average Marks for Subject: "+calculateAverage(marksArr));
    }
}





