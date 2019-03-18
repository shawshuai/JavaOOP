import java.util.Scanner;

public class YTri {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] tri = new int[n][];
        tri[0] = new int[1]; 
        tri[0][0] = 1;
        for (int i=1;i<=n;i++) {
            tri[i] = tri[i+1];
             
        }
    }
}