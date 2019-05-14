import java.util.Scanner;
import java.util.Random;

public class ConsoleAdventureGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Hello hero! Please enter your name:\n");

        String heroName = scanner.next();

        System.out.println("You entered: --> \"" + heroName + "\" <--");

        System.out.format("Are you ready to begin your quest, %s? [Yes/No]\n", heroName);

        String heroesAnswer = scanner.next();

        boolean confirmation = heroesAnswer.equals("Yes");

        // function to start game --> THEN

        if (confirmation) {
            // display enemy stats

            int enemyHealthN = rand.nextInt(10);
            int enemyAttackN = rand.nextInt(10);

            System.out.println("/////////////////////////// \n");
            System.out.println("ENEMY STATS -- ");
            System.out.println("HEALTH: " + enemyHealthN + "\n");


            // display user stats

            int userHealthN = rand.nextInt(10);
            int userAttackN = rand.nextInt(10);

            System.out.println("/////////////////////////// \n");
            System.out.printf("%s's STATS -- \n", heroName);
            System.out.println("HEALTH: " + userHealthN + "\n");
            System.out.println("///////////////////////////");


            // ready to attack?

            System.out.printf("%s, would you like to attack? [Yes/No] \n", heroName);
            String attackAnswer = scanner.next();
            boolean attackConfirmation = attackAnswer.equals("Yes");

            // attack function

            if (attackConfirmation) {

                if (userAttackN > enemyAttackN) {
                    enemyAttackN -= rand.nextInt(10);

                    if (enemyAttackN <= 0) {
                        System.out.println("You attacked! They're dead!\n");
                    } else if (enemyHealthN >= 0) {
                        System.out.println("Attack, again? [Yes/No] \n");
                    }

                } else if (userHealthN > enemyHealthN) {
                    enemyHealthN -= rand.nextInt(10);
                    System.out.println("They need another hit." + enemyHealthN + "\n");

                }


            } else {
                System.out.println("See you later!");
            }

        }


    }

}
