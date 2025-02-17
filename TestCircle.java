
package Circle;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
	    System.out.println(c1);
		System.out.println(" The circle has radius of "
				+ c1.getRadius() + " and area of "+ c1.getArea());
		Circle c2 = new Circle(2.0);
	    System.out.println(c2);
		System.out.println(" The circle has radius of "
				+ c2.getRadius() + " and area of "+ c2.getArea());
		Circle c4 = new Circle();
		c4.setRadius(5.5);
	    System.out.println(" Radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println(" Color is: " + c4.getColor());
	    System.out.println(c4);
	    System.out.println(" After modification: " + c4);

	}
}
