public class FixedDepositAccount extends Account{
    private int months;
    private double rate;

    public FixedDepositAccount(){
        super();
    }
    public FixedDepositAccount(String idCard, double balance){
        super();
    }
    public FixedDepositAccount(String idCard, double balance, int months, double rate){
        super(idCard, balance);
        this.months = months;
        this.rate = rate;
    }

    public void setMonths(int months){
        this.months = months;
    }

    public int getMonths(){
        return this.months;
    }

    public void setRate(double rate){
        this.rate = rate; 
    }

    public double getRate(){
        return this.rate;
    }

    public double getInterest(){
        double interset = ((int)((this.getBalance() * rate / 100 * months / 12)*100))/100.0;
        return interset;
    }

    public String toString(){
        return this.getIdCard() +  "账户 " + this.getBalance() + "元存款的" + months + "月存款利息：" + this.getInterest() + "(年利率为" + rate + "%)";
    }
}