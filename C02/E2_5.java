import java.util.Scanner;

public class E2_5 {
    public static void main(String[] args) {
        byte flagFight =90;   //1,3,4,6�к���
        //����Ҫ��ѯ������
        System.out.println("����Ҫ��ѯ�����ڣ����ڼ�������������0��ʾ��");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        if((flagFight&(1<<n))>0){
            System.out.println("�����к���");
        } else {
            System.out.println("����û�к���");
        }
    }
}