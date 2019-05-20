package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(String msg){
        System.out.println(msg);
        return scanner.nextLine().trim().toLowerCase();
    }

    // Catch cases when we run getString without params
    public String getString(){
        return getString("Write something: ");
    }

    public boolean yesNo(){
        String input = getString("Type yes/no: ");
        return input.equals("yes") || input.equals("y");
    }

    public int getInt(int min, int max){
        int num = getInt();

        if(num < min || num > max){
            System.out.println("Error outside of the boundaries");
            return getInt(min, max);
        }

        return num;
    }

    public int getInt(){
        return Integer.parseInt(getString("Please give me a number: "));
    }

    public double getDouble(){
        return Double.parseDouble(getString("Give me a decimal"));
    }

    public double getDouble(double min, double max){
        double num = getDouble();

        if(num < min || num > max){
            System.out.println("Error outside of the boundaries");
            return getDouble(min, max);
        }

        return num;
    }


}




//package util;
//import java.util.Scanner;
//
//
//public class Input {
//
//    private Scanner scanner;
//
////    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");
//
//    public Input() {
//
//        this.scanner = new Scanner(System.in).useDelimiter("\n");
//
//    }
//
//    public String getString(){
//
//        System.out.println("Write something: ");
//        return this.scanner.nextLine().trim().toLowerCase();
//
//    }
//
//    // getString method-overloading
//
////    public String getString(String msg){
////
////        System.out.println(msg);
////        return this.scanner.nextLine().trim().toLowerCase();
////
////    }
////
////    public String getString(){
////
////        return getString("write something");
////
////    }
//
//    public boolean yesNo(){
//
//        System.out.println("[y/n]");
//        String input = this.scanner.nextLine();
//        return input.equals("y");
//
//        // reusing earlier method for cleaner code based on walk-through
////        return getString().equals("yes");
//
//    }
//
//    public int getInt(int min, int max){
//
//        System.out.println("Enter an int value min: " + min + " & max: " + max);
//
//        boolean correctInput = false;
//
//        int input;
//
//        do {
//            input = this.scanner.nextInt();
//            if (input >= min && input <= max){
//                correctInput = true;
//            } else {
//                System.out.println("Enter a value min: " + min + " & max: " + max);
//            }
//
//        } while (!correctInput);
//
//        return input;
//    }
//
//    public int getInt(){
//
//        System.out.println("Enter a number.");
//
//        return this.scanner.nextInt();
//    }
//
//    // exercise walk-through
//
////    public int getInt(int min, int max) {
////        int num = Integer.parseInt(getString("Give me a number between:" + min + " and " + max));
////
////
////    }
//
//
//
//
//    public double getDouble(double min, double max){
//
//        System.out.println("Enter a value min: " + min + " & max: " + max);
//
//        boolean correctInput = false;
//        double input;
//
//        do {
//            input = this.scanner.nextDouble();
//            if (input >= min && input <= max){
//                correctInput = true;
//            } else {
//                System.out.println("Enter a double value min: " + min + " & max: " + max);
//            }
//
//        } while (!correctInput);
//
//        return input;
//    }
//
//    public double getDouble(){
//
//        System.out.println("Enter a radius.");
//        return this.scanner.nextDouble();
//    }
//
//
//
//}
