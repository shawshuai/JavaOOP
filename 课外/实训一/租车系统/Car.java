public class Car extends Moto {
    public String type;

    Car(String id, String brand, String type, int preRent) {
        this.id = id;
        this.brand =brand;
        this.type = type;
        this.preRent = preRent;
    }

    public double calRent(int days) {
        double rent;
        rent = days * preRent;
        if(days > 150){
            rent *= 0.7;
        } else if(days > 30){
            rent *= 0.8;
        } else if(days > 7){
            rent *= 0.9;
        }
        return rent;
    }

    /**
     * @return the type
     */
    public String getIndex() {
        return type;
    }
}