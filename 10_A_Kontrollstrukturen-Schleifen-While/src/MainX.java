import java.util.Random;

public class MainX {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Do this exercises __only__ with while-loops
        // Separate exercises for 'do-while' and 'for' will follow.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //     int iteratorEx1 = 0;
        //      while (iteratorEx1 < 10) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is? the output would be iteratorEx1: 0 iteratorEx1: 0 ....
        //      2. Why does this behavior occur? because iteratorEx1 is always lower than 10
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9
        //      while (iteratorEx1 < 10) {
        //             System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //             iteratorEx1++;
        //           }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        //      02-07. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)
        System.out.println("02-01");
        int number = 0;
        while (number <= 100) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        System.out.println("02-02");
        number = 42;
        while (number <= 100) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        System.out.println("02-03");
        number = 42;
        while (number <= 123) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        System.out.println("02-04");
        number = 0;
        while (number <= 10) {
            if ((number % 2) == 0) {
                System.out.print(number + " ");
            }
            number++;
        }
        System.out.println();
        System.out.println("02-05");
        number = 0;
        while (number <= 10) {
            if (!((number % 2) == 0)) {
                System.out.print(number + " ");
            }
            number++;
        }
        System.out.println();
        System.out.println("02-06");
        number = -10;
        while (number <= 20) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        System.out.println("02-07");
        number = 35;
        while (number >= 0) {
            System.out.print(number + " ");
            number--;
        }
        System.out.println();
        System.out.println("02-08");
        number = 15;
        while (number >= -20) {
            System.out.print(number + " ");
            number--;
        }
        System.out.println();
        System.out.println("02-09");
        number = 10;
        while (number >= -10) {
            if ((number % 2) == 0) {
                System.out.print(number + " ");
            }
            number--;
        }
        System.out.println();
        System.out.println("02-10");
        number = 10;
        while (number >= -10) {
            if ((number % 2) != 0) {
                System.out.print(number + " ");
            }
            number--;
        }
        System.out.println();
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_03 = 0;

        // Your code here
        number = 0;
        while (number <= 100) {
            whileSum_03 = whileSum_03 + number;
            number++;
        }

        System.out.println(whileSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;

        // Your code here
        number = 0;
        while (number <= 100) {
            if ((number % 2) == 0) {
                whileSum_04 = whileSum_04 + number;
            }
            number++;
        }

        System.out.println(whileSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_05 = 0;

        // Your code here
        number = 0;
        while (number <= 100) {
            if ((number % 2) != 0) {
                whileSum_05 = whileSum_05 + number;
            }
            number++;
        }
        System.out.println(whileSum_05); // Should be 2500

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)
        randomNumber = randomGenerator.nextInt(101);
        long iterationSteps = 0;

        // Implement a while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here
        while (randomNumber != 22) {
            randomNumber = randomGenerator.nextInt(101);
            iterationSteps++;
        }
        System.out.println("The program ran " + iterationSteps + " times until the number was found!");
    }
}