package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }
}
