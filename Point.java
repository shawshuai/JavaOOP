public class Point {
    private int x;
    private int y;

    public Point() {};
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(int x) {
        this.x = x;
        this.y = x;
    }
    public double distance() {
        double distance;
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }
    public double distance(int x, int y) {
        double distance;
        distance = Math.sqrt( Math.pow((this.x-x), 2)+Math.pow((this.y-y), 2));
        return distance;
    }
    public double distance(Point other) {
        double distance;
        distance = Math.sqrt( Math.pow(this.x-other.x, 2)+Math.pow((this.y-other.y), 2));
        return distance;
    }
}