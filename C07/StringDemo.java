package chap7.example;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String x = "good";
		System.out.println(x.charAt(3));  //输出'd'

		System.out.println(x.concat(" idea!"));  //输出"good idea!" 
		System.out.println(x+" idea!");
		
		String a = "good";
		a += " idea!";
		System.out.println(a);
		
		String b = "quit";
		System.out.println(b.equalsIgnoreCase("QUIT")); //输出true
		
		String file = "photo.png";
	    boolean isImageFile = file.endsWith(".png")|| file.endsWith(".jpg");
	    System.out.println(isImageFile);  //输出true
	    
	    String command = "get photo.png";
	    if(command.startsWith("get")){
	    	System.out.println("开始下载文件..."); 
	    }
		
		String email = "dd.163.com";
		if(email.indexOf("@")==-1){
			System.out.println("email地址格式错");
		}
		
		String c = "0123456789";
		System.out.println(c.length());	//输出10
		
		String d="This is a good idea!";
		System.out.println(d.replace(' ','/'));	//输出 This/is/a/good/idea!
		
		String cc =  "0123456789";
		System.out.println(cc.substring(3));    //输出"3456789"
		System.out.println(cc.substring(3,8));  //输出"34567"
 
		String email2 = "computer_dite@126.com";
	    String name = email2.substring(0, email2.indexOf("@")); //"computer_dite"
	    String host = email2.substring(email2.indexOf("@")+1);  //"126.com"
	    System.out.println(name);
	    System.out.println(host);	    
	   
	    System.out.println(email2.indexOf("@"));   //输出13
	    System.out.println(email2.indexOf("/"));   //输出-1
	    int index2 = email2.indexOf("e");		//6
	    System.out.println(email2.indexOf("e", index2+1));//输出12
	    System.out.println(email2.lastIndexOf("e")); //输出12
	    
	    
		
		String e = "A Good Idea!";
		System.out.println(e.toLowerCase());   //输出"a good idea!"
		System.out.println(e.toUpperCase());   //输出"A GOOD IDEA!"
		
		Scanner scn = new Scanner(System.in);
		command = scn.next();
		if(command.trim().equalsIgnoreCase("dir")){
			//对该命令进行处理
		}
		
		String s="1"+"2"+"3"+"4"+"5";
	}

}
