import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        String userName;
        byte option0to9;
        System.out.println("Hello and welcome ! May i know your name?");
        System.out.println("Your name:");
        userName=userInput.nextLine();
        System.out.println("Welcome "+userName);
        while (true){
            String [] menu = {
                    "(0) : Go back to startmenu",
                    "(1) : Sum from n to m (Example: 0-100 = 5050)",
                    "(2) : Guess my random number from n-m",
                    "(3) : Suggest me a song!",
                    "(4) : Pastoral care",
                    "(5) : Temperature converter",
                    "(6) : Factor finder",
                    "(7) : "
            };
            System.out.println();
        }
    }
}