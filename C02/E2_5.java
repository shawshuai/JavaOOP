import java.util.Scanner;

public class E2_5 {
    public static void main(String[] args) {
        byte flagFight =90;   //1,3,4,6有航班
        //输入要查询的日期
        System.out.println("输入要查询的日期（星期几），星期日用0表示：");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        if((flagFight&(1<<n))>0){
            System.out.println("该日有航班");
        } else {
            System.out.println("该日没有航班");
        }
    }
}