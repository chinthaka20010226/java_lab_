interface Shapes{
    abstract double getArea();

    abstract double getCircumference();
}

class Rectangle implements Shapes{
    double length;
    double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double getArea(){
        return this.length * this.width; 
    }

    public double getCircumference(){
        return 2 * (this.length + this.width);
    }

}

class Circle implements Shapes{
    double r;
    double pi=3.142;

    public Circle(double r){
        this.r=r;
    }

    public double getArea(){
        return this.pi * this.r * this.r;
    }

    public double getCircumference(){
        return 2 * this.pi * this.r;
    }

}

class InterfaceDemo{
    public static void main(String args[]){
        Shapes[] arr=new Shapes[2];

        Rectangle r1=new Rectangle(23, 65);
        arr[0]=r1;

        Circle c1=new Circle(44);
        arr[1]=c1;

        
    }
}