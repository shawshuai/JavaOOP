package chap7.example.ex3;

public class AppendStringTest {

	public static void main(String[] args) {
		
		//String�����ƴ��
		String text="";		
		long beginTime=System.currentTimeMillis();  //��ʼʱ��
		for(int i=0; i<20000; i++){ //ѭ��100000��ƴ���ַ���
			text=text+i;			
		}
		long endTime=System.currentTimeMillis();	//��ֹʱ��
		System.out.println("String��ִ��ʱ�䣺"+(endTime-beginTime));
		
		//StringBulider�����ƴ��
		StringBuilder builder = new StringBuilder("");
		beginTime=System.currentTimeMillis();
		for(int i=0; i<20000; i++){ //��StringBuffer���append()����ƴ���ַ���
			builder.append(i);			
		}
		endTime=System.currentTimeMillis();
		System.out.println("StringBuilder��ִ��ʱ�䣺"+(endTime-beginTime));
	}
}
