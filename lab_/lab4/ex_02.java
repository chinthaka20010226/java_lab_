class ScientifcCal{
    public ScientifcCal(){
        System.out.println("This is the default constructor of Scientic Calculator");
    }

    public ScientifcCal(int x){
        this();
        System.out.println("This is the single-parameter constructor of Scientic Calculator");
    }

    public ScientifcCal(int x,int y){
        this(x);
        System.out.println("This is the two-parameter constructor of Scientic Calculator");
    }
}

class ClassicCal extends ScientifcCal{
    public ClassicCal(){
        System.out.println("This is the default constructor of Classic calculator");
    }

    public ClassicCal(int x){
        //this();
        super();
        System.out.println("This is the single-parameter constructor of Classic Calculator");
    }

    public ClassicCal(int x,int y){
        //this(6);
        super(4);
        System.out.println("This is the two-parameter constructor of Classic Calculator");
    }
}

class DemoCal{
    public static void main(String args[]){
        //ScientifcCal cal1=new ScientifcCal(3,1);

        ClassicCal cal2=new ClassicCal(2,4);
    }
}