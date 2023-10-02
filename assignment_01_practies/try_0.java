import java.util.*;

/*
class Temperature{
    static double convertToFahrenheit(double c){
        return c/5*9+32;
    }

    static double convertToCelsius(double f){
        return (f-32)/9*5;
    }

    public static void main(String []args){
        double fahrenheit = 212;
        double celsius = 98.5;

        Temperature t1=new Temperature();

        System.out.println("Fahrenheit value before converting to celsius : "+fahrenheit);
        System.out.println("Fahrenheit value after converting to celsius : "+convertToCelsius(fahrenheit));
        System.out.println("Celsius value before converting to fahrenheit : "+celsius);
        System.out.println("Fahrenheit value before converting to celsius : "+convertToFahrenheit(celsius));
    }
}
*/

/*
class FindAverage{
    double calcAvg(double x,double y,double z){
        return (x+y+z)/3;
    }

    public static void main(String args[]){
        double X=10,Y=5,Z=15;

        FindAverage f1=new FindAverage();

        System.out.println("Average value is : "+f1.calcAvg(X,Y,Z));
    }
}
*/


/*
class Cast{
    static int floatToInt(float f){
        return (int)f; 
    }

    static long doubleToLong(double d){
        return (long)d;
    }

    static int doubleToInt(double d){
        return (int)d;
    }

    static float longToFloat(long l){
        return (float)l;
    }

    static float intToFloat(int x){
        return x;
    }

    static long intToLong(int x){
        return x;
    }

    static double intToDouble(int x){
        return x; 
    }

    public static void main(String args[]){
        int X=5;
        double Y=10.5;

        System.out.println("Integer convert to Double : "+intToDouble(X));
        System.out.println("Integer convert to Long : "+intToLong(X));
        System.out.println("Integer convert to Float : "+intToFloat(X));
        System.out.println("Long convert to Float : "+longToFloat(intToLong(X)));
        System.out.println("Double convert to integer : "+doubleToInt(Y));
        System.out.println("Double convert to long : "+doubleToLong(Y));
        System.out.println("Float convert to integer : "+floatToInt(1.23f));
    }
}
*/


/*
class Triangle{
    double height;
    double base;
    double hypotenuse;

    Triangle(double height,double base){
        this.height=height;
        this.base=base;
    }

    double FindArea(){
        return 0.5*this.height*this.base;
    }

    double FindHypotenuse(){
        this.hypotenuse=Math.sqrt(Math.pow(this.height,2) + Math.pow(this.base,2));
        return this.hypotenuse;
    }

    double FindPerimeter(){
        if(this.hypotenuse == 0){
            this.FindHypotenuse();
        }
        return this.height+this.base+this.hypotenuse;
        
    }
}

class Demo{
    public static void main(String args[]){
        Triangle t1=new Triangle(4,3);

        System.out.println("Area is : "+t1.FindArea());
        System.out.println("Hypotenuse is : "+t1.FindHypotenuse());
        System.out.println("Perimeter is : "+t1.FindPerimeter());

    }
}
*/


/*
class Swap{
    void notUsingThirdVariable(int X,int Y){
        X=(X+Y)-X;
        Y=(X+Y)+Y;
        System.out.println("X,Y values after swap : "+X+" "+Y);
    }

    void usingThirdVariable(int X,int Y){
        int Z=X;
        X=Y;
        Y=Z;
        System.out.println("X,Y values after swap : "+X+" "+Y);
    }

    public static void main(String args[]){
        int X=15,Y=5;
        
        Swap s1=new Swap();

        System.out.println("X,Y values before swap : "+X+" "+Y);
        s1.usingThirdVariable(X, Y);
        System.out.println("X,Y values before swap : "+X+" "+Y);
        s1.notUsingThirdVariable(X, Y);
        
    }
}
*/


/*
class Calculator{
    int number1;
    int number2;

    Calculator(int number1,int number2){
        this.number1=number1;
        this.number2=number2;
    }

    int Addotion(){
        return this.number1+this.number2;
    }

    int Subtraction(){
        return this.number1-this.number2; 
    }

    int Multiplication(){
        return this.number1*this.number2;
    }

    double Division(){
        return (double)this.number1/this.number2;
    }

    int Modulus(){
        return this.number1%this.number2;
    }
}

class Demo{
    public static void main(String args[]){
        Calculator c1=new Calculator(12,5);

        System.out.println("Addition : "+c1.Addotion());
        System.out.println("Subtraction : "+c1.Subtraction());
        System.out.println("Multiplication : "+c1.Multiplication());
        System.out.println("Division : "+c1.Division());
        System.out.println("Modulus : "+c1.Modulus());
    }
}
*/

