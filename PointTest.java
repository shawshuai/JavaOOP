public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(7);
        Point p3 = new Point();
        System.out.printf("The distance of p1 to 0,0 is %.2f",p1.distance());
        System.out.printf("The distance between p1 and p2",p1.distance(p2));
    }
}