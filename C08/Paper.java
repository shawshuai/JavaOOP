package chap8.examCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Paper {
	private Map<Integer,Question> questions; //key为题号(int)，value为试题Question对象
	private int count;
	
	public Paper(int count){
		this.count=count;
		questions = new HashMap<Integer,Question>();
		for(int i=0; i<count; i++){  //向试卷中添加count道题目
			this.addQuestion(i);
		}		
	}
	
	public void addQuestion(int index){  //向试卷中加一道题
		Scanner scn = new Scanner(System.in);
		System.out.print("输入题目描述:");
		String title= scn.nextLine();
		
		List<String> list=new ArrayList<String>();
		while(true){
			System.out.print("输入选项(quit表示结束):");
			String option=scn.nextLine(); //选项,读行，防止有空行的情况
			if(option.equalsIgnoreCase("quit")){
				break;
			}
			list.add(option); //向选项表中加入选项			
		}
		
		System.out.print("输入题目的答案:");
		String answer= scn.nextLine();
		
		Question question= new Question(title,list,answer); //生成该题目
		questions.put(++index, question); //将试题加入HashMap
	}

	public void showPaper(){ //显示试卷
		System.out.println();
		
		//输出HashMap－questions
		Set<Integer> s = questions.keySet();
		Iterator<Integer> it = s.iterator();  //键集为Integer
		while(it.hasNext()){
			int k=it.next(); 
			System.out.println("第"+k+"题");
			Question q = questions.get(k);  //value值是题目
			q.showQuestion();  //显示题目
		}
	}

	public Map<Integer,Question> getQuestions() {
		return questions;
	}

	public int getCount() {
		return count;
	}	
}
