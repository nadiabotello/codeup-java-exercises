package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);

        double box1 = rectangle.getPerimeter();
//        int box1 = rectangle.getArea();
        System.out.println(box1);

        Rectangle square = new Square(5);
//        int box2 = square.getPerimeter();
        double box2 = square.getArea();
        System.out.println(box2);

    }

}
