import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String code = String.format("%04d", random.nextInt(1000));
        Scanner userInput = new Scanner(System.in);
        String answer = "0";
        String answer01;
        String answer02;
        String answer03;
        String answer04;
        //System.out.println(code);
        System.out.println("Guess the four digit code");

        while (!answer.equals(code)) {
            answer = userInput.nextLine();
            answer01 = answer.substring(0, 1);
            answer02 = answer.substring(1, 2);
            answer03 = answer.substring(2, 3);
            answer04 = answer.substring(3, 4);

            if (answer01.equals(code.substring(0, 1))) {
                System.out.println("first digit is a match");
            } else if (answer01.equals(code.substring(1, 2)) || answer01.equals(code.substring(2, 3)) || answer01.equals(code.substring(3, 4))) {
                System.out.println("first digit correct value but wrong place");
            }else {
                System.out.println("first digit is incorrect");
            }
            if (answer02.equals(code.substring(1,2))) {
                System.out.println("second digit is a match");
            } else if (answer02.equals(code.substring(0, 1)) || answer02.equals(code.substring(2, 3)) || answer02.equals(code.substring(3, 4))) {
                System.out.println("second digit correct value but wrong place");
            }else {
                System.out.println("second digit is incorrect");
            }
            if (answer03.equals(code.substring(2, 3))) {
                System.out.println("third digit is a match");
            } else if (answer03.equals(code.substring(1, 2)) || answer03.equals(code.substring(0, 1)) || answer03.equals(code.substring(3, 4))) {
                System.out.println("third digit correct value but wrong place");
            }else {
                System.out.println("third digit is incorrect");
            }
            if (answer04.equals(code.substring(3, 4))) {
                System.out.println("fourth digit is a match");
            } else if (answer04.equals(code.substring(1, 2)) || answer04.equals(code.substring(2, 3)) || answer04.equals(code.substring(0, 1))) {
                System.out.println("fourth digit correct value but wrong place");
            }else {
                System.out.println("fourth digit is incorrect");
            }
        }
        System.out.println("correct");
    }
}