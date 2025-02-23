package Point;
import java.util.*;

public class PolyLine {
 private List<Point> points;  

 public PolyLine() {
     points = new ArrayList<>();
 }

 public PolyLine(List<Point> points) {
     this.points = points;
 }

 public void appendPoint(int x, int y) {
     points.add(new Point(x, y));
 }

 public void appendPoint(Point point) {
     points.add(point);
 }

 public double getLength() {
     double totalLength = 0.0;
     for (int i = 0; i < points.size() - 1; i++) {
         totalLength += points.get(i).distance(points.get(i + 1));
     }
     return totalLength;
 }

 @Override
 public String toString() {
     StringBuilder sb = new StringBuilder("{");
     for (Point p : points) {
         sb.append(p.toString());
     }
     sb.append("}");
     return sb.toString();
 }
}
