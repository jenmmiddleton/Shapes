import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape> ();

        shapes.add(new Rectangle(10, 7));
        shapes.add(new Rectangle(5,3));
        shapes.add(new Triangle(10, 7, 2));
        shapes.add(new Triangle(5,3, 1));
        shapes.add(new Circle(5));
        shapes.add(new Circle(8));
        shapes.add(new Square(10));
        shapes.add(new Square(3));

        long areaSum = 0;
        System.out.println();
        for(Shape shape : shapes) {
            areaSum += Math.round(shape.getArea());
        }
        System.out.println("Shape Area Sum is correct: " + (areaSum == 703));

        shapes.stream()
                .map(s -> Math.round(s.getArea()))
                .forEach(shapeArea -> System.out.println(shapeArea));

        int perimeterSum = 0;
        System.out.println();
        for(Shape shape : shapes) {
            perimeterSum += shape.getPerimeter();
        }
        System.out.println("Shape Perimeter Sum is correct: " + (perimeterSum == 211));

        shapes.stream()
                .map(s -> Math.round(s.getPerimeter()))
                .forEach(shapePerim -> System.out.println(shapePerim));
    }
}
