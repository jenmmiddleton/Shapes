public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle (int height, int width) {
        this.height = height;
        this.width = width;
    }


    public int getHeight () {
        return height;
    }

    public int getWidth () {
        return width;
    }

    @Override
    public double getPerimeter () {
        return ((width * 2) + (height * 2));
    }

    @Override
    public double getArea () {
        return width * height;
    }

    public static void main (String[] args) {
        Rectangle myRect = new Rectangle(10, 7);
        System.out.println("Height is correct: " + (myRect.getHeight() == 10));
        System.out.println("Width is correct: " + (myRect.getWidth() == 7));
        System.out.println("Area is correct: " + (myRect.getArea() == 70));
        System.out.println("Perimeter is correct: " + (myRect.getPerimeter() == (10 * 2 + 7 * 2)));


    }
}
