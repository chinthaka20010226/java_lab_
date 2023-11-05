class Swap{
    /*
    public static void swapWithThirdVariable(int x,int y){
        int z=x;
        x=y;
        y=z;

        System.out.println("x,y values after swap : "+x+" "+y);
    }
    */

    public static void swapWithoutThirdVariable(int x,int y){
        System.out.println("x,y values after swap : "+((x-y)-y)+" "+((x+y)-y));
    }

    public static void main(String args[]){
        int x=15;
        int y=5;

        /*
        System.out.println("x,y values before swap : "+x+" "+y);
        swapWithThirdVariable(x,y);
        */

        System.out.println("x,y values before swap : "+x+" "+y);
        swapWithoutThirdVariable(x,y);
    }
}