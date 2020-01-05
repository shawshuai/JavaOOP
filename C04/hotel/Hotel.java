package chap4.example.hotel;

public class Hotel {
	
	private static final int HEIGHT=3;  //����
	private static final int WIDTH=10;   //������
	
	private String hotelName;
	private Room[][] rooms;
	
	/**
	 * ��ʼ�����䣺�����,����״̬
	 */
	public Hotel( String hotelName){
		this.hotelName =  hotelName;
		
		//�����������
		rooms= new Room[HEIGHT][WIDTH];
		
		for(int i=0; i<rooms.length; i++){
			for(int j=0; j<rooms[i].length; j++){
				//��ʼ��ÿһ��Room����
				rooms[i][j]=new Room();
				rooms[i][j].setId(i+1, j+1);				
			}
		}		
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * ��ѯ���з���״̬
	 */
	public void searchAll(){
		
		for(int i=0; i<rooms.length; i++){
			//��������
			for(int j=0; j<rooms[i].length; j++){
				System.out.print(rooms[i][j].getId()+"\t");
			}
			System.out.println();
			
			//����ͷ�״̬
			for(int j=0; j<rooms[i].length; j++){
				System.out.print(rooms[i][j].getCustomerName()==null? "\t":rooms[i][j].getCustomerName()+"\t" );
			}
			System.out.println();
			
			for(int j=1; j<=8*WIDTH; j++)
				System.out.print("-");
			System.out.println();
		}
	}
	/**
	 * ������Ų�ѯ
	 * @param roomNo��4λ�����
	 * @return ���ҽ��
	 */
	public void searchByNo(String roomNo){
		if(testRoomNo(roomNo)){
			//�ֽⷿ���
			int _height=Integer.parseInt(roomNo.substring(0,2)); //��ȡǰ��λ  
			int _width=Integer.parseInt(roomNo.substring(2,4));   //��ȡ����λ
			
			System.out.println(rooms[_height-1][_width-1].getCustomerName()==null ?"�÷���û�п���": roomNo+":"+rooms[_height-1][_width-1].getCustomerName());
		}else{
			System.out.println("û���������");
		}			
	}
	
	/***
	 * ��ס
	 * @param roomNo�������
	 * @param name����������
	 * @return ��ס��Ϣ
	 */
	public int checkin(String roomNo, String name){
		if(testRoomNo(roomNo)){
			//�ֽⷿ���
			int height=Integer.parseInt(roomNo.substring(0,2)); //��ȡǰ��λ  
			int width=Integer.parseInt(roomNo.substring(2,4));   //��ȡ����λ
			
			if(rooms[height-1][width-1].in(name)){				//��ס
				return 1;	//�ɹ���ס
			}else{
				return 2;  //�÷������п�����ס
			}
		}else{
			return 3; //û���������
		}		
	}
	/**
	 * �˷�
	 * @param roomNo�������
	 * @return �˷���Ϣ
	 */
	public int checkout(String roomNo){
		if(testRoomNo(roomNo)){
			//�ֽⷿ���
			int height=Integer.parseInt(roomNo.substring(0,2)); //��ȡǰ��λ  
			int width=Integer.parseInt(roomNo.substring(2,4));   //��ȡ����λ
		
			if(rooms[height-1][width-1].out()){
				return 1;   //�˷��ɹ� 
			}else {
				return 2;   //�÷���û����
			}
		}else{
			return 3; //û���������
		}
	}
	
	/***
	 * ��ⷿ����Ƿ�Ϸ�
	 * @param roomNo:�����
	 * @return true,����źϷ���false,����Ų��Ϸ�
	 */
	private boolean testRoomNo(String roomNo){		
		int height=Integer.parseInt(roomNo.substring(0,2)); //��ȡǰ��λ  
		int width=Integer.parseInt(roomNo.substring(2,4));   //��ȡ����λ
		
		if (height<1 || height>HEIGHT || width<1 || width > WIDTH){
			return false;
		}else{
			return true;
		}
	}
}
