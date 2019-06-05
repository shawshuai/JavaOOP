import java.util.Scanner;

public class E2_16 {
    public static void main(String[] args) {
        System.out.println("请输入要输出的金字塔的数字：");
        Scanner in = new Scanner(System.in);
        int inNum = in.nextInt();
        printPyramid(inNum);

        System.out.println("请输入要输出的金字塔的字母：");
        char inChar = in.next().charAt(0);
        printPyramid(inChar);
    }

    public static void printPyramid(int n) {
        for (int i=1;i<=n;i++) {
            for (int m=n-i;m>0;m--) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.printf("%d",j);
                System.out.print(" ");
            }
            for (int k=i-1;k>=1;k--) {
                System.out.printf("%d",k);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void printPyramid(char ch) {
        
        }
    }
}