import java.util.Scanner;

public class HighLow {

    static Scanner scan = new Scanner(System.in);
    static int guess;

    public static void main(String[] args) {

        int rnd = (int) (Math.random() * 100) + 1;
        game(rnd);

    }

    public static void game(int random) {
        System.out.println("random = " + random);

        do {
            guess = getInteger(1, 100);

            if (guess > random) {
                System.out.println("Go LOWER");
            } else if (guess < random) {
                System.out.println("Go HIGHER");
            } else {
                System.out.println("You guessed right!");
                break;
            }
        } while (true);

    }

    @SuppressWarnings("Duplicates")
    public static int getInteger(int min, int max) {
        System.out.println("Give me a number: ");
        int input = Integer.parseInt(scan.nextLine());

        if (input >= min && input <= max) {
            return input;
        } else {
            System.out.println("Number out of range");
            return getInteger(min, max);
        }
    }
}

