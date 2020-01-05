package chap12.example.ex6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class BufferedStremTest {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		try {
			fis=new FileInputStream("d:"+ File.separator+"a.jpg");
			fos=new FileOutputStream("d:"+ File.separator+"b.jpg");
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(fos);
			int a;
			Date d3=new Date();
			while((a=fis.read())!=-1){
				fos.write(a);
			}
			Date d4=new Date();
			System.out.println("不使用缓冲区的消耗时间："+(d4.getTime()-d3.getTime()));
			
			Date d1=new Date();
			while((a=bis.read())!=-1){
				bos.write(a);
			}
			Date d2=new Date();			
			System.out.println("使用缓冲区的消耗时间："+(d2.getTime()-d1.getTime()));			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bis!=null) try{bis.close();} catch(IOException e){}
			if(bos!=null) try{bos.close();} catch(IOException e){}
		}
	}
}
