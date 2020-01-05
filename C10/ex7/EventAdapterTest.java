package chap10.example.ex7;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventAdapterTest {
	private Frame frame;
	
	public EventAdapterTest(){
		frame = new Frame();
	}
	public void showMe(){
		frame.addWindowListener(new WindowCloseHandler());		
		frame.setBounds(100,100,200,200);
		frame.setVisible(true);			
	}
	//ÊÂ¼þÊÊÅäÆ÷
	private class WindowCloseHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}	
	public static void main(String[] args) {
		new EventAdapterTest().showMe();
	}
}
