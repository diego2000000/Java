import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String code = String.format("%04d", random.nextInt(1000));
        Scanner userInput = new Scanner(System.in);
        String answer = "0";
        System.out.println(code);
        while (!answer.equals(code)) {
            answer = userInput.nextLine();
        }
        System.out.println("correct");
    }
}