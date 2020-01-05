package chap12.example.ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		//÷∏∂®º”√‹√‹¬Î
		int code=123456;
		int data;
		try {
			fis=new FileInputStream("a.jpg");
			fos=new FileOutputStream("b.jpg");
			
			while((data=fis.read())!=-1){
				fos.write(data^code);  //±ﬂ∂¡±ﬂº”√‹±ﬂ–¥
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fis!=null) try{fis.close();} catch(IOException e){}
			if(fos!=null) try{fos.close();} catch(IOException e){}
		}
	}

}
