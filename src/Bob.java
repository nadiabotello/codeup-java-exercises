import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You're about to speak with Bob... Are you there, Bob?");
        String answer = scanner.next();

        if (answer.equalsIgnoreCase("sure.")){
            System.out.println(answer.replace("sure.", "sure?"));
        }

        System.out.println("CAN YOU TAKE OUT THE TRASH, BOB?");
        String answer2 = scanner.next();

        if (answer2.equalsIgnoreCase("Whoa, chill out!")){
            System.out.println("No more Fortnite for you.");
        }

        System.out.println("Bob?");
        String answer3 = scanner.next();

        if (answer3.equalsIgnoreCase("Fine. Be that way!")){
            System.out.println("...");
        }

        System.out.println("Do you have anything else to say?");
        String answer4 = scanner.next();

        if (answer4.equalsIgnoreCase(" ")){
            System.out.println("Whatever");
        }

    }
}
