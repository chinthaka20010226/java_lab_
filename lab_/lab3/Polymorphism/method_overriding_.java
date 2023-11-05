import java.net.SocketPermission;
import java.util.*;

import javax.print.Doc;

class Doctor{
    private double bSal;//344.4;
    private double hRate;//55.5;

    public void setBSal(double bSal){
        this.bSal=bSal;
    }

    public double getBSal(){
        return bSal;
    }

    public void setHRate(double hRate){
        this.hRate=hRate;
    }

    public double getHRate(){
        return hRate;
    }

    public double getMonthlyPayment(double h){
        return getBSal() + (getHRate() * h);
    }
}

class Specialist extends Doctor{
    private double channelCharge;//123.33;
    private double allowance;//455.44;

    public void setChannelCharge(double channelCharge){
        this.channelCharge=channelCharge;
    }

    public double getChannelCharge(){
        return channelCharge;
    }

    public void setAllowance(double allowance){
        this.allowance=allowance;
    }

    public double getAllowance(){
        return allowance;
    }

    public double getMonthlyPayment(double h){
        System.out.println(getBSal());
        return getBSal() + getAllowance() + (getChannelCharge() * h);
    }
}

class Demo{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        Doctor d1=new Doctor();
        System.out.println("input basic salary:");
        d1.setBSal(input.nextDouble());
        System.out.println("input houly rate:");
        d1.setHRate(input.nextDouble());

        Specialist s1=new Specialist();
        System.out.println("input channel charge:");
        s1.setChannelCharge(input.nextDouble());
        System.out.println("input allownace:");
        s1.setAllowance(input.nextDouble());

        System.out.println("input no.of hours:");
        double h=input.nextDouble();

        // Doctor d2=(Doctor) s1;

        System.out.println("Doctor:"+d1.getMonthlyPayment(h));
        System.out.println("Specialist:"+s1.getMonthlyPayment(h));
    }
}