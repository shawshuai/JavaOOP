import java.util.Scanner;

public class E2_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("输入一个日期（年月日）：");
        int year = scn.nextInt();
        int month = scn.nextInt();
        int day = scn.nextInt();
        int days = 0; // 循环前的初始化
        for (int m = 1; m < month; m++) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 7 || m == 8 || m == 10 || m == 12) {
                days += 31;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                days += 30;
            }
        }
        if (month > 2) { // 2月份之后涉及是否是闰年
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                days += 29;
            } else {
                days += 28;
            }
        }
        System.out.println("这是本年的第" + (days + day) + "天");
    }
}