package chap9.example.ums;

import java.util.Scanner;

import chap9.example.ums.impl.UserDaoForMap;

public class Test {	
	public static void main(String[] args){		
		UserDao dao = new UserDaoForMap();		
		Application app=new Application(dao);
		Scanner scn = new Scanner(System.in);
		
		while(true){
			System.out.println("1.注册\t2.登录\t0.退出");
			System.out.print("请选择(1,2,0):");
			String cmd = scn.next().trim();
			
			if("0".equals(cmd)){//避免空指针异常,将常量写在前面
				System.out.println("bye...");
				break;
			}else if("1".equals(cmd)){//1 注册
				app.registe();
			}else if("2".equals(cmd)){// 2 登录
				app.login();
			}else{
				System.out.println("木有这个命令...");
			}
		}
	}
}
