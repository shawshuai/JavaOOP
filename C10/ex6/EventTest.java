package chap10.example.ex6;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest implements ActionListener{
	private Frame frame;
	private Button  buttonNorth;
	private TextArea area;
	
	public EventTest(){
		frame = new Frame("事件测试");			
		buttonNorth = new Button("单击我");		
		area  = new TextArea(10,20);	
	}
	private void init(){
		frame.add(buttonNorth, BorderLayout.NORTH);
		frame.add(area, BorderLayout.CENTER);
	}	
	public void showMe(){
		init();
		
		//为事件源注册事件监听器--匿名内部类对象
		buttonNorth.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e) {//ActionEvent为事件对象
				area.append(e.getActionCommand()+"按钮被点击"+"\n" );		
			}			
		});
		
		frame.setBounds(50,50,400,160);
		frame.setVisible(true);		
	}
	
	//本类做监听,实现事件处理器
	public void actionPerformed(ActionEvent e) {//ActionEvent为事件对象
		area.append("按钮被点击"+"\n" );		
	}
	
	public static void main(String[] args){
		new EventTest().showMe();
	}
}
