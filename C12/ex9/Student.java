package chap12.example.ex9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = -5079927634365312280L;
	private String name;
	private int age;
	private Teacher teacher;
	
	public Student deepClone() throws ClassNotFoundException,IOException{
		//������д������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);   //��װ�ֽ�������
		oos.writeObject(this);

		//�������������
		//��ʼ���ֽ���������������С���������ֽ��������������
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return((Student)ois.readObject());   //�����׳�ClassNotFoundException�쳣
	}
	
	public static void main(String[] args) throws ClassNotFoundException,IOException{
		  Teacher teacher = new Teacher("LeoKang");
		  Student s1 = new Student("Lucy",15,teacher);
		  Student s2 = (Student)s1.deepClone();   //������Ʒ���
		  s2.teacher.setName("GraceZhang");	//�޸�ѧ��2����ʦ
		  System.out.println("s1-teacher-name:"+s1.teacher.getName()); //ѧ��1����ʦ����
		  System.out.println("s2-teacher-name:"+s2.teacher.getName()); 
	}

	
	public Student(String name, int age, Teacher teacher) {
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}	
	
	
	
}
