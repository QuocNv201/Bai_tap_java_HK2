
public class Circle {
	private double radius;
	private String color;
	
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

