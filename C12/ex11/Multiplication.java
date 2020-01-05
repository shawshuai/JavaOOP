package chap12.example.ex11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Multiplication {

	public static void main(String[] args) {		
		FileWriter fw = null;
		FileReader fr = null;
		int ch;
		try {
			fw = new FileWriter("aa.txt");
			for(int i=1; i<=9; i++){
				for(int j=1; j<=i; j++){
					//写入字符串
					fw.write(j+"*"+i+"="+(i*j)+"\t");
				}
				fw.write("\r\n");  //每行结束后输出一个回车换行
			}
			fw.flush();
			
			//读出并在控制台打印
			fr = new FileReader("aa.txt");
			while( (ch=fr.read())!=-1){  //每次读取一行
				System.out.print((char)ch);  
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fw!=null)try {fw.close();} catch (IOException e) {e.printStackTrace();}
			if(fr!=null)try {fr.close();} catch (IOException e) {e.printStackTrace();}
		}
	}

}
