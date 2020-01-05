package chap12.example.ex4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileWriteThread extends Thread {	
	private int offset;  
	private byte[] content;  
	private String fileName;
      
	public FileWriteThread(int offset, byte[] content, String fileName){  
		this.offset = offset;  
		this.content = content;  
		this.fileName = fileName;
	}  
      
	public void run(){  
		System.out.println(getName());
		RandomAccessFile raf = null;  
		try {  
			raf = new RandomAccessFile(fileName, "rw");  
			raf.seek(offset);  
			raf.write(content);  
		} catch (FileNotFoundException e) {  
			e.printStackTrace();  
		} catch (IOException e) {  
			e.printStackTrace();  
		} finally {  
			try {raf.close();} catch (Exception e){}  
		}
	}
}
