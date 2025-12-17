import berufsfachschule.temperature.Temperatur;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Temperatur temp1 = new Temperatur(-5.37);
        System.out.println(temp1.getToFahrenheit());
        System.out.println(temp1.getTempInC());
        System.out.println(temp1.getToKelvin());
        System.out.println();

        Temperatur temp2 = new Temperatur();
        temp2.setTempInC(10.5);
        System.out.println(temp2.getTempInC());
        System.out.println(temp2.getToFahrenheit());
        System.out.println(temp2.getToKelvin());
        System.out.println();

        Temperatur temp3 = new Temperatur(0);
        System.out.println(temp3.getToFahrenheit());
        System.out.println(temp3.getToKelvin());
        System.out.println(temp3.getKelvinToCelsius((float) temp3.getToKelvin()));
        System.out.println();


    }
}