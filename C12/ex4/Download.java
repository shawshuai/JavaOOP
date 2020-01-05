package chap12.example.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Download {
	public static void main(String[] args) throws Exception {  
		String fileName = "demo"+File.separator+"abc.txt";
        
		//Ԥ�����ļ���ռ�Ĵ��̿ռ䣬�����лᴴ��һ��ָ����С���ļ�  
		RandomAccessFile raf = new RandomAccessFile(fileName, "rw");  
		raf.setLength(5*256); //Ԥ���� �ļ��ռ�  
		raf.close();  
        
		//���ö��߳�ͬʱд��һ���ļ�  
		for(int i=0; i<5; i++){  //Ҫд����ļ�����  
			String s = "��"+(i+1)+"���ַ���"; 
			//ÿ���̴߳��ļ���256*i�ֽ�֮��ʼд������
			Thread t = new FileWriteThread(256*i, s.getBytes(), fileName); 
			t.start();
		}     
	}        
}
