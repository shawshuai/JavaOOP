package chap8.examCollection;

import java.util.HashMap;
import java.util.Map;

public class AnswerSheet {
	private Map<Integer,String> answers;  //每题的答案，key为int题号，value为答案String

	public AnswerSheet(){
		answers= new HashMap<Integer,String>();
	}
	
	public void addAnswer(int key, String answer){ //答一道题
		answers.put(key,answer);  //答案加入HashMap
	}
	
	public Map<Integer, String> getAnswers() {
		return answers;
	}	
}
