package chap9.example.ums;

public class User {
	private int id;
	private String email;
	private String password;
	
	public String toString(){
		return "("+id+","+email+","+password+")";
	}

	public User() {
	}

	public User(int id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
}
