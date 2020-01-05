package chap8.examCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question {
	private String title; //���
	private List<String> options;  //ѡ��
	private String answer;  //��	

	public Question(){
		options=new ArrayList<String>();		
	}
	
	public Question(String title, List<String> options, String answer) {
		this.title = title;
		this.options = options;
		this.answer = answer;
	}
		
	public void showQuestion(){  //��ʾһ����Ŀ
		System.out.println("��Ŀ:"+title); //������

		//�����ѡ��
		Iterator<String> it = options.iterator();  
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	public String getAnswer() {
		return answer;
	}
}
