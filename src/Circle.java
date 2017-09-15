public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter () {
        return (2 * Math.PI * radius);
    }

    @Override
    public double getArea () {
        double radiusSquared = Math.pow(radius, 2);
        return (radiusSquared * Math.PI);
    }

    public static void main (String[] args) {
        Circle myCircle = new Circle(8);
        System.out.println("Radius is correct: " + (myCircle.getRadius() == 8));
        System.out.println("Perimeter is correct: " + (Math.round(myCircle.getPerimeter()) == 50));
        System.out.println("Area is correct: " + (Math.round(myCircle.getArea()) == 201));


    }
}
