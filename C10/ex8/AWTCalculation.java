package chap10.example.ex8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	public void init(){ 	
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
		addEventHandler();
		frame.pack();
		frame.setLocation(300,200);
		frame.setResizable(false);//��ֹ�ı䴰�ڵĴ�С
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		new AWTCalculation().showMe();
	}

	public void addEventHandler(){  //��Ӽ���
		for(int i=0; i<allButtons.length; i++){ //��ť������
			allButtons[i].addActionListener(new CalculateActionHandler());
		}		
	}
	
	//ȫ�ֳ�ֵ��ֻ����ֵһ��
	double op1=0, op2=0;
	String  operator="";
	boolean flag = true;
	private class CalculateActionHandler implements ActionListener{	
		public void actionPerformed(ActionEvent e) {		
			String command = e.getActionCommand();  //��ť�ϵ��ı�
	
			if("0123456789.".indexOf(command)!=-1){	//���ְ�ť��С���㰴ť
				if(flag){//֮ǰ�������=��,��ʼ��֯�µĲ�����
					field.setText(command);
				}else{ //����ƴ�Ӳ�����
					field.setText(field.getText()+command);			
				}
				flag=false;  //��ʶ"��ǰ����=��"
			}else if("+-*/".indexOf(command)!=-1){	//������Ű�ť			
				//1.ȡ�ı����е�����:��1��������
				op1 = Double.valueOf(field.getText());				
				//2.���������				
				operator= command;	
				//3.����ı���
				field.setText(null);						
			}else if(command.equalsIgnoreCase("="))	{//�Ⱥ�
				//ȡ�ı����е�����:��2��������
				double res = 0;
				String text =field.getText();
				if(text.length()>0){
					op2 = Double.valueOf(text);
					if (operator.equals("+")){
						 res = op1 + op2;  
					}else if(operator.equals("-")){
						res = op1 - op2; 
					}else if (operator.equals("*")){
						 res = op1 * op2; 
					}else {
						res = op1 / op2; 
					}
					field.setText(String.valueOf(res));						
				}
				flag=true;	//��ʶ"��ǰ��=��"
			}
		}		
	}
}
