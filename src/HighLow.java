import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        System.out.print("Guess a number. \n");
        rollValidation();

    }

    public static void rollValidation() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = scanner.nextInt();
        int randomNumber = random.nextInt(100);


            if (num >= 1 & num <= 100) {
//                System.out.println("You are within range.");

//                do {
                    if (num >= randomNumber) {
                        System.out.println("LOWER");
                    } else {
                        System.out.println("HIGHER");
                    }
//
//                } while (true);


            } else {
                System.out.print("Please enter a valid number between 1 and 100.");
            }

    }


}