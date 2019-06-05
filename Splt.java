public class Splt{
    public static void main(String[] args){
        int num = 1957;
        int ge,shi,bai,qian;
        qian = num / 1000;
        bai = num / 100 % 10;
        shi = num /10 % 10;
        ge = num % 10;
        System.out.println("The 1st num is " + qian);
        System.out.println("The 2nd num is " + bai);
        System.out.println("The 3rd num is " + shi);
        System.out.println("The 4th num is " + ge);
    }
}
//by shawshuai 20170403041 at 2019-3-2 02:18:44