import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        System.out.println("Guess a number. \n");
        rollValidation();
    }


    public static void rollValidation() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = Integer.parseInt(scanner.nextLine());
        int randomNumber = random.nextInt(100);

        do {

            if (num >= 1 & num <= 100) {
                if (num >= randomNumber) {
                    System.out.println("LOWER");
                    System.out.println(randomNumber + "\n");
                } else if (num <= randomNumber) {
                    System.out.println("HIGHER");
                    System.out.println(randomNumber + "\n");
                } else {
                    break;
                }

                System.out.print("Make another guess. \n");
                num = Integer.parseInt(scanner.nextLine());
            }

        } while (num != randomNumber);
        System.out.println("Good guess! You win. \n");
    }


}