package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4, 5);
        Rectangle box2 = new Square(5);

//        double box1 = rectangle.getPerimeter();
//        int box1 = rectangle.getArea();
//        System.out.println(box1);

//        Rectangle square = new Square(5);
//        int box2 = square.getPerimeter();
//        double box2 = square.getArea();
//        System.out.println(box2);

        System.out.println("Area is: " + box1.getArea() + " & Perimeter is: " + box1.getPerimeter());
        System.out.println("Area is: " + box2.getArea() + " & Perimeter is: " + box2.getPerimeter());

    }

}
