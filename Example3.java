import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("???????????????");
        int n = scn.nextInt();
        double[] score = new double[n];
        double sum = 0;
        for (int i=0;i<score.length;i++) {
            score[i] = Math.random()*60+40;
            sum += score[i];
        }
        double aver = sum/score.length;
        System.out.println("???????" + aver);
        System.out.println("??????????????");
        for (int j=0;j<score.length;j++) {
            System.out.printf("%.1f\t",score[j]);
            if ( (j+1)%5==0 ) {
                System.out.println();
            }
        }
    }
}