import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 1");
        // 01.  Check in an if-statement if the bigNumber is greater than the smallNumber.
        //      If the bigNumber is greater than the smallNumber, then print it so, that the following output is given:
        //      5000 is greater than 1!
        //      Don't type the number in the print-statement, use the variables

        int bigNumber = 5000;
        byte smallNumber = 1;


        // Your solution here:
        if (bigNumber > smallNumber) {
            System.out.println("5000 is greater than 1!");
        }

        // There are multiple ways to solve this problem.
        // One option would be to make the comparison directly in the if-statement.
        // Another option would be to make a variable, store the result in there and then check that variable in the
        // if-statement.
        // Implement the other one, which you haven't implemented above, here as well:

        // Your solution here:
        boolean correct = bigNumber > smallNumber;
        if (correct) {
            System.out.println("5000 is greater than 1!");
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 2");
        // 02.  Create a Scanner object named "userInputScanner". (Don't forget to import the scanner)
        byte speedLimit = 120;
        int drivingSpeed;
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("How fast do you drive?");
        // Get the user input with the scanner and safe it in the variable drivingSpeed
        drivingSpeed = userInputScanner.nextInt();
        // Check if the drivingSpeed is greater than the value of the variable "speedlimit".
        // If so, print "You drove too fast!"
        if (drivingSpeed > speedLimit) {
            System.out.println("You drove too fast");
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 3");
        // 03.  Write a program that prompts the user for a year.
        //      If the user input is smaller than 2000, then the program prints
        //      the string "Ancient history!"
        int year;
        System.out.println("input a year");
        year = userInputScanner.nextInt();
        if (year < 2000) {
            System.out.println("Ancient history");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 4");
        // 04.  Use the variables "speedLimit" and "drivingSpeed" from exercise 2.
        //      In this task, you need to enhance the speed-checking functionality.
        //      Ask the user again to input its driving speed.
        //      Print "You drove too fast!" if the "drivingSpeed" exceeds the "speedLimit."
        //      If the "drivingSpeed" is within the limit, print "You are all good!"
        System.out.println("input driving speed");
        drivingSpeed = userInputScanner.nextInt();
        if (drivingSpeed > speedLimit) {
            System.out.println("You drove too fast");
        } else {
            System.out.println("You are all good");
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 5");
        // 05.  Ask the user for his age.
        //      If he is older than 21, then let the user know that he is legally allowed to consume alcohol.
        //      If not, then tell the user that it is not legally allowed
        //      to consume alcohol everywhere in the world.
        byte age;
        byte legalage = 21;
        System.out.println("how old are you");
        age = userInputScanner.nextByte();
        if (age > legalage) {
            System.out.println("You are allowed to drink Alcohol around the World");
        } else {
            System.out.println("You are not allowed to drink Alcohol around the World");
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 6");
        // 06.  Now do the same as in exercise 5, but instead of only checking if the user is only 21,
        //      we also want to check if he is older than 18.

        //      If he is younger than 18, let the user know that he is not legally allowed to consume alcohol
        //      in most parts of the world,

        //      If however he is younger than 21, tell the user that he is legally allowed to consume alcohol
        //      in most parts of the world, except the United States,

        //      However, if the user is older than 21, then tell him that he is allowed to consume alcohol
        //      everywhere.
        byte legalAgeNotUSA = 18;
        if (age > legalAgeNotUSA) {
            if (age > legalage) {
                System.out.println("You are allowed to drink Alcohol around the world");
            } else {
                System.out.println("You are allowed to drink Alcohol around the World except in USA");
            }
        } else {
            System.out.println("You are not allowed to drink Alcohol anywhere");
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 7");
        // 07.  Ask the user for his age and IQ, and save those values in variables.
        //      If the user is younger than 20, then print out "You are still young".
        //      And if the user also has an IQ higher than 120, then print out this:
        //      " ...and also very smart!"
        short IQ;
        short smart = 120;
        System.out.println("input IQ");
        IQ = userInputScanner.nextShort();
        if (age < 20 && IQ >= smart) {
            System.out.println("You are still young and very smart");
        } else if (age < 20) {
            System.out.println("You are still young");
        } else if (IQ >= smart) {
            System.out.println("You are smart");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 8");
        // 08.  Write a program that prompts the user for two integers and prints the larger of the two.
        //      If the numbers are the same, then the program informs us about this as well.
        //
        //      Sample output 1:
        //      Give the first number:
        //      7
        //      Give the second number:
        //      2
        //      Greater number is: 7
        //
        //
        //      Sample output 2:
        //      Give the first number:
        //      1
        //      Give the second number:
        //      9
        //      Greater number is: 9
        //
        //
        //      Sample output 3:
        //      Give the first number:
        //      3
        //      Give the second number:
        //      3
        //      The numbers are equal!
        System.out.println("Input two numbers");
        int number1;
        int number2;
        number1 = userInputScanner.nextInt();
        number2 = userInputScanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1);
        } else if (number1 < number2) {
            System.out.println(number2);
        } else {
            System.out.println("Numbers are equal");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 9");
        // 09.  Write a program that give a course grade based on the values below:
        //      < 0       impossible
        //      0-30      failed
        //      31-50     poor
        //      51-60     ok
        //      61-80     good
        //      81-90     very good
        //      91-100    awesome!
        //      > 100     impossible
        byte grade;
        System.out.println("Input grade");
        grade = userInputScanner.nextByte();
        if (grade >= 51 && grade <= 60) {
            System.out.println("ok");
        } else if (grade >= 61 && grade <= 80) {
            System.out.println("good");
        } else if (grade >= 81 && grade <= 90) {
            System.out.println("very good");
        } else if (grade >= 31 && grade <= 50) {
            System.out.println("poor");
        } else if (grade >= 0 && grade <= 30) {
            System.out.println("failed");
        } else if (grade < 0 || grade > 100) {
            System.out.println("impossible");
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 10");
        // 10.  Write a little program which checks the state of a door. If the door is open, print: "Entering room...".
        //      If the door is not open, print: "Opening door....".
        //      Write your solution with
        //      1. an if-else-statement and
        //      2. with its short form. (Don't forget: You can only return values with the short form)

        boolean isDoorOpen = true;
        // If-else-statement here


        // Short form here


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 11");
        // 11.  There will be a huge festival coming up, and unfortunately, the prices are quite high.
        //      However, you will receive a discount if you are exactly 18 years old.
        //      Inform the user about the discount and ask for their age.
        //      If the user is exactly 18 years old, grant them the discount;
        //      otherwise, inform them that they are unfortunately not eligible for the discount.

        //      Create two solutions for this task: one that uses the "==" operator and another that uses the "!=" operator.
    }
}

