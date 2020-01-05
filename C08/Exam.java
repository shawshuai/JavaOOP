package chap8.examCollection;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exam {
	private Student student; //考生 
	private Paper paper; //试卷
	private AnswerSheet answerSheet; //答案	

	public Exam() {
	}

	public Exam(Student student){
		this.student = student;
	}
	
	private void createPaper(){//创建试卷		
		System.out.print("输入题目的个数:");
		Scanner scn = new Scanner(System.in);		
		try {
			int count = scn.nextInt();	//试题数		
			paper = new Paper(count);			
			paper.showPaper();  //显示试卷		
		}catch (InputMismatchException e) {
			System.out.println("题号必须是数字，程序结束");
		}	
	}
	
	private void answerQuestions(){  //答题，将答案存至答题卡
		System.out.println();
		Scanner scn = new Scanner(System.in);
		
		answerSheet = new AnswerSheet();
		for(int i=0; i<paper.getCount(); ){ 
			System.out.print("输入要答题的题号:");		
			int key = scn.nextInt();
		
			if(key>=1 && key<=paper.getCount()){  // 存在这些题
				System.out.print("输入答案:");
				String answer=scn.next();
				answerSheet.addAnswer(key, answer); //将答案存入答卷
				i++;  //答一题，计数
			}else{
				System.out.println("没有这道题！");				
			}				
		}		
	}
	
	private void showScoreOfPaper(){ //判卷，取出试卷中的题号和答案，去答题纸中比较
		System.out.println("\n考生"+student.getName());

		int right=0;  //正确的题数
		Set<Integer> s = paper.getQuestions().keySet();  //试卷键集
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()){
			int  k= it.next();  //题号			
			System.out.print("第"+k+"题：");
			String answer1= paper.getQuestions().get(k).getAnswer();  //标准答案
			System.out.print("标准答案"+answer1+"\t");
			
			String answer2= answerSheet.getAnswers().get(k); //用户答案
			System.out.println("用户答案"+answer2);
			
			if(answer1.equalsIgnoreCase(answer2)){
				right++;  // 答对一题,计数
			}
		}
		System.out.println("共答对" +right+"道题目!");
	}
	
	public void exam(){	
		createPaper();	//创建试卷
		answerQuestions(); //开始考试
		showScoreOfPaper();  //判卷		
	}	
}
