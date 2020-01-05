package chap12.example.ex3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessFileTest {	
	public static void main(String[] args) throws IOException{
		
		File demo = new File("demo");
		if(!demo.exists()){
			demo.mkdir(); //创建文件夹
		}
		File file = new File(demo, "data.dat");
		if(!file.exists()){
			file.createNewFile(); //创建文件
		}
		
		//以"rw"方式创建RandomAccessFile对象
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		for(int i=0; i<10; i++){
			int number = (int)(Math.random()*100);
			System.out.println("["+(i+1)+"]"+number);
			raf.writeInt(number);
		}
		
		System.out.print("输入要读取的整数的序号1-10(0结束):");
		Scanner scn = new Scanner(System.in);
		int position = scn.nextInt();
		long fp = raf.getFilePointer();
		while(position!=0){
			raf.seek((position-1)*4);
			int number = raf.readInt();
			System.out.println(number);
			System.out.print("输入要读取的整数的序号1-10(0结束):");
			position = scn.nextInt();
		}
	}
}

