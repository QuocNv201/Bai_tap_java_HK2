package GeometricObject;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println(resizableCircle);
        
        resizableCircle.resize(50);
        System.out.println("After resizing by 50%: " + resizableCircle);
        System.out.println("New Area: " + resizableCircle.getArea());
        System.out.println("New Perimeter: " + resizableCircle.getPerimeter());
    }
}
