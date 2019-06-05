public class E2_2 {
    public static void main(String[] args) {
        int i = 10, j = 8, m = 11, n = 20, k, g;
        System.out.println(i++);
        System.out.println(++j);
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        k = m++;
        System.out.println("k="+k);
        System.out.println("m="+m);
        g=3*(++n);
        System.out.println("g="+g);
        System.out.println("n="+n);
    }
}