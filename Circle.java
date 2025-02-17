<<<<<<< HEAD
=======
package Circle;
>>>>>>> d275052 (Bai 1.1)

public class Circle {
	private double radius;
	private String color;
	
<<<<<<< HEAD
public Circle() {
	radius = 1.0;
	color = "red";
}
public Circle(double r) {
	radius = r;
	color = "red";
}
public Circle (double r, String c) {
	this.radius = r;
	this.color = c;
}
public double getRadius() {
	return radius;
}
public double getArea() {
	return radius*radius*Math.PI;
}
public String getColor() {
	   return color;
}
/** Setter for instance variable radius */
public void setRadius(double newRadius) {
   this.radius = newRadius;   // "this.radius" tham chiếu biến instance
}

/** Setter for instance variable color */
public void setColor(String newColor) {
   this.color = newColor;
}
public String toString() {
	   return "Circle[radius=" + radius + ", color=" + color + "]";
	}
}

=======
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		color = "red";
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public String toString() {
		return " Circle[radius = " + radius +" color " + color +"]";
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
>>>>>>> d275052 (Bai 1.1)
