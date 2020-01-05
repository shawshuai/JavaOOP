package chap10.example.ex5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Chat{
	private Frame frame;
	private TextArea area;
	private TextField field;
	private Button  buttonEnter;
	
	public Chat(){
		frame = new Frame("��������");

		area  = new TextArea(10,30);
		area.setFont(new Font("Times New Roman",Font.BOLD,14));
		area.setEditable(false);			
		
		field = new TextField(26);
		buttonEnter = new Button("����");
	}
	private void init(){		
		Panel panelCenter = new Panel();
		panelCenter.add(area);	
		
		Panel panelSouth = new Panel();
		panelSouth.add(field);
		panelSouth.add(buttonEnter);
		
		frame.add(panelCenter, BorderLayout.CENTER);
		frame.add(panelSouth, BorderLayout.SOUTH);
	}
	private void addEventHandler(){
		//Ϊ�¼�Դע���¼�������
		buttonEnter.addActionListener(new TextButtonActionHandler());
		field.addActionListener(new TextButtonActionHandler());
		field.addTextListener(new TextFieldChangeHandler());
	}
	
	public void showMe(){
		init();
		addEventHandler();
		frame.pack();
		frame.setVisible(true);
	}
	//��Ա�ڲ�����������
	private class TextButtonActionHandler implements ActionListener{	
		public void actionPerformed(ActionEvent e) {			
			area.append(field.getText()+"\n" );	
			field.setText("");
		}
	}
	//��Ա�ڲ�����������
	private class TextFieldChangeHandler implements TextListener{
		public void textValueChanged(TextEvent e) {
			if(field.getText().equals("hehe")){
				area.append("\\(^o^)/\n");
				field.setText("");
			}			
		}		
	}
	
	public static void main(String[] args){
		new Chat().showMe();
	}
}
