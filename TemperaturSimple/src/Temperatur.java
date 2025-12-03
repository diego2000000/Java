public class Temperatur {

    public double tempInC = 18.24;


    public Temperatur() {
        tempInC = 18.32;
    }

    public Temperatur(double tempInC) {
        this.tempInC = tempInC;
    }

    public static void printCelsius(double temp) {

        System.out.println(temp + " ° Celsius");
    }

    public static void hotORCold(double temp) {
        if (temp >= 24) {
            System.out.println("Its hot: " + temp + " ° Celsius");
        } else {
            System.out.println("Its cold: " + temp + " ° Celsius");
        }
    }

    public static void celsiusToFahrenheit(double temp) {
        double tempInFahrenheit;
        tempInFahrenheit = (temp * 9 / 5) + 32;
        System.out.println(tempInFahrenheit + " °F");

    }

    public static void celsiusToKelvin(double temp) {
        double tempInKelvin;
        tempInKelvin = temp + 273.15;
        System.out.println(tempInKelvin + " K");

    }

}
