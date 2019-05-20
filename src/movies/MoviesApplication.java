package movies;
import util.Input;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        Movie[] Movies = MoviesArray.findAll();


        System.out.println("\n What would you like to do? \n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category \n");
//        System.out.println(input.getInt());


        if (input.getInt() == 1){

            for (Movie movie : Movies) {
                System.out.println(movie);
            }

        }

}}
