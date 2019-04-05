public class TestAccount{
    public static void main(String arg[]) {
        double fixed_rate = 3.5;
        double banking_rate = 5.2;
                
        Account acc[] = new Account[10];
        for(int i=0;i<4;i++){
            int months_tem = (int)(Math.random()*10+5);
            String idCard_tem = "00" + (i+1);
            int b_tem = (int)(Math.random()*10000000);
            double balance_tem = b_tem/100.0;            
            acc[i] = new FixedDepositAccount(idCard_tem, balance_tem, months_tem, fixed_rate);
        }
        for(int i=4;i<8;i++){
            String idCard_tem = "00" + (i+1);
            int days_tem = (int)(Math.random()*100+50);
            int b_tem = (int)(Math.random()*10000000);
            double balance_tem = b_tem/100.0;    
            acc[i] = new BankingAccount(idCard_tem, balance_tem, days_tem, banking_rate);
        }
        acc[8] = new FixedDepositAccount("009", 100000.00, 36, fixed_rate);
        acc[9] = new BankingAccount("010", 100000, 182, banking_rate);

        for(int i=0;i<acc.length;i++){
            System.out.println(acc[i].toString());
        }
    }
}