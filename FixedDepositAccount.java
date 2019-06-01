public class FixeeDepositAccount extends Account{
    private int month;
    private double rate;

    FixeeDepositAccount(){}
    FixeeDepositAccount(String idCard, double balance){    }
    FixeeDepositAccount(String idCard, double balance, int months, double rate){}

    public void setMonths(int month){
        this.month = month;
    }

    public int getMonths(){
        return this.month;
    }

    
}