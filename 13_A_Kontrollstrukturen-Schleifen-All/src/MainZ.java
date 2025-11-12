import java.time.Year;

public class MainZ {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Use all of your knowledge for this tasks below. You are not restricted to certain loops anymore.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Calculate and print all the leap years from 0 to today's year.
        //
        //      A year is a leap year if it is divisible by 4.
        //      However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
        //
        //      Hint1: The divisibility by a particular number can be checked using the modulo operator.
        //
        //      Hint2: Check if your implementation is correct. For example; the Year 1900 is not a leap year.
        int yearNow = Year.now().getValue();
        for (int year = 0; year <= yearNow;) {
            System.out.println();
            for (int width = 0; width <= 80; width++) {
                if ((year % 4) == 0) {
                    if ((year % 100) != 0) {

                        System.out.print(year + " ");
                    } else if ((year % 100) == 0 && (year % 400) == 0) {

                        System.out.print(year + " ");
                    }
                }year++;
            }

        }
        System.out.println();
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Print out all numbers from 1-10.
        //      If a number is divisible by three, then print "Fizz".
        //      If a number is divisible by five, then print "Buzz".
        //      If a number is divisible by three and five, print "FizzBuzz".


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");  // Challenge!
        // 03.  Given a number n (n > 2 && n < 100), write a program which tells if n is a prime.
        //      Example: n = 7 -> "It's a prime number!"
        //      Example: n = 10 -> "It's not a prime number!"

        int n = 7; // change this value from prime to not prime to test
        // Your code here


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");  // Challenge+!
        // 04. Print all prime numbers from 2-100.
    }
}