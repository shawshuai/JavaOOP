package chap10.example.ex1;

import java.awt.Frame;

public class FrameTest{

	public static void main(String[] args) {
		Frame frame = new Frame("Frame����");
		
		//���ô��ڵ�λ�ã���С
		//�൱�ڣ�frame.setSize(100,200); frame.setLocation(50,50);
		frame.setBounds(50,50,300,120);

		//���ô��ڵĿɼ���
		frame.setVisible(true);
	}
}
