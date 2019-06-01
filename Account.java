public class Account{
    private String idCard;
    private double balance;

    Account(){
    }

    Account(String idCard, double balance){}

    public void setIdCard(String idCard){}

    public String getIdCard(){
        return idCard;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public double getInterest(){
        return 0;
    }

}