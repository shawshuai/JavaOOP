public class Jin
{
   public static void main(String[] args)
    {   int n=7;
        //循环控制行数
       for (int i = 1; i <= 7 ; i++) 
       {     //循环控制输出空格数量
             for (int j = n-i; j>=1 ; j--){
             System.out.print(" ");
             }
             //输出左半边包括中轴线上的字母
             for (int x = 1 ; x <= i ; x++){
             System.out.printf("%c",'a'+x-1);
             }
             //输出右半边的字母
             for (int m = i ; m >= 1 ; m--){
             System.out.printf("%c",m-2+'a');
             }
     //每输完一行就换行
        System.out.println("");
       }
    }
}