package chap10.example.ex8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTCalculation {
	//将窗口中需要控制的组件定义为属性	
	private Frame frame;
	private TextField field;
	private Button[] allButtons;

	//在构造方法中创建组件
	public AWTCalculation(){
		frame = new Frame("AWT计算器");
		
		field = new TextField(20);
		field.setText("0");
		
		allButtons = new Button[20];
		String str="←C√±789/456*123-0.=+";
		for(int i=0; i<str.length(); i++){
			allButtons[i]=new Button(str.substring(i,i+1));
		}
	}
	
	//初始化窗口，设置布局
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
		frame.setResizable(false);//禁止改变窗口的大小
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		new AWTCalculation().showMe();
	}

	public void addEventHandler(){  //添加监听
		for(int i=0; i<allButtons.length; i++){ //按钮区监听
			allButtons[i].addActionListener(new CalculateActionHandler());
		}		
	}
	
	//全局初值，只被赋值一次
	double op1=0, op2=0;
	String  operator="";
	boolean flag = true;
	private class CalculateActionHandler implements ActionListener{	
		public void actionPerformed(ActionEvent e) {		
			String command = e.getActionCommand();  //按钮上的文本
	
			if("0123456789.".indexOf(command)!=-1){	//数字按钮或小数点按钮
				if(flag){//之前处理的是=号,开始组织新的操作数
					field.setText(command);
				}else{ //继续拼接操作数
					field.setText(field.getText()+command);			
				}
				flag=false;  //标识"当前不是=号"
			}else if("+-*/".indexOf(command)!=-1){	//运算符号按钮			
				//1.取文本框中的数据:第1个操作数
				op1 = Double.valueOf(field.getText());				
				//2.记下运算符				
				operator= command;	
				//3.清空文本框
				field.setText(null);						
			}else if(command.equalsIgnoreCase("="))	{//等号
				//取文本框中的数据:第2个操作数
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
				flag=true;	//标识"当前是=号"
			}
		}		
	}
}
