package chap9.example.ums;

import java.util.Scanner;

import chap9.example.ums.impl.UserDaoForMap;

public class Test {	
	public static void main(String[] args){		
		UserDao dao = new UserDaoForMap();		
		Application app=new Application(dao);
		Scanner scn = new Scanner(System.in);
		
		while(true){
			System.out.println("1.ע��\t2.��¼\t0.�˳�");
			System.out.print("��ѡ��(1,2,0):");
			String cmd = scn.next().trim();
			
			if("0".equals(cmd)){//�����ָ���쳣,������д��ǰ��
				System.out.println("bye...");
				break;
			}else if("1".equals(cmd)){//1 ע��
				app.registe();
			}else if("2".equals(cmd)){// 2 ��¼
				app.login();
			}else{
				System.out.println("ľ���������...");
			}
		}
	}
}
