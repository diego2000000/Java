import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Check the program below and see what it does. It does the job, but not really very elegantly.
        //      Imagine, we would like to calculate the sum of n numbers (for example: 20).
        //      You would have to make more variables and write similar code over and over again.
        //      That code, to solve this simple problem, would get (unnecessary) large.

        //      Implement a while-loop,  which calculates the sum of up to 20 numbers.

        /*
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Input number 1: ");
        int number1 = numberScanner.nextInt();

        System.out.println("Input number 2: ");
        int number2 = numberScanner.nextInt();

        System.out.println("Input number 3: ");
        int number3 = numberScanner.nextInt();

        // and so on...

        int sumOfNumbers1To3 = number1 + number2 + number3; // and so on...;

        System.out.println("The sum of all three numbers is: " + sumOfNumbers1To3);
        */

        // Your task:
        // 1. Declare a variable `numbersToRead` and set it to 20.
        //    Declare another variable where you store the user input (i.e: userNumber).
        // 2. Initialize `numbersRead` and `sum` to 0.
        // 3. Implement a while-loop that continues until `numbersRead` is less than `numbersToRead`.
        //    The condition of the loop should be: while(true) { ... .
        //    The loop should run until either the user has input 20 numbers
        //    or the user stops it explicitly by entering 0; see next step.
        // 4. Inside the loop:
        //    - Prompt the user to input a number.
        //      Tell the user that he can stop the program any time if the user inputs a "0" (number).
        //    - Read the input and add it to `sum`.
        //    - Increment `numbersRead` by 1.
        // 5. After the loop, print out the total sum of all input numbers and how many numbers have been given.
        //
        // Solve this task without a boolean, but with a break instead.
        // Optional: Consider adding a running total or countdown to inform the user how many numbers they have left to input.

        // Example output:
        //      Please input an integer. (0 to exit, 20 numbers remaining)
        //      4
        //      Please input an integer. (0 to exit, 19 numbers remaining)
        //      6
        //      Please input an integer. (0 to exit, 18 numbers remaining)
        //      2
        //      Please input an integer. (0 to exit, 17 numbers remaining)
        //      0
        //      You provided 4 numbers. The sum of those numbers are : 12


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Write a program that repeatedly asks the user about their current life challenges or interests.
        //      The program should continue asking until the user decides to exit.

        // Your task:
        // 1. Create a Scanner object to read user input or use the already existing one from exercise 01.
        // 2. Implement a while loop that continues until the user enters "exit" (string).
        // 3. Inside the loop:
        //    - Inform the user they can exit the program by typing "exit".
        //    - Ask the user what is currently making their life difficult or what they like to do.
        //    - Read the user's input.
        //    - If the input is not "exit", respond with a message acknowledging their input.
        // 4. After the loop ends, print a message indicating that the user has exited the program.

        // Provide answers / reactions to at least 10 possible inputs. Provide a default answer for the rest.
        // Make sure that your comparisons ignore case (Meaning: It shouldn't matter if someone types "Money", "MONEY" or "money").

        // Solve this task without controlling a boolean, but with a break instead.


        // Sample output:
        // What is currently making your life difficult or what do you like to do (type "exit" to quit)?
        // Money
        // Money can be good or bad!
        // What is currently making your life difficult or what do you like to do (type "exit" to quit)?
        // Traveling
        // Traveling. Uff, that's a tough one!
        // What is currently making your life difficult or what do you like to do (type "exit" to quit)?
        // exit
        // You have exited the program (Exercise 02)



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Write a program that asks the user for numbers.
        //      If the number is negative, the program prints "Unsuitable number" and asks the user for a new number.
        //      If the number is zero, the program exits the loop.
        //      If the number is positive, the program prints the number to the power of two.
        //      Let the user know how to quit the program

        // Solve this task without controlling a boolean, but with a break instead.


        //      Sample output:
        //      Enter a number (0 to quit):
        //      5
        //      25
        //      Enter a number (0 to quit):
        //      -3
        //      Unsuitable number
        //      Enter a number (0 to quit):
        //      2
        //      4
        //      Enter a number (0 to quit):
        //      0
        //      Program ended. You entered 3 numbers. Sum of squares: 29


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Write a program which asks the user for a number. If the user types 0, then the program exits.
        //      Calculate the sums of both, positive and negative numbers separately.
        //      Count how many times someone typed in a positive number.
        //      Count how many times someone typed in a negative number.
        //
        //      Calculate the total sum of the negative numbers and the positive numbers.
        //      Inform the user if the total sum is either negative, positive or zero and print the total sum of all

        //      Sample output:
        //      Type in a number (0=exit):
        //      5
        //      Type in a number (0=exit):
        //      -17
        //      Type in a number (0=exit):
        //      -3
        //      Type in a number (0=exit):
        //      7
        //      Type in a number (0=exit):
        //      50
        //      Type in a number (0=exit):
        //      0
        //      Calculating numbers first...
        //      The sum of the 3 positive numbers is: 62
        //      The sum of the 2 negative numbers is: -20
        //      The total sum is positive: 42


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  The following code below will run endlessly. Why?
        //      Can you fix it so, that it still has the same functionality, but will stop?

        /*

        int countingNumber = 0;

        while(countingNumber <= 10) {
            if(countingNumber == 5) {
                System.out.println("Skipping number 5...");
                continue;
            }
            System.out.println("Number: " + countingNumber);
            countingNumber++;
        }


        */

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Print squares with Conditions:
        //      Write a program that prints the squares of numbers from 1 to 20, but with the following conditions:
        //      - Skip numbers that are multiples of 3 (use continue for this)
        //      - Stop the loop if the square exceeds 200 (use break for this)
        //      Use a for loop, and make sure to use both continue and break statements.
        //      Calculate and print the sum of all odd squares (should be 365)


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 07");
        // 07.  Print Prime Numbers:
        //      Write a program that prints all prime numbers from 100 to 200.
        //      Make use, if possible, of continue/break to not iterating too much.
        //      Print the amount of prime numbers and the prime numbers.
        //      Also print the amount of non-prime numbers.

        System.out.print("Prime numbers from 100 to 200: ");
        int primesCounter = 0;
        int nonPrimesCounter = 0;

        // Your solution here

        System.out.println("\nTotal numbers: " + (primesCounter + nonPrimesCounter) + ".");
        System.out.println("Number of non-prime numbers: " + nonPrimesCounter);
        System.out.println("Number of prime numbers: " + primesCounter);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 08");
        // 08.  Find a Divisor:
        //      Write a program to find the smallest divisor of a given number.
        //      Use a loop and the break statement to exit the loop, when the first divisor is found.
        //      Start iteration with 2 (otherwise, every number would be divisible by 1).

        //      Example output:
        //      The smallest divisor of 1337 is: 7

        int number = 1337;
        int smallestDivisor = 1;

        // Your solution here

        System.out.println("The smallest divisor of " + number + " is: " + smallestDivisor);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 09");
        // 09.  Greatest Common Divisor (GCD)
        //      Implement a program to find the largest common divisor (GCD) of two numbers.
        //      Use a loop and the break statement to exit the loop when the GCD is found.
        //      Hint: Start your loop from the smaller number down to 1.

        //      Example output:
        //      The Greatest Common Divisor (GCD) of 24 and 36 is: 12

        int number1Ex9 = 24;
        int number2Ex9 = 36;

        int gcd = 1; // GCD for the above numbers would be 12.

        // Your solution here

        System.out.println("The Greatest Common Divisor (GCD) of " + number1Ex9 + " and " + number2Ex9 + " is: " + gcd);

    }
}