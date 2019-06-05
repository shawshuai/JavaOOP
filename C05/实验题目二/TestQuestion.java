import java.util.*;
public class TestQuestion{
    public static void main(String[] args) {
        Question que[] = new Question[2];
        que[0] = new MultiQuestion("三国演义中的三绝是谁？", new String[]{"A.曹操","B.刘备","C.关羽","D.诸葛亮"}, new char[]{'A','C','D'});
        que[1] = new SingleQuestion("最早向刘备推荐诸葛亮的是谁", new String[]{"A.徐庶","B.司马徽","C.鲁肃","D.关羽"}, 'B');

        Scanner in = new Scanner(System.in);
        
        char[] answer;

        que[0].print();
        String s = in.nextLine();
        answer = s.toCharArray();
        if(que[0].check(answer) == true){
            System.out.println("恭喜！答对了！");
        } else {
            System.out.println("回答错误，还得努力啊！");
        }

        que[1].print();
        s = in.nextLine();
        answer = s.toCharArray();
        if(que[1].check(answer) == true){
            System.out.println("恭喜！答对了！");
        } else {
            System.out.println("回答错误，还得努力啊！");
        }

        
    }
}