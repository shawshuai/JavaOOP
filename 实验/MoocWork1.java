public class MoocWork1 {
    public static void main(String[] args) {
        double equl_left = 0, equl_right = 0;
        equl_left = Math.pow(3, 3) + Math.pow(4, 3) + Math.pow(5, 3);
        equl_right = Math.pow(6, 3);
        if (equl_left == equl_right) {
            System.out.println("3^3+4^3+5^3=6^3 is True");
        } else {
            System.out.println("3^3+4^3+5^3=6^3 is False");
        }
        equl_left = 0;
        equl_right = Math.pow(180, 3);
        for (int i=6; i<=69; i++) {
            equl_left += Math.pow(i, 3);
        }
        if (equl_left == equl_right) {
            System.out.println("6^3+7^3+...+69^3=180^3 is True");
        } else {
            System.out.println("6^3+7^3+...+69^3=180^3 is False");
        }
    }
}