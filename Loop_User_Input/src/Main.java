import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userName;
        byte option0to9;
        System.out.println("Hello and welcome ! May i know your name?");
        System.out.println("Your name:");
        userName = userInput.nextLine();
        System.out.println("Welcome " + userName);

        mainLoop:
// gives the overarching loop an id to directly break out of it
        while (true) {
            String[] menu = {
                    "(0) : Go back to startmenu",
                    "(1) : Sum from n to m (Example: 0-100 = 5050)",
                    "(2) : Guess my random number from n-m",
                    "(3) : Suggest me a song!",
                    "(4) : Pastoral care",
                    "(5) : Temperature converter",
                    "(6) : Factor finder",
                    "(7) : Sum of every nth number up to 1000",
                    "(8) :",
                    "(9) :"
            };

            for (String option : menu) {//String option assigns the individual array items to a string
                System.out.println(option);
            }
            System.out.println("Which action do you want to perform:");
            option0to9 = userInput.nextByte();

            switch (option0to9) {
                case 0:// exit function
                    System.out.println("Do you want to close the program? (y/n)");
                    String yOrN;
                    yOrN = userInput.nextLine();
                    yOrN = userInput.nextLine();
                    if (yOrN.equalsIgnoreCase("y")) {
                        System.out.println("Goodbye " + userName);
                        break mainLoop;
                    }
                    break;

                case 1:
                    yOrN = "y";
                    while (yOrN.equalsIgnoreCase("y")) {
                        int number01;
                        int number02;
                        System.out.println("What is your start range? (integer)");
                        number01 = userInput.nextInt();
                        System.out.println("What is your end range? (integer)");
                        number02 = userInput.nextInt();
                        int result = number02 * (number02 + 1) / 2 - number01 * (number01 + 1) / 2 + number01;
                        System.out.println(result);
                        System.out.println("Would you like to rerun the function? (y/n)");
                        yOrN = userInput.nextLine();
                        yOrN = userInput.nextLine();
                        if (yOrN.equalsIgnoreCase("n")) {
                            break;
                        }
                    }

                case 2:
                    yOrN = "y";
                    subLoop:
                    while (yOrN.equalsIgnoreCase("y")) {
                        int number01;
                        int number02;
                        System.out.println("I will think of a number and your going to guess it.");
                        System.out.println("In which range should i guess the number from n to m?");
                        System.out.println("What should be the minimum value?");
                        number01 = userInput.nextInt();
                        System.out.println("Thank you. What about the maximum value?");
                        number02 = userInput.nextInt();
                        if (number01 != number02) {
                            if (number01 < number02) {
                                System.out.println("I have a random number form " + number01 + " to " + number02 + ", what do you think is it?");
                                Random randomRange = new Random();
                                int result = randomRange.nextInt(number02 - number01) + number01;
                                System.out.println(result);
                                int awnser = 99;
                                while (result != awnser) {
                                    System.out.println("Take you Guess");
                                    awnser = userInput.nextInt();
                                    if (result == awnser) {
                                        System.out.println("Correct!");
                                        System.out.println("do you want to try again? (y/n)");
                                        yOrN = userInput.nextLine();
                                        yOrN = userInput.nextLine();
                                        if (yOrN.equalsIgnoreCase("n")) {
                                            break subLoop;
                                        }
                                    } else {
                                        System.out.println("Wrong guess");
                                    }
                                }
                            }else {
                                System.out.println("smaller number must be smaller");
                            }
                        } else {
                            System.out.println("numbers must be different");
                        }
                    }
                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;

                default:
                    break;
            }

        }

    }
}
