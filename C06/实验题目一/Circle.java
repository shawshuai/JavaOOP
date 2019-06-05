

public class Circle extends Shape {
    private Point p;
    private double r;

    public Circle(){}
    public Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }

    public double getArea(){
        return Math.PI * Math.pow(r, 2);
    }

    public boolean isContains(int x, int y){
        double d = p.getDistance(x,y);
        if (d>=0 && d<r){
            return true;
        }
        return false;
    }
}