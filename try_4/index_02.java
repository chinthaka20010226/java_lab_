class ScientificCal{
    public ScientificCal(){
        System.out.println("This is the default constructor of Scientific Calculator");
    }

    public ScientificCal(double x){
        System.out.println("This is the single-parameter consructor of Scientic Calculator"); 
    }

    public ScientificCal(double x,double y){
        System.out.println("This is the two-parameter consructor of Scientic Calculator"); 
    }
}

class ClassicCal extends ScientificCal{
    public ClassicCal(){
        System.out.println("This is the default constructor of Classical Calculator");
    }

    public ClassicCal(double x){
        System.out.println("This is the single-parameter consructor of Classical Calculator");
    }

    public ClassicCal(double x,double y){
        System.out.println("This is the two-parameter consructor of Classical Calculator"); 
    }
}

class DemoCal{
    public static void main(String args[]){
        ScientificCal s3=new ScientificCal(3,4);
        ClassicCal c1=new ClassicCal(6);
        ClassicCal c2=new ClassicCal(3,4);
    }
}