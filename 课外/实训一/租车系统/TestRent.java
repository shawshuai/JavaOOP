import java.util.Scanner;

public class TestRent {
    public static void main(String[] args) {
        MotoOperation moto = new MotoOperation();
        moto.init();
        System.out.println("***************��ӭ����Tangoo�������޹�˾***************");
        System.out.println("1���γ�    2���ͳ�");
        System.out.println("��������Ҫ���޵��������ࣺ");
        
        int classfication, type_car, car_brand, rent_days, seatConut = 0, seatNum;
        double rent_fee = 0;
        String brand_rent = "", type_rent = "";
        Scanner in = new Scanner(System.in);
        classfication = in.nextInt();

        System.out.println("��ѡ����Ҫ���޵�Ʒ�ƣ�");
        if(classfication == 1){
            System.out.println("1�����    2������");
            car_brand = in.nextInt();
            System.out.println("��������Ҫ���޵��������ͺţ�");
            if(car_brand == 1){
                System.out.println("1��������    2��GL8");
                brand_rent = "���";
                type_car = in.nextInt();
                if(type_car == 1){
                    type_rent = "������";
                }else if(type_car == 2){
                    type_rent = "GL8";
                }
            } else if(car_brand == 2){
                System.out.println("1��X6    2��550i");
                brand_rent = "����";
                type_car = in.nextInt();
                if(type_car == 1){
                    type_rent = "X6";
                }else if(type_car == 2){
                    type_rent = "550i";
                }
            }
        } else if(classfication == 2){
            System.out.println("1������    2����");
            car_brand = in.nextInt();
            if(car_brand == 1){
                brand_rent = "����";
            }else if(car_brand == 2){
                brand_rent = "��";
            }
            System.out.println("��������Ҫ���޵�������λ����1��16��\t2��34��");
            seatNum = in.nextInt();
            if(seatNum == 1){
                seatConut = 16;
            }else if(seatNum == 2){
                seatConut = 34;
            }
        }
        System.out.println("��������Ҫ���޵�������");
        rent_days = in.nextInt();

        Moto get_Moto = new Moto();
        get_Moto = moto.motoLeaseOut(brand_rent, type_rent, seatConut);

        rent_fee = get_Moto.calRent(rent_days);

        System.out.println("��������ĳ��ƺ��ǣ�" + get_Moto.id);
        System.out.println("����Ҫ֧�������޷����ǣ�" + rent_fee);

        type_rent = "";
    }
}