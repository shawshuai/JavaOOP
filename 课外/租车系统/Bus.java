public class Bus extends Moto {
    public int seatCount;

    Bus(String id, String brand, int seatCount, int preRent){
        this.id = id;
        this.brand = brand;
        this.seatCount = seatCount;
        this.preRent = preRent;
    }

    public double calRent(int days) {
        double rent;
        rent = days * preRent;
        if(days >= 150){
            rent *= 0.6;
        } else if(days >= 30){
            rent *= 0.7;
        } else if(days >= 7){
            rent *= 0.8;
        } else if(days >= 3){
            rent *= 0.9;
        }
        return rent;
    }

    public int getSeat(){
        return seatCount;
    }

    public String getIndex(){
        String return_s = String.valueOf(seatCount);
        return return_s;
    }
}