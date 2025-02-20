package MyCircle;

public class TestMain {
	    public static void main(String[] args) {
	        MyCircle c1 = new MyCircle(1, 2, 3);
	        MyCircle c2 = new MyCircle(new MyPoint(4, 5), 6);
	        MyCircle c3 = new MyCircle();

	        System.out.println("Circle 1: " + c1);
	        System.out.println("Circle 2: " + c2);
	        System.out.println("Circle 3: " + c3);

	        System.out.println("Area of Circle 1: " + c1.getArea());
	        System.out.println("Circumference of Circle 1: " + c1.getCircumference());

	        System.out.println("Distance between Circle 1 and Circle 2: " + c1.distance(c2));

	        c1.setCenterXY(10, 10);
	        c1.setRadius(5);
	        System.out.println("Updated Circle 1: " + c1);
	    }
	}
