import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double userTemp;
        Temperatur temp1 = new Temperatur();
        Temperatur temp2 = new Temperatur(23.2);
        System.out.println("please write a temperature");
        userTemp = userInput.nextDouble();
        Temperatur temp3 = new Temperatur(userTemp);

        Temperatur.printCelsius(temp1.tempInC);
        Temperatur.printCelsius(temp2.tempInC);
        Temperatur.printCelsius(temp3.tempInC);
        Temperatur.hotORCold(temp3.tempInC);
        Temperatur.celsiusToFahrenheit(temp3.tempInC);
        Temperatur.celsiusToKelvin(temp3.tempInC);


    }
}