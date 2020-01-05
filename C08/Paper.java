package chap8.examCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Paper {
	private Map<Integer,Question> questions; //keyΪ���(int)��valueΪ����Question����
	private int count;
	
	public Paper(int count){
		this.count=count;
		questions = new HashMap<Integer,Question>();
		for(int i=0; i<count; i++){  //���Ծ������count����Ŀ
			this.addQuestion(i);
		}		
	}
	
	public void addQuestion(int index){  //���Ծ��м�һ����
		Scanner scn = new Scanner(System.in);
		System.out.print("������Ŀ����:");
		String title= scn.nextLine();
		
		List<String> list=new ArrayList<String>();
		while(true){
			System.out.print("����ѡ��(quit��ʾ����):");
			String option=scn.nextLine(); //ѡ��,���У���ֹ�п��е����
			if(option.equalsIgnoreCase("quit")){
				break;
			}
			list.add(option); //��ѡ����м���ѡ��			
		}
		
		System.out.print("������Ŀ�Ĵ�:");
		String answer= scn.nextLine();
		
		Question question= new Question(title,list,answer); //���ɸ���Ŀ
		questions.put(++index, question); //���������HashMap
	}

	public void showPaper(){ //��ʾ�Ծ�
		System.out.println();
		
		//���HashMap��questions
		Set<Integer> s = questions.keySet();
		Iterator<Integer> it = s.iterator();  //����ΪInteger
		while(it.hasNext()){
			int k=it.next(); 
			System.out.println("��"+k+"��");
			Question q = questions.get(k);  //valueֵ����Ŀ
			q.showQuestion();  //��ʾ��Ŀ
		}
	}

	public Map<Integer,Question> getQuestions() {
		return questions;
	}

	public int getCount() {
		return count;
	}	
}
