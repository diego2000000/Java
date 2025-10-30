import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.
        Scanner userInput = new Scanner(System.in);
        byte number;
        System.out.println("input number between 1 and 7");
        number = userInput.nextByte();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid Input");
        }
        System.out.println("input number between 1 and 7");
        number = userInput.nextByte();
        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("invalid Input");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.

        System.out.println("write a Month(write Month with the first letter in uppercase)");
        String skip = userInput.nextLine();
        String month = userInput.nextLine();
        switch (month) {
            case "January", "November", "December":
                System.out.println("Winter");
                break;
            case "February", "March", "April":
                System.out.println("Spring");
                break;
            case "May", "June", "July":
                System.out.println("Summer");
                break;
            case "August", "September", "October":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        month = userInput.nextLine();
        switch (month) {
            case "January", "November", "December" -> System.out.println("Winter");
            case "February", "March", "April" -> System.out.println("Spring");
            case "May", "June", "July" -> System.out.println("Summer");
            case "August", "September", "October" -> System.out.println("Autumn");
            default -> System.out.println("Invalid Input");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.
        System.out.println("Input a Month (in Numbers 1-12)");
        number = userInput.nextByte();
        switch (number) {
            case 1, 3, 5, 8, 10, 12:
                System.out.println("31 days in this Month");
                break;
            case 2, 4, 6, 7, 9, 11:
                System.out.println("30 days in this Month");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        number = userInput.nextByte();
        switch (number) {
            case 1, 3, 5, 8, 10, 12 -> System.out.println("31 days in this Month");
            case 2, 4, 6, 7, 9, 11 -> System.out.println("30 days in this Month");
            default -> System.out.println("Invalid Input");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"
        byte pClassbyte;
        System.out.println("Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric)");
        pClassbyte = userInput.nextByte();
        String pClass = switch (pClassbyte) {
            case 1 -> "Warrior";
            case 2 -> "Mage";
            case 3 -> "Rouge";
            case 4 -> "Cleric";
            default -> "Unknown Input";
        };
        switch (pClass) {
            case "Warrior" -> System.out.println("Recommended stats Strength 9 Agility 4 Intelligence 3");
            case "Mage" -> System.out.println("Recommended stats Strength 3 Agility 4 Intelligence 9");
            case "Rouge" -> System.out.println("Recommended stats Strength 3 Agility 9 Intelligence 4");
            case "Cleric" -> System.out.println("Recommended stats Strength 3 Agility 4 Intelligence 9");
            default -> System.out.println("No Class selected");
        }
        System.out.println("Select attributes total 16 points");
        System.out.println("Strength");
        byte strenght;
        byte agility;
        byte intelligence;
        short total;
        strenght=userInput.nextByte();
        System.out.println("Agility");
        agility=userInput.nextByte();
        System.out.println("Intelligence");
        intelligence=userInput.nextByte();
        total=(short) (intelligence+agility+strenght);
        if (!(total ==16)){
            System.out.println("Invalid Ability input");

        }else {
            System.out.println("your class is " + pClass + " your Strength is " + strenght + " your Agility is " + agility + " your Intelligence is " + intelligence);
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi
        System.out.println("Which digit do you want to translate?(0-9)");
        number=userInput.nextByte();
        byte language;
        System.out.println("Which digit do you want to translate? (1-german, 2-english, 3-japanese)");
        language=userInput.nextByte();
        switch (language){
            case 1:
                switch (number){
                    case 0-> System.out.println("null");
                    case 1 -> System.out.println("eins");
                    case 2-> System.out.println("zwei");
                    case 3-> System.out.println("drei");
                    case 4-> System.out.println("vier");
                    case 5-> System.out.println("fünf");
                    case 6-> System.out.println("sechs");
                    case 7-> System.out.println("sieben");
                    case 8-> System.out.println("acht");
                    case 9-> System.out.println("neun");
                    default -> System.out.println("falsche Eingabe");
                }
            case 2:
                switch (number) {
                    case 0 -> System.out.println("zero");
                    case 1 -> System.out.println("one");
                    case 2 -> System.out.println("two");
                    case 3 -> System.out.println("three");
                    case 4 -> System.out.println("four");
                    case 5 -> System.out.println("five");
                    case 6 -> System.out.println("six");
                    case 7 -> System.out.println("seven");
                    case 8 -> System.out.println("eight");
                    case 9 -> System.out.println("nine");
                    default -> System.out.println("invalid Input");
                }
            case 3:
                switch (number) {
                    case 0 -> System.out.println("zero");
                    case 1 -> System.out.println("ichi");
                    case 2 -> System.out.println("ni");
                    case 3 -> System.out.println("san");
                    case 4 -> System.out.println("shi");
                    case 5 -> System.out.println("go");
                    case 6 -> System.out.println("roku");
                    case 7 -> System.out.println("nana");
                    case 8 -> System.out.println("hachi");
                    case 9 -> System.out.println("kyuu");
                    default -> System.out.println("Mukō na sūchi");
                }
            default:
                System.out.println("invalid Input");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.
    }
}