package chap9.example.ex2;

import java.io.*;
import java.util.*;

public class ExceptionDemo22 {
	
	public static void main(String[] args){
		Properties pro = new Properties();  
		FileInputStream fis  = null;
		try {
			//1.����һ��ָ�������ļ���������
			fis  = new FileInputStream("ipConfig.properties");			
			 //2.��ȡ�����ļ�
			pro.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("�����ļ��Ҳ���...");
		} catch (IOException e) {
			System.out.println("�ļ���д��������...");// �����ļ���д�г��ֵ�����
		} finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("�ļ��رճ�������...");
					e.printStackTrace();
				}
			}
		}
				
       //���������ֻ�ȡ����ֵ
		System.out.println("server ip:"+ pro.getProperty("server"));
		System.out.println("port:"+ pro.getProperty("port"));
	}


}
