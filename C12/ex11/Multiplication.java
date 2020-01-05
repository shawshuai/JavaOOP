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
					//д���ַ���
					fw.write(j+"*"+i+"="+(i*j)+"\t");
				}
				fw.write("\r\n");  //ÿ�н��������һ���س�����
			}
			fw.flush();
			
			//�������ڿ���̨��ӡ
			fr = new FileReader("aa.txt");
			while( (ch=fr.read())!=-1){  //ÿ�ζ�ȡһ��
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
