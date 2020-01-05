package chap6.example.tables;

public class PrintTable {
	private TableModel model;
	
	public PrintTable(){
	}
	public PrintTable(TableModel model) {
		this.model = model;
	}

	public void setModel(TableModel model) {
		this.model = model;
	}
	
	public void printTable(){
		for(int i=0; i<model.getColNumber(); i++){	//�����ͷ����model���ýӿ��еķ���
			System.out.print(model.getColName(i)+"\t");
		}		
		System.out.println();
		System.out.println("---------------------------");
		
		//����������
		for(int i=0; i<model.getRowNumber(); i++){  //�����У���model���ýӿ��еķ���
			for(int j=0; j<model.getColNumber(); j++){	//�����У���model���ýӿ��еķ���
				System.out.print(model.getValue(i, j)+"\t");	//��ӡ���i��j�е����ݣ���model���ýӿ��еķ���
			}
			System.out.println();
		}
	}
}
