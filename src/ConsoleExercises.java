import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f", pi);

        System.out.print("Please enter a number:\n");
        int numberEntered = scanner.nextInt();

        System.out.println("You entered: --> \"" + numberEntered + "\" <--");

        System.out.print("Please enter three words:\n");

        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

        System.out.println("You entered: --> \"" + userInput1 + "\n" + userInput2 + "\n" + userInput3 + "\n" + "\" <--");

        System.out.print("Please enter a sentence:\n");

        String userSentence = scanner.nextLine();

        System.out.println("You entered: --> \"" + userSentence + "\" <--");

        System.out.print("Please enter length x width of classroom:\n");

//        String perimeterInput = scanner.nextLine();
//        int intConversion = Integer.parseInt(perimeterInput);
//        int area = intConversion * intConversion;
//        int perimeter = intConversion + intConversion + intConversion + intConversion;
//
//        System.out.println("You entered: --> \"" + intConversion + "\" <-- \n The area is: " + area + ". \n The perimeter is: " + perimeter + ".");


//        int perimeterInput = scanner.nextInt();

//        scanner.useDelimiter("\n");

//        int lengthInput = scanner.nextInt();
//        int widthInput = scanner.nextInt();
//
//        int area = lengthInput * widthInput;
//        int perimeter = lengthInput + lengthInput + widthInput + widthInput;
//
//        System.out.println("You entered: --> \"" + lengthInput + " " + widthInput + "\" <-- \n The area is: " + area + ". \n The perimeter is: " + perimeter + ".");


        double lengthInputDec = scanner.nextDouble();
        double widthInputDec = scanner.nextDouble();

        double areaDec = lengthInputDec * widthInputDec;
        double perimeterDec = lengthInputDec + lengthInputDec + widthInputDec + widthInputDec;

        System.out.println("You entered: --> \"" + lengthInputDec + " " + widthInputDec + "\" <-- \n The area is: " + areaDec + ". \n The perimeter is: " + perimeterDec + ".");


    }
}
