import java.util.Scanner;

public class E2_7 {
    public static void main(String[] args) {
        // ���������
        System.out.println("�����������");
        Scanner scn = new Scanner(System.in);
        char operator = scn.next().charAt(0); // ��ȡ�����ַ����ĵ�һλ���õ�һ���ַ�
        // ��������������
        System.out.println("����������������");
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
            System.out.println("���������");
        }
    }
}