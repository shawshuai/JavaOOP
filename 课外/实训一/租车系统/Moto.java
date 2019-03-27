public class Moto
{
    String id;
    String brand;
    double preRent;
    boolean avilable = true;

    public double calRent(int days) {
        double rent;
        rent = days * preRent;
        return rent;
    }

    public void setAvilableTrue() {
        this.avilable = true;
    }

    public void setAvilableFalse() {
        this.avilable = false;
    }

    public String getIndex(){
        return "0";
    }

    public int getSeat(){
        return 0;
    }
}