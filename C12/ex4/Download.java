package chap12.example.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Download {
	public static void main(String[] args) throws Exception {  
		String fileName = "demo"+File.separator+"abc.txt";
        
		//预分配文件所占的磁盘空间，磁盘中会创建一个指定大小的文件  
		RandomAccessFile raf = new RandomAccessFile(fileName, "rw");  
		raf.setLength(5*256); //预分配 文件空间  
		raf.close();  
        
		//利用多线程同时写入一个文件  
		for(int i=0; i<5; i++){  //要写入的文件内容  
			String s = "第"+(i+1)+"个字符串"; 
			//每个线程从文件的256*i字节之后开始写入数据
			Thread t = new FileWriteThread(256*i, s.getBytes(), fileName); 
			t.start();
		}     
	}        
}
