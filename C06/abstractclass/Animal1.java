package chap6.example.abstractclass;

public abstract class Animal {
	private String name;
	
	public abstract void move();
	
	public Animal() {
	}

	public String getName(){
		return this.name;
	}
	
	public static void main(String[] args){
		System.out.println("main()...");
	}
}
