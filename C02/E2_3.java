public class E2_3 {
    public static void main(String[] args) {
        int a = 0, b = 20, c = 3;
        System.out.println(a != 0 && b / a - c > 0); // 成功避免发生除以0的运算
        // System.out.println(a!=0&b/a-c>0); //程序会因除以0的一场而中断
        System.out.println(a != 0 ^ b != 0);
    }
}