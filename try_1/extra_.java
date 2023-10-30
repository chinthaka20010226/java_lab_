import java.util.*;

class Student{
    String FirstName;
    String LastName;
    double weight;
    double height;
    double BMI;

    Student(String FirstName,String LastName,double weight,double height){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.weight=weight;
        this.height=height;
    }

    String getFullName(){
        return this.FirstName+" "+this.LastName;
    }

    double getBMI(){
        if(this.weight == 0 | this.height == 0){
           System.out.println("Invalid weight & height");
           return -1;
        }
        this.BMI=this.weight/(this.height*this.height);
        return this.BMI;
    }

    public static void main(String args[]){
        Student s1=new Student("Chinthaka","Senarathna",50.0,1.8);

        //System.out.println("full name : "+s1.getFullName()+"\n"+"BMI : "+s1.getBMI());
        System.out.printf("full name : %s\n", s1.getFullName());
        System.out.printf("BMI : %.4f", s1.getBMI());
    }
}








