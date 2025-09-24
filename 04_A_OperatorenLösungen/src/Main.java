public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 1");
        // 1. Create two int variables named "numberOne" and "numberTwo". Give the variable "numberOne" a value of 10
        //    and the "numberTwo" a value of 2.
        //    Create four other variables called "sum" (+), "difference" (-), "product" (*) and "quotient" (/).
        //    Calculate the results of the four calculations above and print them to the console.

        //    Your code here
        byte numberOne = 10;
        byte numberTwo = 2;
        int sum = numberOne+numberTwo;
        int difference = numberOne-numberTwo;
        int product = numberOne*numberTwo;
        int quotient = numberOne/numberTwo;
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        //-------------------------------------------------------------------------------------------------------------

        System.out.println("Excersice 2");
        // 2. Try to calculate the modulo-tasks below in your head before you check it.

        int moduloTask1 = 10 % 5;  //0
        int moduloTask2 = 10 % 2;  //0
        int moduloTask3 = 49 % -7; //0
        int moduloTask4 = 100 % 3; //1
        int moduloTask5 = -13 % 1; //-0
        int moduloTask6 = 13 % 6;  //1
        int moduloTask7 = 22 % -13;//9

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 3");
        // 3. Change the assignment operator so, that you are not using the variable name twice.

        // Do not change this line
        String thisIsAVeryLongStringNameAndItIsAnnoyingToRead = "Con";

        // Change the assignment operator here
        thisIsAVeryLongStringNameAndItIsAnnoyingToRead += "grats!";

        // Do not change this line
        System.out.println(thisIsAVeryLongStringNameAndItIsAnnoyingToRead);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 4");
        // 4. Same as above, but with * instead of a +.

        // Do not change this line
        int multiplication = 5;

        // Change the assignment operator here
        multiplication *=  2;

        // Do not change this line
        System.out.println(multiplication);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 5");
        // 5. Now the other way around! Change the assignment operator so, that
        //    you are using two times the variable name on the same line.

        // Do not change this line
        int subtraction = 100;

        // Change the assignment operator here
        subtraction =subtraction/4;

        // Do not change this line
        System.out.println(subtraction);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 6");
        // 6. Replace the following lines with the shorter version using the
        //    assignment operators

        // Do not change this line
        int a = 5, b = 10;

        // Change the assignment operators here
        a +=b;
        a -=b;
        a *=b;
        a /=b;
        a %=b;

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 7");
        // 7. Try to explain why the results below are as shown in the comment
        int postfixPlus = 10;
        System.out.println(postfixPlus++); // 10
        System.out.println(postfixPlus);   // 11
        // Explanation here
        // Java prints out the postfixPlus first and adds 1 after (++ = +1)
        // the second time it prints postfixPlus it was already overwritten by the firs command
        int postfixMinus = 10;
        System.out.println(postfixMinus--); // 10
        System.out.println(postfixMinus);   // 09
        // Explanation here
        // same as before only -- is equal to -1
        int prefixPlus = 5;
        System.out.println(++prefixPlus); // 6
        System.out.println(prefixPlus);   // 6
        // Explanation here
        // this time (++ = +1) first then the prefixPlus so calculation first
        int prefixMinus = 5;
        System.out.println(--prefixMinus); // 4
        System.out.println(prefixMinus);   // 4
        // Explanation here
        // Same as above
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 8");
        // 8. Change the values of the booleans with the "logical not"-operator

        // Use the "logical not"-operator to print out "false" instead of "true"
        System.out.println(!true);

        // Use the "logical not"-operator to print out "true" instead of "false"
        boolean shouldBeTrue = !false;
        System.out.println(shouldBeTrue);

        //  What is the difference between these 2 lines
        boolean testBoolean1 = !false;
        System.out.println(testBoolean1);
        // and these 2 lines?
        boolean testBoolean2 = false;
        System.out.println(!testBoolean2);

        // Your answer here
        // first prints out true second one prints out false
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 9");
        // 9. Can you explain the result below?

        int maxInt = Integer.MAX_VALUE; // 2147483647
        int minInt = Integer.MIN_VALUE; // -2147483648

        //Why does it go from a positive value to a negative value?
        System.out.println("Max int test:");
        System.out.println(maxInt);
        maxInt++;
        System.out.println(maxInt);

        //Why does it go from a negative value to a positive value?
        System.out.println("min int test:");
        System.out.println(minInt);
        minInt--;
        System.out.println(minInt);

        // Your answer here

        // Java loops when the range is exceeded
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 10");
        // 10. Try to figure out without checking what the value is. After that, check your answer by printing it out.
        //     Was the answer unexpected?

        int i = 10;
        int result = i++ % 5;
        // What is the value of "i" and "result" after executing the code?
        // Your answer here
        // i =11 result =0
        result = ++i % 5;
        // What is the value of "i" and "result" after executing the code?
        // Your answer here
        // i = 11 result = 2
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 11");
        // 11. We know that we can concatenate Strings with the "+"-operator as the code below shows.

        String concatenateMe = "This is a";
        concatenateMe += " concatenation!";
        System.out.println(concatenateMe);

        //     What happens, if instead of using the "+"-operator, you use the "-"-operator?

        //     Answer here

        // java gives an error message

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 12");
        // 12. By using parentheses, you can affect the order of operations.
        //     Everything inside in parentheses are performed before outside of them.
        //     Write in comments the exact steps down.
        //     Example:
        //     int example = 1 + 3 * 4 + (1 + 2);
        //                   1 + 3 * 4 + 3
        //                   1 + 12    + 3
        //                   16

        int calculationWithParentheses = (2 + 2) + 5 * (3 + 2);
        // Your steps here
        // and here...

        /* 2 + 2 = 4      3 + 2 = 5
        4 + 5 * 5
        5 * 5 = 25
        4 + 25 = 29 */

        System.out.println(calculationWithParentheses);

        int calculationWithoutParentheses = 2 + 2 + 5 * 3 + 2;
        // Your steps here
        // and here...

        /* 5 * 3 = 15
         2 + 2 + 15 + 2 = 21 */

        System.out.println(calculationWithoutParentheses);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 13");
        // 13. Division all again! Check the code below.
        //     Calculate the answer in your head and write it down in the comment.
        //     Now check what the "resultQuotient" in the System.out.println is printing.
        //     Is this the correct answer?
        //     Can you explain why this is happening?

        int dividend = 10;
        int divisor = 3;

        // What is the expected answer?
        // Expected Answer:

        // 10 / 3 = 3 Rest 1   or 3.3333...

        int resultQuotient = dividend / divisor;
        System.out.println(resultQuotient);

        // Explanation of the value of "resultQuotient"
        // Your explanation here:

        // int cant display .33333 or Rest 1 so it only shows the number before the .

        // How could you fix it?
        // Your answer here

        /*If you change the code to:
        int resultQuotient = dividend / divisor;
        System.out.print(resultQuotient);
        System.out.println(" Rest " + dividend % divisor);

        or if you change the int to float or double depending on how accurate you want it to be for example:

        float dividend = 10;
        float divisor = 3;
        float resultQuotient = dividend / divisor;
        System.out.println(resultQuotient);

         */
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 14");

        // In 2014, the song "Gangnam style" "broke" youtube by showing a negative view count:
        // -2142871897 (depending on the time, it was either higher or lower)
        // Try to explain why that happened

        // it was so high it looped back

        // Try to mimic it so, that it will show the correct numbers in the print
        // Do not change the 'System.out.println(viewCount)'-lines

        int viewCount = 2147483647; // Set a reasonable value here (See excersice 9 for help)
        System.out.println(viewCount); //  Should show: 2_147_483_647
        viewCount += 1; // Set a reasonable value here again
        System.out.println(viewCount); // Should show: -2_147_483_648 (underscore for readability)
        viewCount += 4611751; // Set a reasonable value here again
        System.out.println(viewCount); // Should show: -2_142_871_897 (underscore for readability)

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Excersice 15");
        // 14. OPTIONAL:
        //    Try to figure out what is going on with the next few lines of code.
        //    Can you explain exactly at which point which value "x" has?

        int x = 1; // 1
        x = x++ + ++x; // 3
        System.out.println(x); // Why is the solution 4?
        // because x++ the ++ part gets only added for the next output

    }
}