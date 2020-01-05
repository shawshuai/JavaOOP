package chap12.example.ex7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SavePrintPrimeNumber {
	
	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try{
			fos = new FileOutputStream("a.dat");
			dos = new DataOutputStream(fos);
			for(int n=1000; n<2000; n++)
				if(isPrime(n))
					dos.writeInt(n);  
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(dos!=null) try{dos.close();} catch(Exception e){}
		}
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		int count=0; 
		try{
			fis = new FileInputStream("a.dat");
			dis = new DataInputStream(fis);
			while(dis.available()>0) {
				count++;
				System.out.print( dis.readInt() +"   ");
				if(count%10==0)
					System.out.println();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(dis!=null) try{dis.close();} catch(Exception e){}
		}
	}
	
	private static boolean isPrime(int x){
		for(int div=2; div<=Math.sqrt(x); div++)
			if(x%div==0)
				return false;
		return true;
	}
}
