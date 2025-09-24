public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Naming

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber; // valid

        // int firstNumber; //valid

        // int tryThisNumber; //valid

        // int _myNumber; // valid

        // int int; // not valid int is reserved from java

        // int _number_; // valid

        //int i; // valid

        // int number1; // valid

        // int .product; // not valid

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1; // valid
        int speed; // valid
        int JustANUmber; // not valid
        int justAnotherNumber; // valid
        int _weather; // not recommended
        int _Id; // not recommended
        int $Money; // not valid
        int moneyinthebankaccount; // valid not recommended
        int aLotOfmoneyonbankAccount; // valid not recommended
        int circumstanceEarthInKM; // valid
        int circumstanceEarth_KM; // valid

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

       float meineGleitkommaZahl = 23.5f;

       byte meineSehrKleineGanzzahl = 50;

       char meinUnicodeZeichen = '\u003D';

       short meineKleineGanzzahl = 200;

       char meinBuchstabe = 'B';

       float meineNegativeGleitkommaZahl = -14.612f;

       double meineGrosseGleitkommaZahl = 50.1234567890123d;

       boolean meinWahrheitswert1 = false;

       int meineNormaleGanzzahl = 50_000;

       long meineGrosseGanzzahl = 123_456_789_012_345L;

       boolean  meinWahrheitswert2 = true;


        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.


        int monyInBankAccount = 100_000; /* can change all the time based on income and expenses */

        final short myBirthyear = 2001; /* does not change */

        byte amountOfMonths = 12; /* i don't know the context could be months in a year or could be a duration of an analytic
        for a business which might be changed */

        final float gravityForce = 9.81f; /* depends on what we are calculating on Earth it does not change if we calculate
        on the moon its different but should remain constant */

        final byte amountOfMinutesPerHour = 60; /* is fixed does not change */

        final short amountOfSecondsPerHour = 3600; /* is fixed does not change */

        final float pi = 3.14159f; /* is a shortened version to avoid errors better not to change this value */

        short amountOfStudents = 167; /* can change from year to year or if someone drops out */

        //--------------------------------------------------------------------------------------------------------------
    }
}