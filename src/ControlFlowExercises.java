import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        count 5 - 15
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

//        count evens 2 - 100
        int evens = 0;
        do {
            if (evens % 2 == 0) {
                System.out.println(evens);
            }
            evens++;
        } while (evens <= 100);

//        count backwards by 5's from 100 - -10
        int j = 100;

        do {
            System.out.println(j);
            j -= 5;
        } while (j >= -10);

//        square numbers from 2 - 1,000,000
        long start = 2;
        do {
            System.out.println(start);
            start *= start;
        } while (start < 1000000);

//        refactor previous 2 exercises to use a for-loop
        for (int x = 100; x >= -10; x -= 5) {
            System.out.println(x);
        }

        for (long y = 2; y < 1000000; y *= y) {
            System.out.println(y);
        }

//        FizzBuzz
        for (int a = 1; a <= 100; a++) {
            if (a % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(a);
            }
        }
//        Display a table of powers
        System.out.println("Please enter an integer");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int userInput = sc.nextInt();
        System.out.println("Do you want to continue?");
        String answer = sc.next();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        if (answer.equalsIgnoreCase("yes")) {
            for (int b = 1; b <= userInput; b++) {
                int squared = b * b;
                int cubed = b * b * b;
                System.out.printf("%-7d|%-9d|%-6d%n", b, squared, cubed);
            }
        }
//        convert number grades into letter grades
        System.out.println("Please enter the student's grade:");
        int grade = sc.nextInt();
        System.out.println("Do you want to continue?");
        String userAnswer = sc.next();
        if (userAnswer.equalsIgnoreCase("yes")) {
            if (grade >= 88) {
                System.out.println("You got an A! Excellent job.");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("You got a B! Great job");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("You got a C. You passed");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("You got a D. Please review.");
            } else {
                System.out.println("You got an F. See your instructor.");
            }
        }


    }
}
