package chap12.example.ex2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {	
	public static void main(String[] args) throws IOException{	    
	    File demo = new File("data.dat");
	    RandomAccessFile rf = new RandomAccessFile(demo,"rw");
	    System.out.println(rf.getFilePointer()); //0
	    rf.write('A');  //write()方法每次写入一个字节，低8位
	    System.out.println(rf.getFilePointer());//1 
	    int i = 0x41;       
	    rf.write(i);  //write()方法每次写入一个字节，变量i的低8位		
	    System.out.println(rf.getFilePointer());//2
	    rf.writeInt(i);   //writeInt()方法写入一个int：4个字节
	    System.out.println(rf.getFilePointer());//6
	    rf.close();  //文件读写完成以后一定关闭文件
	}
}

