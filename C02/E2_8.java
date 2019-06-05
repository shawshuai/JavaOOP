import java.util.Scanner;

public class E2_8 {
    public static void main(String[] args) {
        System.out.println("输入x：");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y;
        if (x < 0) {  //去掉不能离散为具体数字的分支
            y = 0;
        } else {
            switch (x / 10) {
            case 0:
                y = x;
                break;
            case 1:
            case 2:
                y = x + 10;
                break;  //case 2与case 1使用相同的处理语句
            case 3:
                y = -x;
                break;
            default:
                y = -x - 10;  //派出了上述所有情况
            }
            System.out.println("f(x)=" + y);
        }
    }
}