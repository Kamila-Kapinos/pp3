public class TemperatureConvension{
    
    public static double CelsiusToKelvin(double tempC){
        return tempC + 273.15;
    }

    public static double KelvinToCelsius(double tempK){
        return tempK - 273.15;
    }

    public static double CelsiusToFahrenheit(double tempC){
        return 32.0 + 9.0/5.0 * tempC;
    }
 
    public static double FahrenheitToCelsius(double tempF){
        return 5.0/9.0 * (tempF - 32);
    }

    public static double KelvinToFahrenheit(double tempK){
        return CelsiusToFahrenheit(KelvinToCelsius(tempK));
    }

    public static double FahrenheitToKelvin(double tempF){
        return CelsiusToKelvin(FahrenheitToCelsius(tempF));
    }

    
    public static void main(String[] args){
        System.out.println("25C to K:\t" + CelsiusToKelvin(25.0));
        System.out.println("25C to F:\t" + CelsiusToFahrenheit(25.0));
        System.out.println("100F to C:\t" + FahrenheitToCelsius(100.0));
        System.out.println("100F to K:\t" + FahrenheitToKelvin(100.0));
        System.out.println("0K to C:\t" + KelvinToCelsius(0));
        System.out.println("0K to F:\t" + KelvinToFahrenheit(0));
    }

}