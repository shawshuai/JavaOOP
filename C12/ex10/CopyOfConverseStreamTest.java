package chap12.example.ex10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyOfConverseStreamTest {

	public static void main(String[] args) {
		String filename = "a.dat";
		FileOutputStream fos = null;
		OutputStreamWriter osw = null; 
		FileInputStream fis = null;
		InputStreamReader isr = null;
		
		try {
			fos = new FileOutputStream(filename);
			osw = new OutputStreamWriter(fos); //使用默认编码方案GBK
			osw.write("北京欢迎你.");
			osw.flush();
			//指定新的编码方案UTF-8
			osw = new OutputStreamWriter(fos,"UTF-8");
			osw.write("北京欢迎你.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(osw!=null)try {osw.close();} catch (IOException e) {	e.printStackTrace();}
		}

		int ch;
		try {
			fis = new FileInputStream(filename);
			isr = new InputStreamReader(fis, "UTF-8"); //指定编码方案UTF-8
			while((ch=isr.read())!=-1){  //读出一个字符：2Bytes
				System.out.print((char)ch);   //强转为Unicode编码字符
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(isr!=null)try {isr.close();} catch (IOException e) {	e.printStackTrace();}
		}
	}

}
