public class MotoOperation {
    Moto[] motos = new Moto[8];
    Car tem = new Car("","","",0);

    public void init() {
        motos[0] = new Car("��NY28588","����","X6",800);
        motos[1] = new Car("��CNY3284","����","550i",600);
        motos[2] = new Car("��NT37465","���","������",300);
        motos[3] = new Car("��NT96968","���","GL8",600);
        motos[4] = new Bus("��6566754","��",16,800);
        motos[5] = new Bus("��8696997","����",16,800);
        motos[6] = new Bus("��9696996","��",34,1500);
        motos[7] = new Bus("��8696998","����",34,1500);
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