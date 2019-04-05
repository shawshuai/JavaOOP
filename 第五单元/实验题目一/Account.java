public class Account{
    private String idCard;
    private double balance;

    public Account(){}
    public Account(String idCard, double balance){
        this.setIdCard(idCard);
        this.setBalance(balance);
    }

    public void setIdCard(String idCard){
        this.idCard = idCard;
    }

    public String getIdCard(){
        return this.idCard;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getInterest(){
        return 0;
    }
}