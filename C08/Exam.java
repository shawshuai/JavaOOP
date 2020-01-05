package chap8.examCollection;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exam {
	private Student student; //���� 
	private Paper paper; //�Ծ�
	private AnswerSheet answerSheet; //��	

	public Exam() {
	}

	public Exam(Student student){
		this.student = student;
	}
	
	private void createPaper(){//�����Ծ�		
		System.out.print("������Ŀ�ĸ���:");
		Scanner scn = new Scanner(System.in);		
		try {
			int count = scn.nextInt();	//������		
			paper = new Paper(count);			
			paper.showPaper();  //��ʾ�Ծ�		
		}catch (InputMismatchException e) {
			System.out.println("��ű��������֣��������");
		}	
	}
	
	private void answerQuestions(){  //���⣬���𰸴������⿨
		System.out.println();
		Scanner scn = new Scanner(System.in);
		
		answerSheet = new AnswerSheet();
		for(int i=0; i<paper.getCount(); ){ 
			System.out.print("����Ҫ��������:");		
			int key = scn.nextInt();
		
			if(key>=1 && key<=paper.getCount()){  // ������Щ��
				System.out.print("�����:");
				String answer=scn.next();
				answerSheet.addAnswer(key, answer); //���𰸴�����
				i++;  //��һ�⣬����
			}else{
				System.out.println("û������⣡");				
			}				
		}		
	}
	
	private void showScoreOfPaper(){ //�о�ȡ���Ծ��е���źʹ𰸣�ȥ����ֽ�бȽ�
		System.out.println("\n����"+student.getName());

		int right=0;  //��ȷ������
		Set<Integer> s = paper.getQuestions().keySet();  //�Ծ����
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()){
			int  k= it.next();  //���			
			System.out.print("��"+k+"�⣺");
			String answer1= paper.getQuestions().get(k).getAnswer();  //��׼��
			System.out.print("��׼��"+answer1+"\t");
			
			String answer2= answerSheet.getAnswers().get(k); //�û���
			System.out.println("�û���"+answer2);
			
			if(answer1.equalsIgnoreCase(answer2)){
				right++;  // ���һ��,����
			}
		}
		System.out.println("�����" +right+"����Ŀ!");
	}
	
	public void exam(){	
		createPaper();	//�����Ծ�
		answerQuestions(); //��ʼ����
		showScoreOfPaper();  //�о�		
	}	
}
