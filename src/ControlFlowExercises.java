public class ControlFlowExercises {
    public static void main(String[] args) {


        long i = 2;

        do {
            System.out.println("i = " + i);
            i *= i;
        } while (i < 1000000);

//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }



    }
}
