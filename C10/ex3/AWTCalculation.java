package chap10.example.ex3;

import java.awt.*;

public class AWTCalculation {
	//����������Ҫ���Ƶ��������Ϊ����	
	private Frame frame;
	private TextField field;
	private Button[] allButtons;

	//�ڹ��췽���д������
	public AWTCalculation(){
		frame = new Frame("AWT������");
		
		field = new TextField(20);
		field.setText("0");
		
		allButtons = new Button[20];
		String str="��C�̡�789/456*123-0.=+";
		for(int i=0; i<str.length(); i++){
			allButtons[i]=new Button(str.substring(i,i+1));
		}
	}
	
	//��ʼ�����ڣ����ò���
	private void init(){ 	
		Panel northPanel = new Panel();		
		northPanel.add(field);
		
		Panel centerPanel = new Panel();
		GridLayout grid = new GridLayout(5,4,2,2);
		centerPanel.setLayout(grid);
			
		for(int i=0; i<allButtons.length; i++){
			centerPanel.add(allButtons[i]);
		}
		
		frame.add(northPanel,BorderLayout.NORTH);
		frame.add(centerPanel,BorderLayout.CENTER);		
	}
	
	public void showMe(){
		init();
		frame.pack();
		frame.setLocation(300,200);
		frame.setResizable(false);//��ֹ�ı䴰�ڵĴ�С
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		new AWTCalculation().showMe();
	}		
}
