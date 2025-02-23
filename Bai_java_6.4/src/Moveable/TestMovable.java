package Moveable;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point);
        
        point.moveUp();
        System.out.println("After moveUp: " + point);
        
        point.moveRight();
        System.out.println("After moveRight: " + point);
        
        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 10);
        System.out.println(circle);
        
        circle.moveLeft();
        System.out.println("After moveLeft: " + circle);
        
        circle.moveDown();
        System.out.println("After moveDown: " + circle);
    }
}
