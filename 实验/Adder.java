public class Adder{
    public static void main(String[] args){
        String str1 = args[0];
        String str2 = args[1];
        Double num1 = Double.valueOf(str1.toString());
        Double num2 = Double.valueOf(str2.toString());
        Double sum = num1 + num2;
        System.out.println(sum);
    }
}
//by shawshuai 20170403041 at 2019-3-2 02:14:56