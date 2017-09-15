public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide () {
        return side;
    }

    @Override
    public double getPerimeter () {
        return (side * 4);
    }

    @Override
    public double getArea () {
        return Math.pow(side, 2);
    }

    public static void main (String[] args) {
        Square mySqr = new Square(3);
        System.out.println("Side is correct: " + (mySqr.getSide() == 3));
        System.out.println("Area is correct: " + (mySqr.getArea() == 9));
        System.out.println("Perimeter is correct: " + (mySqr.getPerimeter() == 12));


    }
}
