package chap3.example;

public class Ex4 {

	/**
	 * ģ���й�������Ʊ˫ɫ�򿪽�����
	 */
	public static void main(String[] args) {
		// 
		boolean[] red = new boolean[34];   //��ɫ��ʹ���±�1-33��Ԫ��,Ĭ��ֵΪfalse
		boolean[] blue = new boolean[17];   //��ɫ��ʹ���±�1-16��Ԫ��
		
		System.out.println("׼������......");
		//ѡ��6������
		int count=0;
		while(count<6){  //����6��ʱ����ѡ�����
			int selectedPos = (int)(Math.random()*33)+1;  //���������[1,33]
			if(red[selectedPos]==false){  //δѡ���ĺ�����Ա�ѡ
				red[selectedPos]=true;   //���ѱ�ѡ���
				count++;  
			}
		}
		
		//����--ѡ��һ����ɫ��
		int selectedPos = (int)(Math.random()*16)+1;
		blue[selectedPos]=true;
		
		//����������
		System.out.print("��ɫ����Ϊ��");
		for(int i=1; i<red.length; i++){
			if(red[i]==true){
				System.out.print((i<10?"0"+i:i)+"  ");
			}
		}
		
		System.out.printf("\n��ɫ����Ϊ��");
		for(int i=1; i<blue.length; i++){
			if(blue[i]==true){
				System.out.print((i<10?"0"+i:i)+"  ");
			}
		}
		

	}

}
