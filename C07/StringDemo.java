package chap7.example;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String x = "good";
		System.out.println(x.charAt(3));  //���'d'

		System.out.println(x.concat(" idea!"));  //���"good idea!" 
		System.out.println(x+" idea!");
		
		String a = "good";
		a += " idea!";
		System.out.println(a);
		
		String b = "quit";
		System.out.println(b.equalsIgnoreCase("QUIT")); //���true
		
		String file = "photo.png";
	    boolean isImageFile = file.endsWith(".png")|| file.endsWith(".jpg");
	    System.out.println(isImageFile);  //���true
	    
	    String command = "get photo.png";
	    if(command.startsWith("get")){
	    	System.out.println("��ʼ�����ļ�..."); 
	    }
		
		String email = "dd.163.com";
		if(email.indexOf("@")==-1){
			System.out.println("email��ַ��ʽ��");
		}
		
		String c = "0123456789";
		System.out.println(c.length());	//���10
		
		String d="This is a good idea!";
		System.out.println(d.replace(' ','/'));	//��� This/is/a/good/idea!
		
		String cc =  "0123456789";
		System.out.println(cc.substring(3));    //���"3456789"
		System.out.println(cc.substring(3,8));  //���"34567"
 
		String email2 = "computer_dite@126.com";
	    String name = email2.substring(0, email2.indexOf("@")); //"computer_dite"
	    String host = email2.substring(email2.indexOf("@")+1);  //"126.com"
	    System.out.println(name);
	    System.out.println(host);	    
	   
	    System.out.println(email2.indexOf("@"));   //���13
	    System.out.println(email2.indexOf("/"));   //���-1
	    int index2 = email2.indexOf("e");		//6
	    System.out.println(email2.indexOf("e", index2+1));//���12
	    System.out.println(email2.lastIndexOf("e")); //���12
	    
	    
		
		String e = "A Good Idea!";
		System.out.println(e.toLowerCase());   //���"a good idea!"
		System.out.println(e.toUpperCase());   //���"A GOOD IDEA!"
		
		Scanner scn = new Scanner(System.in);
		command = scn.next();
		if(command.trim().equalsIgnoreCase("dir")){
			//�Ը�������д���
		}
		
		String s="1"+"2"+"3"+"4"+"5";
	}

}
