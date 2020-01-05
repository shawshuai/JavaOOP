package chap6.example.tables.impl;

import chap6.example.tables.TableModel;

public class TableModelForStringArray implements TableModel{
	private String[][] data;
	
	public TableModelForStringArray(String[][] data){
		this.data=data;
	}

	public String getColName(int index){//ÿ�е������ڶ�ά����ĵ�һ����
		return data[0][index];
	}

	public int getColNumber(){//��������ά����ÿ�еĳ���
		return data[0].length;	
	}

	public int getRowNumber(){//��������ά�����������-1��ȥ�������У�
		return data.length-1;
	}

	public Object getValue(int row, int col) {//���ݣ���row+1��(Խ��������),col��
		return data[row+1][col];
	}		
}
