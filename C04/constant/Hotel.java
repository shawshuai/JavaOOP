package chap4.example.constant;

public class Hotel {
	private String hotelName;  //�Ƶ���
	private String[][] rooms;	//�Ƶ귿�䣬�洢�����״̬��EMPTY/��ס��������
	
	private static final int HEIGHT=10;  //����
	private static final int WIDTH=12;    //������
	
	public Hotel(){
		rooms = new String[HEIGHT][WIDTH];
	}
	
}
