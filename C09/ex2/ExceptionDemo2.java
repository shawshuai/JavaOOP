package chap9.example.ex2;

import java.io.*;
import java.util.*;

public class ExceptionDemo2 {
	
	public static void main(String[] args){
		Properties pro = new Properties();  
		FileInputStream fis  = null;
		try {
			//创建一个指向配置文件的输入流
			fis  = new FileInputStream("ipConfig.properties");			
		} catch (FileNotFoundException e) {
			System.out.println("配置文件找不到...");
		} 
		
		try{
			System.out.println("lll");
			//读取配置文件
			pro.load(fis);
		}catch (IOException e) {
			System.out.println("文件读写出现问题...");// 处理文件读写中出现的问题
		} finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("文件关闭出现问题...");
					e.printStackTrace();
				}
			}
		}
				
       //按属性名字获取属性值
		System.out.println("server ip:"+ pro.getProperty("server"));
		System.out.println("port:"+ pro.getProperty("port"));
	}


}
