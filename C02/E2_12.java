import java.util.Scanner;

public class E2_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("������һ����������");
        int x = scn.nextInt();
        int div;
        for (div = 2; div <= Math.sqrt(x); div++) {
            if (x % div == 0) { // ����������div<=Math.sqrt(x)
                break;
            }
        }
        if (div > Math.sqrt(x)) { // ȫ������ɨ����δ����
            System.out.println(x + "������");
        } else {
            System.out.println(x + "��������");
        }
    }
}