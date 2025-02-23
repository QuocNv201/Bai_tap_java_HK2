package Circle;
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);
        System.out.println("Volume: " + cy1.getVolume());

        Cylinder cy2 = new Cylinder(5.0, 10.0);
        System.out.println(cy2);
        System.out.println("Volume: " + cy2.getVolume());

        Cylinder cy3 = new Cylinder(7.0, 15.0, "green");
        System.out.println(cy3);
        System.out.println("Volume: " + cy3.getVolume());
    }
}
