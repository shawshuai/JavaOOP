package chap10.example.ex6;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest implements ActionListener{
	private Frame frame;
	private Button  buttonNorth;
	private TextArea area;
	
	public EventTest(){
		frame = new Frame("�¼�����");			
		buttonNorth = new Button("������");		
		area  = new TextArea(10,20);	
	}
	private void init(){
		frame.add(buttonNorth, BorderLayout.NORTH);
		frame.add(area, BorderLayout.CENTER);
	}	
	public void showMe(){
		init();
		
		//Ϊ�¼�Դע���¼�������--�����ڲ������
		buttonNorth.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e) {//ActionEventΪ�¼�����
				area.append(e.getActionCommand()+"��ť�����"+"\n" );		
			}			
		});
		
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
