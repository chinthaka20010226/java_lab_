interface Shapes{
    abstract double getArea();

    abstract double getCircumference();
}

class Rectangle implements Shapes{
    private double length;
    private double breadth;

    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public void setBreadth(double breadth){
        this.breadth=breadth;
    }
    public double getBreadth(){
        return breadth;
    }
    public double getArea(){
        return getLength()*getBreadth();
    }
    public double getCircumference(){
        return 2*(getLength()+getBreadth());
    }
}

class Circle implements Shapes{
    private double r;
    private double pi=3.14;

    public void setRadius(double r){
        this.r=r;
    }
    public double getRadius(){
        return r;
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
        Shapes[] shapeArr=new Shapes[2];

        Rectangle r1=new Rectangle();
        r1.setLength(23);
        r1.setBreadth(65);
        shapeArr[0]=r1;

        Circle c1=new Circle();
        c1.setRadius(44);
        shapeArr[1]=c1;

        System.out.println( "Area and Circumferene of the Rectangle\n"+
                            "Area="+shapeArr[0].getArea()+"\n"+
                            "Ciircumference="+shapeArr[0].getCircumference());
        System.out.println( "Area and Circumferene of the Circle\n"+
                            "Area="+shapeArr[1].getArea()+"\n"+
                            "Circumference="+shapeArr[1].getCircumference());
    }
}