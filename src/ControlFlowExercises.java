import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int num, i, squared;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please enter a number from 1 to 5: \n");
        num = scanner.nextInt();

        System.out.print("number | squared | cubed \n");

        for(i=1; i<=10; i++)
        {
            squared = num*num;
            System.out.print(num + squared + num + "\n");
        }
        }


    }
