package chap9.example.ex67;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserRegiste {
	private List<String> users;
	
	public UserRegiste() {
		users = new LinkedList<String>();
	}

	public void registe(String email) throws EmailExistException {
		if(email.equalsIgnoreCase("zhangsan@126.com")){	//��ҵ����
				throw new EmailExistException("��������ע��...");
		}else{
			users.add(email);
		}
	}

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		System.out.print("����:");
		String email = scn.next();
		
		try {
			new UserRegiste().registe(email);
		} catch (EmailExistException e) {//����EmailExistException�쳣			
			e.printStackTrace();	//��ӡ�Զ����쳣��Ϣ
		}
	}

}
