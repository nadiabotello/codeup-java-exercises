import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello hero! Please enter your name:\n");

        String heroName = scanner.next();

        System.out.println("You entered: --> \"" + heroName + "\" <--");


    }

}
