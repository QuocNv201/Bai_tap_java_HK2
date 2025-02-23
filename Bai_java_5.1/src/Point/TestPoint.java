package Point;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);

        // Modify point coordinates
        p1.setXY(100, 10);
        System.out.println("After modification: " + p1);
    }
}
