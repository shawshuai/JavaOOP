
public class Rectangle extends Shape {
    private Point p;
    private int width;
    private int height;

    public Rectangle(){}
    public Rectangle(Point p, int width, int height){
        super();
        this.p = p;
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public boolean isContains(int x, int y) {
        double xx = p.getDistanceOfX(x);
        double yy = p.getDistanceOfY(y);
        if(xx>=0&&xx<width && yy>=0&&yy<height){
            return true;
        } else {
            return false;
        }
    }
}