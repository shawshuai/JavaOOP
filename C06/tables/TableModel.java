package chap6.example.tables;

public interface TableModel {
	public int getRowNumber();	//��ȡ��������
	public int getColNumber();	//��ȡ��������
	public String getColName(int index);	//��ȡ��ͷ����	
	public Object getValue(int row,int col);	//��ȡ row��col�е�����
}
