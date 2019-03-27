public class MotoOperation {
    Moto[] motos = new Moto[8];
    Car tem = new Car("","","",0);

    public void init() {
        motos[0] = new Car("京NY28588","宝马","X6",800);
        motos[1] = new Car("京CNY3284","宝马","550i",600);
        motos[2] = new Car("京NT37465","别克","林荫大道",300);
        motos[3] = new Car("京NT96968","别克","GL8",600);
        motos[4] = new Bus("京6566754","金杯",16,800);
        motos[5] = new Bus("京8696997","金龙",16,800);
        motos[6] = new Bus("京9696996","金杯",34,1500);
        motos[7] = new Bus("京8696998","金龙",34,1500);
    }

    public Moto motoLeaseOut(String brand, String type, int seat) {

        for(int i=0;i<motos.length;i++){
            if(motos[i].brand == brand & motos[i].avilable == true & type == motos[i].getIndex()){
                motos[i].setAvilableFalse();
                return motos[i];
            }
        }
        for(int i=0;i<motos.length;i++){
            if(motos[i].brand == brand & motos[i].avilable == true & seat == motos[i].getSeat()){
                motos[i].setAvilableFalse();
                return motos[i];
            }
        }
        return tem;
    }
}