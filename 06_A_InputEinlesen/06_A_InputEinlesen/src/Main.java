import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!
        String firstName;
        String lastName;
        byte age;
        String birthDay;
        byte birthDayByte;
        String birthMonth;
        byte birthMonthByte;
        String birthYear;
        short birthYearByte;
        String student;
        String favFood;
        Scanner userInput = new Scanner(System.in);

        System.out.println("first name");
        firstName = userInput.nextLine();

        System.out.println("last name");
        lastName = userInput.nextLine();


        System.out.println("Age in numbers");
        try {
            age = userInput.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input ");
            age = 0;
        }
        String junk;
        junk = userInput.nextLine();

        System.out.println("Enter the Day you were born");
        birthDay = userInput.nextLine();
        try {
            birthDayByte = Byte.parseByte(birthDay);

        } catch (NumberFormatException e) {
            birthDayByte = -1;
        }
        System.out.println("Enter Month you were born");
        birthMonth = userInput.nextLine();
        try {
            birthMonthByte = Byte.parseByte(birthMonth);
        } catch (NumberFormatException e) {
            birthMonthByte = -1;
        }
        System.out.println("Enter the Year you were born in");
        birthYear = userInput.nextLine();
        try {
            birthYearByte = Short.parseShort(birthYear);
        } catch (NumberFormatException e) {
            birthYearByte = -1;
        }

        System.out.println("Are you a Student");
        student = userInput.nextLine();

        System.out.println(" whats your favourite food");
        favFood = userInput.nextLine();

        System.out.println("hi " + firstName + " " + lastName);

        System.out.println("You are " + age + " years old");

        if (birthDayByte >= 0 && birthMonthByte >= 0 && birthYearByte >= 0) {
            System.out.println("you wer born on the date: " + birthDayByte + "." + birthMonthByte + "." + birthYearByte);
        } else
            System.out.println("you wer born on  " + birthDay + " in the Month of " + birthMonth + " in the year " + birthYear);

        String studentYes;
        String studentNo;
        studentYes = "yes";
        studentNo = "no";
        if (student.equalsIgnoreCase(studentYes)) {
            System.out.println("You are a Student");
        } else if (student.equalsIgnoreCase(studentNo)) {
            System.out.println("You are not a Student");
        } else {
            System.out.println("Incorrect user input");
        }

        System.out.println("your favourite food is " + favFood);
        if (birthDayByte >= 0 && birthMonthByte >= 0 && birthYearByte >= 0) {
            System.out.println("you have lived aproximatly " + ((age * 365) + ((12 - birthMonthByte) * 30) + (30 - birthDayByte)));
        } else {
            System.out.println("can not calculate days lived because date wasnt input as numbers");
        }


        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication
        byte nummber1;
        byte nummber2;
        System.out.println("enter number between -128 and 127");
        nummber1 = userInput.nextByte();
        System.out.println("enter second number between -128 and 127");
        nummber2 = userInput.nextByte();
        System.out.println("addition " + (nummber1 + nummber2));
        System.out.println("subtraction " + (nummber1 - nummber2));
        System.out.println("division " + (nummber1 / nummber2));
        System.out.println("multiplication " + (nummber1 * nummber2));
        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
        short weight;
        float height;
        System.out.println("enter weight in kg");
        weight = userInput.nextShort();
        System.out.println("enter height in m");
        height = userInput.nextFloat();
        System.out.println("your BMI is " + (weight / (height * height)));
        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min
        short minutes;
        System.out.println("input minutes");
        minutes = userInput.nextShort();
        System.out.println((minutes / 60) + " h " + (minutes % 60) + " min");
        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).
        short radius;
        System.out.println("input radius");
        radius = userInput.nextShort();
        System.out.println("circumfrence " + (2 * Math.PI * radius) + " area " + (Math.PI * (radius * radius)));
        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
        short bill;
        byte tip;
        System.out.println("input Bill");
        bill = userInput.nextShort();
        System.out.println("input tip in %");
        tip = userInput.nextByte();
        System.out.println("Total " + (((bill / 100) * tip) + bill));
        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
        float hWage;
        float hours;
        System.out.println("whats your hourly wage");
        hWage = userInput.nextFloat();
        System.out.println("how many hours do you work in a week");
        hours = userInput.nextFloat();
        System.out.println("your monthly wage is " + ((hours * 4) * hWage));
        System.out.println("your yearly wage is " + (((hours * 4) * hWage) * 12));
        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!

        String aw1;
        String aw2;
        String aw3;
        String aw4;
        String aw5;
        String aw6;
        String aw7;
        String aw8;
        String aw9;
        String aw10;
        int points;
        points = 0;

        junk = userInput.nextLine();

        System.out.println("how many axis has a 3d printer");
        aw1 = userInput.nextLine(); //3
        System.out.println("xy plane is from witch direction view");
        aw2 = userInput.nextLine();// top above birdseye
        System.out.println("witch is the most used type of filament ");
        aw3 = userInput.nextLine();// PLA
        System.out.println("whats the highest resolution you can print with filament in mm");
        aw4 = userInput.nextLine();//0.2
        System.out.println("with what do you clean the hotbed");
        aw5 = userInput.nextLine();// isopropanol
        System.out.println("is it important that the bed is leveld");
        aw6 = userInput.nextLine();// yes
        System.out.println("what is the hotend");
        aw7 = userInput.nextLine();//the nozzle with heatsink
        System.out.println("what is the usual nozzel temp for PLA");
        aw8 = userInput.nextLine();// 210 - 230
        System.out.println("What can you do in the slicer to increase bed adhesion");
        aw9 = userInput.nextLine();// raft
        System.out.println("why do some prints need support material");
        aw10 = userInput.nextLine();// overhangs

        String aw1L;
        aw1L = "three";
        int aw1int;
        try {
            aw1int = Integer.parseInt(aw1);
        } catch (NumberFormatException e) {
            aw1int = 0;
        }
        if (aw1int == 3) {
            ++points;
        } else if (aw1.equalsIgnoreCase(aw1L)) {
            ++points;
        }

        String aw2L1;
        String aw2L2;
        String aw2L3;
        aw2L1 = "top";
        aw2L2 = "above";
        aw2L3 = "birdseye";
        if (aw2.equalsIgnoreCase(aw2L1) || aw2.equalsIgnoreCase(aw2L2) || aw2.equalsIgnoreCase(aw2L3)) {
            ++points;
        }
        String aw3L;
        aw3L = "PLA";
        if (aw3.equalsIgnoreCase(aw3L)) {
            ++points;
        }

        float aw4float;
        try {
            aw4float = Float.parseFloat(aw4);
        } catch (NumberFormatException e) {
            aw4float = 9;
        }

        if (aw4float > 0.20 && aw4float < 0.21) {
            ++points;
        }

        String aw5L;
        aw5L = "isopropanol";

        if (aw5.equalsIgnoreCase(aw5L)) {
            ++points;
        }

        String aw6L;
        aw6L = "yes";
        if (aw6.equalsIgnoreCase(aw6L)) {
            ++points;
        }
        String aw7L;
        String aw7L2;
        aw7L = "the nozzle with heatsink";
        aw7L2 = "nozzle with heatsink";
        if (aw7.equalsIgnoreCase(aw7L) || aw7.equalsIgnoreCase(aw7L2)) {
            ++points;
        }

        int aw8int;
        try {
            aw8int = Integer.parseInt(aw8);
        } catch (NumberFormatException e) {
            aw8int = 0;
        }
        if (aw8int >= 210 && aw8int <= 230) {
            ++points;
        }

        String aw9L;
        aw9L = "raft";
        if (aw9.equalsIgnoreCase(aw9L)) {
            ++points;
        }

        String aw10L;
        aw10L = "overhangs";
        if (aw10.equalsIgnoreCase(aw10L)) {
            ++points;
        }
        System.out.println("your score is " + points);

        userInput.close();
        // Make sure you didn't forget to close the scanner :)
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);