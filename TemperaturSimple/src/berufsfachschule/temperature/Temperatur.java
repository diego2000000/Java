package berufsfachschule.temperature;

public class Temperatur {

    private double tempInC = 18.24;
    private final float absoluteZero=-273.15F;


    public Temperatur() {
        tempInC = 18.32;
    }

    public Temperatur(double tempInC) {
        this.tempInC = tempInC;
    }


    private void printCelsius() {

        System.out.println(tempInC + " ° Celsius");
    }

    public void hotORCold() {
        if (tempInC >= 24) {
            System.out.println("Its hot: " + tempInC + " ° Celsius");
        } else {
            System.out.println("Its cold: " + tempInC + " ° Celsius");
        }
    }

    public double getToFahrenheit() {

        return (tempInC * 9 / 5) + 32;
    }

//    public double getToKelvin() {
//
//        return tempInC + 273.15;
//    }
    public float getToKelvin() {

        return (float) tempInC - absoluteZero;
    }

    public double getTempInC() {
        double temp = tempInC;
        return temp;
    }
    public void setTempInC(double temp) {
         tempInC = temp;

    }
    public float getKelvinToCelsius(float tempInKelvin,boolean roundToTwoDecimals){
        if (roundToTwoDecimals==true){
            return roundToTwoDecimals(tempInKelvin+absoluteZero);
        }

        return tempInKelvin + absoluteZero;
    }
    private float roundToTwoDecimals(float value){
        return Math.round(value*100f)/100f;
    }
}
