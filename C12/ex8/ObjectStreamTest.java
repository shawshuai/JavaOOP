package chap12.example.ex8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		ObjectInputStream ois=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("object.dat");
			oos=new ObjectOutputStream(fos);
			Student stu = new Student("Lucy", 15);
			System.out.println(stu.getName()+","+stu.getAge());	//Lucy,15
			System.out.println(stu);	//Student@e53108
			oos.writeObject(stu);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(oos!=null) try{oos.close();} catch(IOException e){}
		}
		
		try {
			fis=new FileInputStream("object.dat");
			ois=new ObjectInputStream(fis);
			Student stu=(Student)ois.readObject();
			System.out.println(stu.getName()+","+stu.getAge());	//Lucy,15
			System.out.println(stu);	//Student@1de3f2d
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(ois!=null) try{ois.close();} catch(IOException e){}
		}
	}
}
