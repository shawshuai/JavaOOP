import java.util.Scanner;

public class E2_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int x = scn.nextInt();
        int div;
        for (div = 2; div <= Math.sqrt(x); div++) {
            if (x % div == 0) { // 不是素数，div<=Math.sqrt(x)
                break;
            }
        }
        if (div > Math.sqrt(x)) { // 全部除数扫描后均未整除
            System.out.println(x + "是素数");
        } else {
            System.out.println(x + "不是素数");
        }
    }
}