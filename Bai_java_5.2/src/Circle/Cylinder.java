package Circle;

public class Cylinder {
    private Circle base; 
    private double height;

    public Cylinder() {
        base = new Circle(); 
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius); 
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color); 
    }

    public double getRadius() {
        return base.getRadius();
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return base.getColor(); 
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + "]";
    }
}
