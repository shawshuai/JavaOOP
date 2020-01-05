package chap6.example.tables;

import chap6.example.tables.impl.TableModelForStudentArray;
import chap6.example.tables.impl.TableModelForStringArray;

public class Test {
	public static void main(String[] args){
		Student[] ss={
				new Student(1001,"zhangs",true,21),
				new Student(1002,"lisi",true,24),
				new Student(1003,"wangw",false,23),
				new Student(1004,"zhaol",true,25),
				new Student(1005,"qianqi",false,20),
				new Student(1006,"liuba",true,22),
		};
		
		String[][] str={
				{"ID","NAME","GENDER","AGE"},
				{"1001","zhangs","��","21"},
				{"1002","lis","��","23"},
				{"1003","wangwu","Ů","21"},
				{"1004","zhangs","��","24"},
				{"1005","zhaol","Ů","25"},
				{"1006","qingqi","��","21"}
		};
		
		PrintTable  table = new PrintTable();
		
		TableModel model = new TableModelForStringArray(str);		
		table.setModel(model);	//����set������Ӧ�ò�ע��ʵ�������
		table.printTable();
		
		model = new TableModelForStudentArray(ss);
		table.setModel(model);
		table.printTable();
	}
}
