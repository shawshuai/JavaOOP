package chap12.example.ex12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SquareArea {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		PrintWriter pw = null;
		
		try {
			fos = new FileOutputStream("a.txt");
			pw = new PrintWriter(fos);
			for(int r=1; r<=5; r++){
				double area = Math.PI*r*r; 
				//一次写入一行
				pw.println(area);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			if(pw!=null)
				pw.close();
		}

		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String line;
		try {
			fis = new FileInputStream("a.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			while( (line=br.readLine())!=null){  //每次读取一行
				System.out.println(line);  //System.out:PrintStream
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(br!=null)try {br.close();} catch (IOException e) {e.printStackTrace();}
		}
	}

}
