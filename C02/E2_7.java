import java.util.Scanner;

public class E2_7 {
    public static void main(String[] args) {
        // 输入运算符
        System.out.println("输入运算符：");
        Scanner scn = new Scanner(System.in);
        char operator = scn.next().charAt(0); // 获取输入字符串的第一位，得到一个字符
        // 输入两个运算数
        System.out.println("输入两个运算数：");
        double x = scn.nextDouble();
        double y = scn.nextDouble();
        if (operator == '+') {
            System.out.println("" + x + operator + y + "=" + (x + y));
        } else if (operator == '-') {
            System.out.println("" + x + operator + y + "=" + (x - y));
        } else if (operator == '*') {
            System.out.println("" + x + operator + y + "=" + (x * y));
        } else if (operator == '/') {
            System.out.println("" + x + operator + y + "=" + (x / y));
        } else {
            System.out.println("运算符有误");
        }
    }
}