import java.util.Scanner;

public class E2_9 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100) + 1; // Math.random()�������[0,1)�ĸ�����
        Scanner scn = new Scanner(System.in);
        // ��ʼ��������ʼ��ѭ������guessNumber�ͼ�����count
        System.out.println("������µ����֣�");
        int guessNumber = scn.nextInt();
        int count = 1; // �����Ĵ���
        while (guessNumber != x) {
            if (guessNumber < x) {
                System.out.println("С��");
            } else {
                System.out.println("����");
            }
            System.out.print("������µ����֣�");
            guessNumber = scn.nextInt();
            count++;
        }
        System.out.println("��ȷ������" + count + "��");
    }
}