package shapes;

public class Square extends Rectangle {

    public int side;

    public Square(int side) {
        super (side, side);
    }


    @Override
    public int getArea () {
        int area = length * length;
        return area;
    }

    @Override
    public int getPerimeter() {
        int perimeter = 4 * length;
        return perimeter;
    }

}
