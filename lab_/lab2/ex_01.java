class StaticDemo{
    int num1;
    static int num2;

    StaticDemo(int num1){
        this.num1=num1;
    }

    public static void main(String args[]){
        StaticDemo s1=new StaticDemo(15);
        StaticDemo.num2=17;

        StaticDemo s2=new StaticDemo(22);
        StaticDemo.num2=28;

        System.out.println("s1 object num1: "+s1.num1);
        System.out.println("s1 object num2: "+StaticDemo.num2);
        System.out.println("s2 object num1: "+s2.num1);
        System.out.println("s1 object num2: "+StaticDemo.num2);
    }
}