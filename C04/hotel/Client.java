package chap4.example.hotel;

import java.util.Scanner;

public class Client {
	public static void main(String[] args){
		Hotel hotel = new Hotel("MiniHilton");
				
		System.out.println("欢迎您入住"+hotel.getHotelName()+"酒店");

		Scanner scn = new Scanner(System.in);
		System.out.println("请输入您的指令：");
		String command=scn.next();  //第一个词

		String roomNo;
		while(!command.equalsIgnoreCase("quit")){ //输入"quit"退出
			if (command.equalsIgnoreCase("search")){ //search方法
				String para = scn.next();
				if(para.equals("all")){
					hotel.searchAll();
				}else{					
					hotel.searchByNo(para);
				}
			}else if (command.equalsIgnoreCase("in")){
				roomNo=scn.next();  	   //房间号
				String name=scn.next();     //客户姓名					
				int res = hotel.checkin(roomNo, name);    //调用入住方法
				if(res==1){
					System.out.println(name+"成功入住！");
				}else if (res==2){
					System.out.println("该房间已有客人！");
				}else if(res==3){
					System.out.println("房间号输入错误");
				}

				
			}else if (command.equalsIgnoreCase("out")){
				roomNo=scn.next();     //房间号
				int res =hotel.checkout(roomNo);     //调用退房方法
				
				if (res==1){
					System.out.println(roomNo+"成功退房！");
				}else if (res==2){
					System.out.println("该房间没有客人！");    
				}else if (res==3){
					System.out.println("房间号输入错误");
				}
			}else{
				System.out.println("没有该指令");
			}
			
			System.out.println("请输入您的指令：");
			command=scn.next();  //第一个词
		}//while
		
		System.out.println("欢迎您下次光临"+hotel.getHotelName());
		System.exit(0);
	}
}