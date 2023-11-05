package "pkgA";

import java.util.*;

class Calculator{
    double average;
    int range;

    void getUserInputs(){
        Scanner input=new Scanner(System.in);

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0,number=0;

        for(int i=0;i<5;i++){
            System.out.println("input no."+(i+1)+": ");
            number=input.nextInt();

            sum+=number;

            if(number < min) min=number;
            if(number > max) max=number;
        }

        this.range=max-min;
        this.average=sum/5;
    }

    void displayValues(){
        System.out.println("average : "+this.average+"\n"+"range : "+this.range);
    }
}

