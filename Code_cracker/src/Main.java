import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String code = String.format("%04d", random.nextInt(1000));
        Scanner userInput = new Scanner();
        String answer = userInput.nextLine();
        for (!answer.equals(code)) {
            String awnser = userInput.nextLine();
        }
        System.out.println();
    }
}