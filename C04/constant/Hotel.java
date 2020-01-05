package chap4.example.constant;

public class Hotel {
	private String hotelName;  //酒店名
	private String[][] rooms;	//酒店房间，存储房间的状态（EMPTY/入住客人名）
	
	private static final int HEIGHT=10;  //层数
	private static final int WIDTH=12;    //房间数
	
	public Hotel(){
		rooms = new String[HEIGHT][WIDTH];
	}
	
}
