package chap10.example.ex1;

import java.awt.Frame;

public class FrameTest{

	public static void main(String[] args) {
		Frame frame = new Frame("Frame窗口");
		
		//设置窗口的位置，大小
		//相当于：frame.setSize(100,200); frame.setLocation(50,50);
		frame.setBounds(50,50,300,120);

		//设置窗口的可见性
		frame.setVisible(true);
	}
}
