public class TestShape {
    public static void main(String[] args) {
        Point[] point = new Point[6];
        point[0] = new Point(2, 4);
        point[1] = new Point(4, 1);
        point[2] = new Point(5, 2);
        point[3] = new Point(8, 0);
        point[4] = new Point(5, 6);
        point[5] = new Point(3, 8);

        Shape[] shape = new Shape[6];
        shape[0] = new Circle(point[0],5);
        shape[1] = new Circle(point[1],7);
        shape[2] = new Circle(point[2],2);
        shape[3] = new Rectangle(point[3],7,3);
        shape[4] = new Rectangle(point[4],4,6);
        shape[5] = new Rectangle(point[5],8,3);

        for (int i=0;i<shape.length;i++){
            System.out.println("面积为：" + shape[i].getArea());
            System.out.println("输出图形：");
            shape[i].print(50,50);
        }
    }
}