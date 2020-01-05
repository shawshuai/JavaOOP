package chap6.example;

public interface PCI {
	public static final int bits=64;  
	
	public void start();
	public void stop();
}


class SoundCard implements PCI{
	
	public void start() {
		System.out.println("Du du...");		
	}

	public void stop() {
		System.out.println("soundCard stop...");		
	}	
}