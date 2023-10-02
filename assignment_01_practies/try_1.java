import java.util.*;

/*
class StaticDemo{
    int num1;
    static int num2;

    StaticDemo(int num1){
        this.num1=num1;
    }

    public static void main(String args[]){
        StaticDemo s1=new StaticDemo(15);
        StaticDemo.num2=17;

        StaticDemo s2=new StaticDemo(22);
        StaticDemo.num2=28;

        System.out.println("s1.num1 : "+s1.num1);
        System.out.println("s1.num2 : "+StaticDemo.num2);
        System.out.println("s2.num1 : "+s2.num1);
        System.out.println("s2.num2 : "+StaticDemo.num2);
    }
}
*/



/*
class Student{
    String FirstName;
    String LastName;
    double Weight;
    double Height;
    double BMI;

    Student(String fName,String lName,double weight,double height){
        this.FirstName=fName;
        this.LastName=lName;
        this.Weight=weight;
        this.Height=height;
    }

    String getFullName(){
        return this.FirstName+" "+this.LastName;
    }

    double getBMI(){
        return this.Weight / (this.Height * this.Height);
    }

    public static void main(String args[]){
        //Scanner input=new Scanner(System.in);
        Student s1=new Student("chinthaka","senarathna",1.8,51);

        System.out.println("Your full name is : "+s1.getFullName());
        System.out.println("Your BMI is : "+s1.getBMI());
    }
}
*/


/*
class Triangle{
    double a;
    double b;
    double c;

    Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    boolean triangleChecker(){
        return ((this.a+this.b>this.c) && (this.a+this.c>this.b) && (this.b+this.c>this.a)); 
    }

    double getPerimeter(){
        return this.a+this.b+this.c;
    }

    public static void main(String args[]){
        Triangle t1=new Triangle(3,1,1);

        System.out.println("Triangle is : "+t1.triangleChecker());
        System.out.println("Perimeter is : "+(t1.triangleChecker() == true ? t1.getPerimeter() : 0));
    }
}
*/


/*
class GradeGenerater{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Input Student Subject Marks : ");
        double marks=input.nextDouble();

        if((marks>=0) & (marks<=100)){
            if(marks>=75)       System.out.println("A");
            else if(marks>=65 ) System.out.println("B");
            else if(marks>=55 ) System.out.println("C");
            else                System.out.println("Subject Fail");
        }
        else{
            System.out.println("Invalid marks...");
        }
    }
}
*/


/*
class GradeGenerater{
    static void bothOdd(int x,int y){
        if((x%2 == 0) & (y%2==0)){
            System.out.println("Both X and Y vlaues are not odd number");
        }
        else{
            System.out.println("Both X and Y vlaues are odd number");
        }
    }

    static void checkDigit(int y){
        int count=0;
        while(y != 0){
            count++;
            y /= 10;
        }
        
        System.out.println(count == 3 ? "Y is a 3 digits number" : "Y is not a 3 digits number");
    }

    static void checkRange(int y){
        if((y<50) & (y>20)){
            System.out.println("Y is in range 20-50");
        }
        else{
            System.out.println("Y is not in range 20-50");
        }
    }

    static void differentPositive(int x,int y){
        if((x-y)>0){
            System.out.println("Different between X and Y, is a positive number");
        }
        else{
            System.out.println("Different between X and Y, is not a positive number");
        }
    }

    static void bothPositive(int x,int y){
        if((x>0) & (y>0)){
            System.out.println("X and Y positive number");
        }
        else{
            System.out.println("X and Y not positive number");
        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Input value for X : ");
        int X=input.nextInt();
        System.out.println("Input value for Y : ");
        int Y=input.nextInt();

        bothPositive(X, Y);
        differentPositive(X, Y);
        checkRange(Y);
        checkDigit(Y);
        bothOdd(X, Y);
    }
}
*/


/*
class MaxMinGenerator{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int num=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<10;i++){
            System.out.println("Input No."+(i+1)+" : ");
            num=input.nextInt();

            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }

        System.out.println("Maximum value is : "+max+"\n"+"Minimum value is : "+min);
    }
}
*/


/*
class StudentGrades{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.println("Input marks of sunject : ");
        double marks=input.nextDouble();

        int noOfSubjects=0,noOfPassSubjects=0,noOfFailSubjects=0;
        double totalMarks=0;

        while(marks != -1){
            noOfSubjects++;
            
            if(marks >= 50) noOfPassSubjects++;
            else            noOfFailSubjects++;

            totalMarks += marks;

            System.out.println("Input marks of sunject : ");
            marks=input.nextDouble();
        }

        System.out.println("Total Number of Subjects : "+noOfSubjects);
        System.out.println("Total Number of Pass Subjects : "+noOfPassSubjects);
        System.out.println("Total Number of Fail Subjects : "+noOfFailSubjects);
        System.out.println("Average Marks for Subjects : "+(noOfSubjects != 0 ? totalMarks/noOfSubjects : 0));
    }
}
*/



