class Temperature{
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToFahrenheit(double celsius){
        return celsius * 9/5 + 32;
    }

    public static void main(String args[]){
        double fahrenheit=212;
        double celsius=98.5;

        System.out.println("fahrenheit value before converting to celsius : "+fahrenheit);
        System.out.println("fahrenheit value after converting to celsius : "+fahrenheitToCelsius(fahrenheit));
        System.out.println("celsius value before converting to fahrenheit : "+celsius);
        System.out.println("celsius value after converting to fahrenheit : "+celsiusToFahrenheit(celsius));
    }
}