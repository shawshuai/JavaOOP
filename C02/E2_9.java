import java.util.Scanner;

public class E2_9 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100) + 1; // Math.random()随机生成[0,1)的浮点数
        Scanner scn = new Scanner(System.in);
        // 开始猜数，初始化循环变量guessNumber和计数器count
        System.out.println("输入你猜的数字：");
        int guessNumber = scn.nextInt();
        int count = 1; // 猜数的次数
        while (guessNumber != x) {
            if (guessNumber < x) {
                System.out.println("小了");
            } else {
                System.out.println("大了");
            }
            System.out.print("输入你猜的数字：");
            guessNumber = scn.nextInt();
            count++;
        }
        System.out.println("正确！猜了" + count + "次");
    }
}