class FindAverage{
    public static double calcAverage(double X, double Y, double Z){
        return (X+Y+Z)/3;
    }

    public static void main(String args[]){
        double X=10;
        double Y=5;
        double Z=15;

        System.out.println("Average of X, Y, Z : "+calcAverage(X, Y, Z));
    }
}