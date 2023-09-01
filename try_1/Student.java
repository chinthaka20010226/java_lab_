import java.util.*;

public class Student{
     String FirstName;
     String LastName;
     double Weight;
     double Height;

     public Student(String FirstName,String LastName,double Weight,double Height){
          this.FirstName = FirstName;
          this.LastName = LastName;
          this.Weight = Weight;
          this.Height = Height;
 
     }

     String getFullName(){
          return this.FirstName+" "+this.LastName;
     }

     double getBMI(){
          if((this.Weight<=0) || (this.Height<=0)){
              System.out.println("invalid weight/height");
              return 0;
          }
          return this.Weight/(this.Height*this.Height);
     }

     public static void main(String args[]){
          Scanner input= new Scanner(System.in);
          System.out.print("Enter your first name : ");
          String fName=input.nextLine();
          System.out.print("Enter your last name : ");
          String lName=input.nextLine();
          System.out.print("Input your weight : ");
          double weight=input.nextDouble();
          System.out.print("Input your height : ");
          double height=input.nextDouble();

          Student s1=new Student(fName,lName,weight,height);

          System.out.println("Your full name : "+s1.getFullName());
          System.out.printf("Your BMI : %.4f",s1.getBMI());

     }

}













