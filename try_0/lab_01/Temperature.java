public class Temperature{
     public static double convertToCelsius(double temp){
          return (temp - 32)*5/9;

     }

     public static double convertToFahrenheit(double temp){
          return temp*9/5 + 32;

     }

     public static void main(String args[]){
          double fahrenheit = 212;
          double celsius = 98.5;

          System.out.println("Fahrenheit value before converting : "+fahrenheit);
          System.out.println("Fahrenheit value after converting : "+convertToFahrenheit(celsius));
          System.out.println("Celsius value before converting : "+celsius);
          System.out.println("Celsius value after converting : "+convertToCelsius(fahrenheit));

     }

}