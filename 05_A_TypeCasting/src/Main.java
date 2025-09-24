import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.


        // Your code here
        //byte
        byte myByte = 10;
        short myShort = myByte;
        int myInt = myByte;
        long myLong = myByte;
        float myFloat = myByte;
        double myDouble = myByte;
        char myChar = (char) myByte;

        //short
        myInt = myShort;
        myLong = myShort;
        myFloat = myShort;
        myDouble = myShort;
        myChar = (char) myShort;

        //int
        myLong = myInt;
        myFloat = myInt;
        myDouble = myInt;
        myChar = (char) myInt;

        //long
        myFloat = myLong;
        myDouble = myLong;
        myChar = (char)myLong;

        //float
        myDouble = myFloat;
        myChar = (char) myFloat;

        //double
        myChar = (char) myDouble;

        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        // Your code here
        myLong = 1234567890L;
        myLong = myInt;
        System.out.println(myInt);
        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;
        // Try to guess first what happens, then test it.
        System.out.println(myNumber);

        // error because String isnt a number

        // Can you explain what is happening?

        // Java adds to the text 33 the number 10 and prints it out the same way it would with two Strings

        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Java cant convert text to numbers
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "-52.4948d";
        float houseNumber;

        try {

            houseNumber = Float.parseFloat(houseNumberInString);
            //
             //
             //
             //
             //
             //

        }
        catch (NumberFormatException error) {
            //
              //
             //
            System.out.println(error);
            houseNumber =0;
        } finally {

        }


        System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above
        // Write down here
        // if there is text in the string it throws out a value of 0 or if the number in String is greater than the int max/min value
    }
}