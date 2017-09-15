public class Triangle implements Shape {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public int getSide1 () {
        return side1;
    }

    public int getSide2 () {
        return side2;
    }

    public int getSide3 () {
        return side3;
    }

    @Override
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public double getArea() {
        double perimeter = getPerimeter();
        double inside = perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3);
        double area = Math.sqrt(inside);

        return area;
    }

    public static void main (String[] args) {
        Triangle myTriangle = new Triangle(10, 7, 2);
        System.out.println("Side 1 is correct: " + (myTriangle.getSide1() == 10));
        System.out.println("Side 2 is correct: " + (myTriangle.getSide2() == 7));
        System.out.println("Side 2 is correct: " + (myTriangle.getSide3() == 2));
        System.out.println("Perimeter is correct: " + (myTriangle.getPerimeter() == 19));
        System.out.println("Area is correct: " + (Math.round(myTriangle.getArea()) == 187));
    }
}
