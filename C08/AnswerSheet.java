package chap8.examCollection;

import java.util.HashMap;
import java.util.Map;

public class AnswerSheet {
	private Map<Integer,String> answers;  //ÿ��Ĵ𰸣�keyΪint��ţ�valueΪ��String

	public AnswerSheet(){
		answers= new HashMap<Integer,String>();
	}
	
	public void addAnswer(int key, String answer){ //��һ����
		answers.put(key,answer);  //�𰸼���HashMap
	}
	
	public Map<Integer, String> getAnswers() {
		return answers;
	}	
}
