package chap4.example.hotel;

public class Room{
	
	private String id;	//房间号
	private String customerName;	//客人姓名	
	
	public void setId(int floor, int number){
		id = (floor<=9 ? "0"+floor : ""+floor) + (number<=9? "0"+number : ""+number);
	}
	
	public String getId() {
		return id;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Room() {		
		
	}
	
	public boolean in(String customerName){ //入住
		if(this.customerName==null){ //空			
			this.customerName=customerName;
			return true; //入住成功
		}else{
			return false;  //入住失败,该房间已有客人
		}		
	}

	public boolean out(){  //退房
		if(customerName!=null){//非空
			customerName=null;  
			return true;
		}else {  //该房间没有客人
			return false;
		}
	}
}
