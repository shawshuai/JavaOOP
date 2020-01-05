package chap12.example.ex2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {	
	public static void main(String[] args) throws IOException{	    
	    File demo = new File("data.dat");
	    RandomAccessFile rf = new RandomAccessFile(demo,"rw");
	    System.out.println(rf.getFilePointer()); //0
	    rf.write('A');  //write()����ÿ��д��һ���ֽڣ���8λ
	    System.out.println(rf.getFilePointer());//1 
	    int i = 0x41;       
	    rf.write(i);  //write()����ÿ��д��һ���ֽڣ�����i�ĵ�8λ		
	    System.out.println(rf.getFilePointer());//2
	    rf.writeInt(i);   //writeInt()����д��һ��int��4���ֽ�
	    System.out.println(rf.getFilePointer());//6
	    rf.close();  //�ļ���д����Ժ�һ���ر��ļ�
	}
}

