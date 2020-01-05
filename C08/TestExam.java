package chap8.examCollection;

public class TestExam {
	public static void main(String[] args){
		
		Student stu = new Student("zhang");		
		Exam exam = new Exam(stu);		
		exam.exam();		
	}
}
