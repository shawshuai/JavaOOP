package chap11.example.ex72;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameList {
	private List names;

	public NameList() {//包装为线程安全类
		this.names = Collections.synchronizedList(new ArrayList());
	}
	public void add(String name){
		names.add(name);
	}
	public synchronized String removeFirst(){
		if(names.size()>0){ //调用List的方法1
			return (String)names.remove(0); //调用List的方法2
		}else{
			return null;
		}
	}	
}
