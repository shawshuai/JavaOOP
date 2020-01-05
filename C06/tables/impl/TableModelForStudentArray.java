package chap6.example.tables.impl;

import chap6.example.tables.Student;

import chap6.example.tables.TableModel;

public class TableModelForStudentArray implements TableModel{
	private Student[] data;
	
	public TableModelForStudentArray(Student[] data){
		this.data=data;
	}

	public String getColName(int index) {  
		switch(index){	//ָ��ÿ������
			case 0: return "ID";
			case 1: return "NAME";
			case 2: return "GENDER";
			case 3: return "AGE"; 
		}
		return null;
	}

	public int getColNumber(){//ָ������
		return 4;
	}
	public int getRowNumber(){//����������Ԫ�صĸ���
		return data.length;
	}
	public Object getValue(int row, int col){//rowΪ�����±�
		switch(col){//��col��λ��ȡ������ĸ����ݳ�Ա
			case 0: return data[row].getId();
			case 1: return data[row].getName();
			case 2: return data[row].isGender()?"��":"Ů";
			case 3: return data[row].getAge();
		}
		return null;
	}
}
