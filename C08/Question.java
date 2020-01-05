package chap8.examCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question {
	private String title; //题干
	private List<String> options;  //选项
	private String answer;  //答案	

	public Question(){
		options=new ArrayList<String>();		
	}
	
	public Question(String title, List<String> options, String answer) {
		this.title = title;
		this.options = options;
		this.answer = answer;
	}
		
	public void showQuestion(){  //显示一个题目
		System.out.println("题目:"+title); //输出题干

		//输出各选项
		Iterator<String> it = options.iterator();  
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	public String getAnswer() {
		return answer;
	}
}
