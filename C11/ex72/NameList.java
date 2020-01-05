package chap11.example.ex72;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameList {
	private List names;

	public NameList() {//��װΪ�̰߳�ȫ��
		this.names = Collections.synchronizedList(new ArrayList());
	}
	public void add(String name){
		names.add(name);
	}
	public synchronized String removeFirst(){
		if(names.size()>0){ //����List�ķ���1
			return (String)names.remove(0); //����List�ķ���2
		}else{
			return null;
		}
	}	
}
