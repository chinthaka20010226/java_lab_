import java.util.*;

import javax.print.Doc;

// class Triangle{
//     double area(double a,double b,double c){
//         double s=(a+b+c)/2;
//         return Math.sqrt(s * (s-a) * (s-b) * (s-c));
//     }

//     double area(double h,double b){
//         return 0.5 * h * b;
//     }

//     public static void main(String args[]){
//         Triangle t1=new Triangle();

//         System.out.println("Area of triangle :"+t1.area(5,4));
//         System.out.println("Area of triangle using Heron's formula : "+t1.area(5,4,7));
//     }
// }






class Doctor{
    private double bSal=344.4;
    private double hRate=55.5;

    public void setbSal(double bSal){
        this.bSal=bSal;
    }

    public void sethRate(double hRate){
        this.hRate=hRate;
    }

    public double getbSal(){
        return this.bSal;
    }

    public double gethRate(){
        return this.hRate;
    }

    public double getMonthlyPayment(double h){
        return getbSal()+(gethRate()*h);
    }
}

class Specialist extends Doctor{
    private double channelCharge=123;
    private double allowance;

    public void setchannelCharge(double channelCharge){
        this.channelCharge=channelCharge;
    }

    public void setallowance(double allowance){
        this.allowance=allowance;
    }

    public double getchannelCharge(){
        return this.channelCharge;
    }

    public double getallowance(){
        return this.allowance;
    }

    public double getMonthlyPayment(double h){
        return getbSal()+getallowance()+(getchannelCharge()*h);
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        Doctor doc=new Doctor();
        Specialist spe=new Specialist();
        Doctor spe1=new Specialist();

        System.out.println("Input no.of hours : ");
        double noOfHours=input.nextDouble();

        System.out.println("Doctor monthly payment : "+doc.getMonthlyPayment(noOfHours));
        System.out.println("Specialist monthly payment : "+spe1.getMonthlyPayment(noOfHours));
    }
}