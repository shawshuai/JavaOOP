import java.util.Scanner;

public class E2_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("����һ�����ڣ������գ���");
        int year = scn.nextInt();
        int month = scn.nextInt();
        int day = scn.nextInt();
        int days = 0; // ѭ��ǰ�ĳ�ʼ��
        for (int m = 1; m < month; m++) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 7 || m == 8 || m == 10 || m == 12) {
                days += 31;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                days += 30;
            }
        }
        if (month > 2) { // 2�·�֮���漰�Ƿ�������
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                days += 29;
            } else {
                days += 28;
            }
        }
        System.out.println("���Ǳ���ĵ�" + (days + day) + "��");
    }
}