package pkgB;

class AccessDemo extends Calculator{
    public static void main(String args[]){
        Calculator c1=new Calculator();
        c1.getUserInputs();
        c1.displayValue();

        AccessDemo a1=new AccessDemo();
        a1.getUserInputs();
        a1.displayValue();
    }
}