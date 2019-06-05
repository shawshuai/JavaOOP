public class Point {
    private int x;
    private int y;

    public Point(){ super(); }
    public Point(int x, int y){
        super();
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
    
    public double getDistance(int x, int y) {
        return Math.sqrt((Math.pow(this.x - x, 2) + Math.pow(this.y, 2)));
    }

    public double getDistanceOfX(int x) {
        return Math.abs(this.x - x);
    }

    public double getDistanceOfY(int y){
        return Math.abs(this.y - y);
    }
}