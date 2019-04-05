public class BankingAccount extends Account{
    private int days;
    private double rate;

    public BankingAccount(){
        super();
    }
    public BankingAccount(String idCard, double balance){
        super();
    }
    public BankingAccount(String idCard, double balance, int days, double rate){
        super(idCard, balance);
        this.setDays(days);
        this.setRate(rate);
    }

    public void setDays(int days){
        this.days = days;
    }

    public int getDays(){
        return this.days;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public double getRate(){
        return this.rate;
    }

    public double getInterest(){
        double interest = ((int)((this.getBalance() * rate / 100 * days / 365)*100)/100.0);
        return interest;
    }

    public String toString(){
        return this.getIdCard() + "账户 " + this.getBalance() + "元存款的" + this.days + "天存款利息：" + this.getInterest()+ "(年利率为" + rate + "%)";
    }

}