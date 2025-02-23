package Circle;

public class TestCylinder {
public static void main(String[] args) {
 
   Cylinder c1 = new Cylinder();
   System.out.println(c1);
   System.out.println("Base Area = " + c1.getArea()); 
   System.out.println("Volume = " + c1.getVolume());

   Cylinder c2 = new Cylinder(10.0);
   System.out.println(c2);
   System.out.println("Base Area = " + c2.getArea());
   System.out.println("Volume = " + c2.getVolume());

   Cylinder c3 = new Cylinder(2.0, 10.0);
   System.out.println(c3);
   System.out.println("Base Area = " + c3.getArea());
   System.out.println("Volume = " + c3.getVolume());

   Cylinder c4 = new Cylinder(2.0, 10.0, "blue");
   System.out.println(c4);
   System.out.println("Base Area = " + c4.getArea());
   System.out.println("Volume = " + c4.getVolume());
}
}
