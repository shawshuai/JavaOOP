package chap11.example.ex7;

public class MyArrayList {
	private Object[] data;
	private int count=0;
	
	public MyArrayList() {
		data=new Object[10];
	}
	
	public void add(Object obj){
		data[count]=obj;
		for(int i=0;i<1000000;i++); //ÑÓÊ±¿ÕÑ­»·
		count++;
	}
	
	public String toString(){
		StringBuffer buffer = new StringBuffer("[");
		for(int i=0; i<count-1; i++){
			buffer.append(data[i]+",");			
		}
		buffer.append(data[count-1]+"]");
		return buffer.toString();
	}
}
