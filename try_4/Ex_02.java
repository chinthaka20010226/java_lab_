class ScientificCal{
    public ScientificCal(){
        System.out.println("This is the default constructor of Scientific Calculator");
    }

    public ScientificCal(double x){
        this();
        System.out.println("This is the single-parameter constructor of Scientific Calculator");
    }

    public ScientificCal(double x,double y){
        this(x);
        System.out.println("This is the two-parameter constructor of Scientific Calculator");
    }
}

class ClassicCal extends ScientificCal{
    public ClassicCal(){
        System.out.println("This is the default constructor of Classic Calculator");
    }

    public ClassicCal(double x){
        this();
        System.out.println("This is the single-parameter constructor of Classic Calculator");
    }

    public ClassicCal(double x,double y){
        // this(x);
        System.out.println("This is the two-parameter constructor of Classic Calculator");
    }
}

class DemoCal{
    public static void main(String args[]){
        // ScientificCal s1=new ScientificCal(11, 22);

        // ClassicCal c1=new ClassicCal(0);

        ClassicCal c2=new ClassicCal(0, 0);
    }
}