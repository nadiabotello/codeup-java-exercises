public class MethodsExercises {
    public static void main(String[] args) {
        printTotals(addition(2,3));
        printTotals(subtraction(10, 4));
        printTotals(multiplication(5,4));
        printTotals(division(10, 2));
        printTotals(modulus(3, 1));
        printTotals(getMulti(10, 2));
    }

    public static int addition(int a, int b){
        int total;
        total = a + b;
        return total;
    }

    public static int subtraction(int a, int b){
        int total;
        total = a - b;
        return total;
    }

    public static int multiplication(int a, int b){
        int total;
        total = a * b;
        return total;
    }

    public static int division(int a, int b){
        int total;
        total = a / b;
        return total;
    }

    public static int modulus(int a, int b){
        int total;
        total = a % b;
        return total;
    }

    public static void printTotals(int total){
        System.out.println(total);
    }

    public static int getMulti(int a, int b) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = a * b;
        }
        return result;
    }


}
