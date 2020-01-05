package chap10.example.ex4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ActionListenerΪ�¼�������
public class EventTest implements ActionListener{
	private Frame frame;
	private Button  button;
	private TextArea area;
	
	public EventTest(){
		frame = new Frame("�¼�����");			
		button = new Button("������");		
		area  = new TextArea(10,20);	
	}
	private void init(){
		frame.add(button, BorderLayout.NORTH);
		frame.add(area, BorderLayout.CENTER);
	}	
	public void showMe(){
		init();
		
		//Ϊ�¼�Դע���¼�������
		button.addActionListener(this);
		
		frame.setBounds(50,50,400,160);
		frame.setVisible(true);		
	}
	
	//����������,ʵ���¼�������
	public void actionPerformed(ActionEvent e) {//ActionEventΪ�¼�����
		area.append("��ť�����"+"\n" );		
	}
	
	public static void main(String[] args){
		new EventTest().showMe();
	}
}
