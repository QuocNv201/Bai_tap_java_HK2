package Shape;

public class TestShapes {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle(5.0, "blue", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4.0, 6.0, "yellow", false);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(4.0);
        System.out.println(square);
        square.setWidth(5.0);
        System.out.println("After setting side to 5.0: " + square);
    }
}
