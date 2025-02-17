package Rectangle;

public class Rectangle {
	private float length;
	private float width;
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float Length) {
		this.length = Length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float Width) {
		this.width = Width;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return (width+length)*2;
	}
	public String toString() {
		return " Rectangle [length = "+ length + ", width = "+ width + "]";
	}
}
