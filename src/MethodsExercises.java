import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        printTotals(addition(2,3));
//        printTotals(subtraction(10, 4));
//        printTotals(multiplication(5,4));
//        printTotals(division(10, 2));
//        printTotals(modulus(3, 1));
//        printTotals(getMulti(10, 2));
//        getInteger(1, 10);
//        factorial();
    }

//    public static int addition(int a, int b){
//        int total;
//        total = a + b;
//        return total;
//    }
//
//    public static int subtraction(int a, int b){
//        int total;
//        total = a - b;
//        return total;
//    }
//
//    public static int multiplication(int a, int b){
//        int total;
//        total = a * b;
//        return total;
//    }
//
//    public static int division(int a, int b){
//        int total;
//        total = a / b;
//        return total;
//    }
//
//    public static int modulus(int a, int b){
//        int total;
//        total = a % b;
//        return total;
//    }
//
//    public static void printTotals(int total){
//        System.out.println(total);
//    }
//
//    public static int getMulti(int a, int b) {
//        int result = 1;
//        for (int i = 1; i <= a; i++) {
//            result = a * b;
//        }
//        return result;
//    }
//
//    public static int getInteger(int min, int max) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 10: ");
//
//        int num = scanner.nextInt();
//
//        for (int i = 1; i <= max; i++) {
//            if (num >= 0 & num <= 10) {
//                System.out.println("You are within range.");
//
//            } else {
//                System.out.print("Please enter a number ONLY between 1 and 10: ");
//                int num2 = scanner.nextInt();
//                System.out.print("Works");
//            }
//            return num;
//        }
//        return num;
//    }

//    public static long factorial(){
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 10: ");
//
//        int num = scanner.nextInt();
//
//        if (num >= 0 & num <= 10) {
//            System.out.print("You entered factorial number: !" + num + " \nWould you like to continue?");
//            String answer = scanner.next();
//
//            if (answer.equalsIgnoreCase("yes")){
//
//                System.out.println("Here is your factorial output --");
//
//                long result = 1;
//
//                for (int factor = 2; factor <= num; factor++) {
//                    result *= factor;
//                    System.out.println(result);
//                }
//
//                return result;
//            }  } else {
//            System.out.print("Reload and try again.");
//        }
//        return num;
//    }
//}

public static void dice(){

        Scanner scanner = new Scanner(System.in);

        int diceSides = 6;

        System.out.print("Please enter the number of sides on a pair of dice: ");

        int answer = scanner.nextInt();

        System.out.print("Roll your dice? [Y/N]");

        String diceRoll = scanner.next();

        if (diceRoll.equalsIgnoreCase("y")){

        }




}
    }