import java.util.Scanner;

public class E2_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("�������̵Ĵ�С��");
        int column = scn.nextInt();  //��ӡ������������
        //�����һ��̧ͷ
        System.out.print("\t");
        for(int i=0;i<column;i++){
            if(i>=0&&i<10){
                System.out.print(i+"\t");
            }else{  //��������ĸa,b,c..��ʾ�к�
                System.out.print((char)('a'+i-10)+"\t");
            }
        }
        System.out.println();
        //�������
        for(int i=0;i<column;i++){
            //����к�
            if(i>=0&&i<10){
                System.out.print(i+"\t");
            }else{
                System.out.print((char)('a'+i-10)+"\t");
            }
            //���column���Ǻ�
            for(int j=1;j<=column;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}