package shapes;

public class Square extends Rectangle {

    public int side;

    public Square(int side) {
        super (side, side);
    }


    @Override
    public int getArea () {
        return super.length * super.length;
    }

    @Override
    public int getPerimeter() {
        return 4 * super.length;
    }

}
