package Shape;
class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
        return length;
    }
    
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    
    @Override
    public String toString() {
        return "Square[side=" + length + ", color=" + color + ", filled=" + filled + "]";
    }
}
