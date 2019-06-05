import java.util.Scanner;

public class E2_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("输入棋盘的大小：");
        int column = scn.nextInt();  //打印的行数和列数
        //输入第一行抬头
        System.out.print("\t");
        for(int i=0;i<column;i++){
            if(i>=0&&i<10){
                System.out.print(i+"\t");
            }else{  //依次用字母a,b,c..表示行号
                System.out.print((char)('a'+i-10)+"\t");
            }
        }
        System.out.println();
        //输出棋盘
        for(int i=0;i<column;i++){
            //输出行号
            if(i>=0&&i<10){
                System.out.print(i+"\t");
            }else{
                System.out.print((char)('a'+i-10)+"\t");
            }
            //输出column个星号
            for(int j=1;j<=column;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}