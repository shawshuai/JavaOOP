import java.util.*;
public class TestQuestion{
    public static void main(String[] args) {
        Question que[] = new Question[2];
        que[0] = new MultiQuestion("���������е�������˭��", new String[]{"A.�ܲ�","B.����","C.����","D.�����"}, new char[]{'A','C','D'});
        que[1] = new SingleQuestion("�����������Ƽ����������˭", new String[]{"A.����","B.˾���","C.³��","D.����"}, 'B');

        Scanner in = new Scanner(System.in);
        
        char[] answer;

        que[0].print();
        String s = in.nextLine();
        answer = s.toCharArray();
        if(que[0].check(answer) == true){
            System.out.println("��ϲ������ˣ�");
        } else {
            System.out.println("�ش���󣬻���Ŭ������");
        }

        que[1].print();
        s = in.nextLine();
        answer = s.toCharArray();
        if(que[1].check(answer) == true){
            System.out.println("��ϲ������ˣ�");
        } else {
            System.out.println("�ش���󣬻���Ŭ������");
        }

        
    }
}