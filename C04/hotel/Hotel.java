package chap4.example.hotel;

public class Hotel {
	
	private static final int HEIGHT=3;  //层数
	private static final int WIDTH=10;   //房间数
	
	private String hotelName;
	private Room[][] rooms;
	
	/**
	 * 初始化房间：房间号,房间状态
	 */
	public Hotel( String hotelName){
		this.hotelName =  hotelName;
		
		//创建数组对象
		rooms= new Room[HEIGHT][WIDTH];
		
		for(int i=0; i<rooms.length; i++){
			for(int j=0; j<rooms[i].length; j++){
				//初始化每一个Room对象
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
	 * 查询所有房间状态
	 */
	public void searchAll(){
		
		for(int i=0; i<rooms.length; i++){
			//输出房间号
			for(int j=0; j<rooms[i].length; j++){
				System.out.print(rooms[i][j].getId()+"\t");
			}
			System.out.println();
			
			//输出客房状态
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
	 * 按房间号查询
	 * @param roomNo：4位房间号
	 * @return 查找结果
	 */
	public void searchByNo(String roomNo){
		if(testRoomNo(roomNo)){
			//分解房间号
			int _height=Integer.parseInt(roomNo.substring(0,2)); //截取前两位  
			int _width=Integer.parseInt(roomNo.substring(2,4));   //截取后两位
			
			System.out.println(rooms[_height-1][_width-1].getCustomerName()==null ?"该房间没有客人": roomNo+":"+rooms[_height-1][_width-1].getCustomerName());
		}else{
			System.out.println("没有这个房间");
		}			
	}
	
	/***
	 * 入住
	 * @param roomNo：房间号
	 * @param name：客人姓名
	 * @return 入住信息
	 */
	public int checkin(String roomNo, String name){
		if(testRoomNo(roomNo)){
			//分解房间号
			int height=Integer.parseInt(roomNo.substring(0,2)); //截取前两位  
			int width=Integer.parseInt(roomNo.substring(2,4));   //截取后两位
			
			if(rooms[height-1][width-1].in(name)){				//入住
				return 1;	//成功入住
			}else{
				return 2;  //该房间已有客人入住
			}
		}else{
			return 3; //没有这个房间
		}		
	}
	/**
	 * 退房
	 * @param roomNo：房间号
	 * @return 退房信息
	 */
	public int checkout(String roomNo){
		if(testRoomNo(roomNo)){
			//分解房间号
			int height=Integer.parseInt(roomNo.substring(0,2)); //截取前两位  
			int width=Integer.parseInt(roomNo.substring(2,4));   //截取后两位
		
			if(rooms[height-1][width-1].out()){
				return 1;   //退房成功 
			}else {
				return 2;   //该房间没有人
			}
		}else{
			return 3; //没有这个房间
		}
	}
	
	/***
	 * 检测房间号是否合法
	 * @param roomNo:房间号
	 * @return true,房间号合法；false,房间号不合法
	 */
	private boolean testRoomNo(String roomNo){		
		int height=Integer.parseInt(roomNo.substring(0,2)); //截取前两位  
		int width=Integer.parseInt(roomNo.substring(2,4));   //截取后两位
		
		if (height<1 || height>HEIGHT || width<1 || width > WIDTH){
			return false;
		}else{
			return true;
		}
	}
}
