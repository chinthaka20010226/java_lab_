interface Shape{
    abstract double getArea();

    abstract double getCircumference();
}

class Rectangle implements Shape{
    double length;
    double breadth;

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double getArea(){
        return length*breadth;
    }

    public double getCircumference(){
        return 2*(length+breadth);
    }
}

class Circle implements Shape{
    double r;
    double pi=3.142;

    public Circle(double r){
        this.r=r;
    }

    public double getArea(){
        return pi*r*r;
    }

    public double getCircumference(){
        return 2*pi*r;
    }
}

class InterfaceDemo{
    public static void main(String args[]){
        Shape[] shapes=new Shape[2];

        Rectangle r1=new Rectangle(23,65);
        shapes[0]=r1;

        Circle c1=new Circle(44);
        shapes[1]=c1;

        for(Shape x:shapes){
            System.out.println("Area="+x.getArea());
            System.out.println("Circumference="+x.getCircumference());
        }
    }
}
