package chap4.example.ex1;

/**
 * �Ƶ����
 */
public class Hotel {
	
	//����Ϊ������������������ʺ�״̬��field����
	private String hotelName;  //�Ƶ���
	private String[][] romms;	//�Ƶ귿�䣬�洢�����״̬��EMPTY/��ס��������
	
	/**
	 * 
	 * Hotel()��Hotel(String,Strng[][])Ϊ��Ĺ��췽��
	 */
	public Hotel() {
		super();		
	}
	
	public Hotel(String hotelName) {
		this.hotelName = hotelName;
	}

	public Hotel(String hotelName, String[][] romms) {
		this(hotelName);   //this()�����Ѵ��ڵĹ��췽��
		this.romms = romms;
	}

	/**
	 * 
	 * setHotelName()��getHotelName()����Ϊ��������ṩ�����ݷ��ʽӿ�
	 */
	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	/***
	 * ����Ϊ�������������Ϊ����
	 */
		
	public void search(){//��ѯ���пͷ�״̬		
		
	}	

	public void search(int roomNo){//��ѯָ���ͷ�״̬		
		
	}
	
	public void in(String customer, int roomNo){ //��ס		
		
	} 	
	
	public void out(int roomNo){ //�˷�		
		
	}	
	
	public static void main(String[] args){
		Hotel hotel = new Hotel("MiniHilton", new String[10][20]);
		Hotel hotel2 = hotel;
		
		hotel2.setHotelName("MiniStarwood");   //�޸Ķ��ڴ��ж����hotelName
		System.out.println(hotel.getHotelName());  //��ȡ���޸ĺ��hotelName
	}
}
