package Assignments;

public class CELCIUSMETHOD {


    public static double toKelvin(double Celcius){
        double Kelvin = Celcius + 273.15;

        return Kelvin;
    }

    public static double toFahrenheit(double Celsius){
        double Fahrenheit = Celsius * 9/5 + 32;

        return Fahrenheit;

    }

    public static double toCelsius(double Kelvin){
        double Celsius = Kelvin - 273.15;
        return Celsius;
    }

    public static double toFahren(double Kelvin){
        double Fahrenheit = Kelvin * 9/5 - 459.67;

        return Fahrenheit;
    }

    public static void main(String[] args) {

    }
}
