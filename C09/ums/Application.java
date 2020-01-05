package chap9.example.ums;

import java.util.Scanner;

public class Application {
	private UserDao dao;
	private int id;
	
	public Application(UserDao dao){
		id=1;
		this.dao=dao;
	}
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void registe(){
		Scanner scn=new Scanner(System.in);
		
		System.out.println("输入注册信息...");
		System.out.print("email:");
		String email = scn.next();
		System.out.print("password(至少6位):");
		String pwd = scn.next();

		try{
			User user = new User(id++, email, pwd);
			dao.addUser(user);				
			System.out.println("用户注册成功"+user);
		}catch(Pwd2ShortException e){
			System.out.println(e.getMessage());
			id--;
		}catch(EmailExistException e){
			System.out.println(e.getMessage());
			id--;
		}		
	}
	
	public void login(){
		Scanner scn=new Scanner(System.in);
		
		System.out.println("输入登录信息:");
		System.out.print("email:");
		String email = scn.next();
		System.out.print("password:");
		String pwd = scn.next();
		try{
			User user = dao.getUser(email, pwd);
			System.out.println("欢迎"+user.getEmail());
		}catch(UserNotFoundException e){
			System.out.println(e.getMessage());
		}catch(PasswordException e){
			System.out.println(e.getMessage());
		}		
	}	
}
