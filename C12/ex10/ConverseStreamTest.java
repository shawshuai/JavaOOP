package chap12.example.ex10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConverseStreamTest {

	public static void main(String[] args) {
		String filename = "a.dat";
		FileOutputStream fos = null;
		OutputStreamWriter osw = null; 
		FileInputStream fis = null;
		InputStreamReader isr = null;
		
		try {
			fos = new FileOutputStream(filename);
			fos.write("北京".getBytes());
			fos.write("北京".getBytes("UTF-8"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fos!=null)try {fos.close();} catch (IOException e) {	e.printStackTrace();}
		}

		int ch;
		try {
			fis = new FileInputStream(filename);
			isr = new InputStreamReader(fis, "UTF-8");
			while((ch=isr.read())!=-1){
				System.out.print((char)ch);
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
