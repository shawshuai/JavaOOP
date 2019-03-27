import java.util.Scanner;

public class TestRent {
    public static void main(String[] args) {
        MotoOperation moto = new MotoOperation();
        moto.init();
        System.out.println("***************欢迎光临Tangoo汽车租赁公司***************");
        System.out.println("1、轿车    2、客车");
        System.out.println("请输入您要租赁的汽车种类：");
        
        int classfication, type_car, car_brand, rent_days, seatConut = 0, seatNum;
        double rent_fee = 0;
        String brand_rent = "", type_rent = "";
        Scanner in = new Scanner(System.in);
        classfication = in.nextInt();

        System.out.println("请选择您要租赁的品牌：");
        if(classfication == 1){
            System.out.println("1、别克    2、宝马");
            car_brand = in.nextInt();
            System.out.println("请输入您要租赁的汽车的型号：");
            if(car_brand == 1){
                System.out.println("1、林荫大道    2、GL8");
                brand_rent = "别克";
                type_car = in.nextInt();
                if(type_car == 1){
                    type_rent = "林荫大道";
                }else if(type_car == 2){
                    type_rent = "GL8";
                }
            } else if(car_brand == 2){
                System.out.println("1、X6    2、550i");
                brand_rent = "宝马";
                type_car = in.nextInt();
                if(type_car == 1){
                    type_rent = "X6";
                }else if(type_car == 2){
                    type_rent = "550i";
                }
            }
        } else if(classfication == 2){
            System.out.println("1、金龙    2、金杯");
            car_brand = in.nextInt();
            if(car_brand == 1){
                brand_rent = "金龙";
            }else if(car_brand == 2){
                brand_rent = "金杯";
            }
            System.out.println("请输入您要租赁的汽车座位数：1、16座\t2、34座");
            seatNum = in.nextInt();
            if(seatNum == 1){
                seatConut = 16;
            }else if(seatNum == 2){
                seatConut = 34;
            }
        }
        System.out.println("请输入您要租赁的天数：");
        rent_days = in.nextInt();

        Moto get_Moto = new Moto();
        get_Moto = moto.motoLeaseOut(brand_rent, type_rent, seatConut);

        rent_fee = get_Moto.calRent(rent_days);

        System.out.println("分配给您的车牌号是：" + get_Moto.id);
        System.out.println("您需要支付的租赁费用是：" + rent_fee);

        type_rent = "";
    }
}