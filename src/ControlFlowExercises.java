public class ControlFlowExercises {
    public static void main(String[] args) {


        for(int i = 0; i <= 100; i++) {

                if(i % 3 == 0) {
                    System.out.println("Fizz");
                    continue;
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                    continue;
                } else if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                    break;
                }

            System.out.println(i);
        }



    }
}
