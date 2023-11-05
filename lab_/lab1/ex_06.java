class Calculator{
    int number1;
    int number2;

    Calculator(int number1,int number2){
       this.number1=number1;
       this.number2=number2;
    }

    int Addition(){
        return this.number1+this.number2;
    }

    int Subtraction(){
        return this.number1-this.number2;
    }

    int Multiplication(){
        return this.number1*this.number2;
    }

    double Division(){
        return this.number1/this.number2;
    }

    int Modulus(){
        return this.number1%this.number2;
    }
}

class Demo{
    public static void main(String args[]){
        Calculator c1=new Calculator(12,5);

        System.out.println("Addition : "+c1.Addition());
        System.out.println("Subtraction : "+c1.Subtraction());
        System.out.println("Multiplication : "+c1.Multiplication());
        System.out.println("Division : "+c1.Division());
        System.out.println("Modulus : "+c1.Modulus());
    }
}