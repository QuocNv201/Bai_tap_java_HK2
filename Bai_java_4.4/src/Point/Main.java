package Point;

public class Main {

	    public static void main(String[] args) {
	        Point point = new Point(2.5f, 3.5f);
	        System.out.println("Point: " + point);

	        MovablePoint movablePoint = new MovablePoint(2.5f, 3.5f, 1.0f, 1.5f);
	        System.out.println("Before move: " + movablePoint);
	        movablePoint.move();
	        System.out.println("After move: " + movablePoint);
	    }
	}
