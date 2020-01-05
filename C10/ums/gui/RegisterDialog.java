package chap10.example.ums.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import chap10.example.ums.dao.UserDao;
import chap10.example.ums.entity.User;

public class RegisterDialog extends JDialog{	
	private UserDao userDao;  

	private JLabel labelEmail = new JLabel("email");
	private JTextField userEmail = new JTextField(20);
	
	private JLabel labelName = new JLabel("�û���");
	private JTextField userName = new JTextField(20);
	
	private JLabel labelSex = new JLabel("�Ա�  ");
	private JLabel labelMale = new JLabel("��");
	private JLabel labelFemale = new JLabel("Ů");	
	private JRadioButton male = new JRadioButton();  //��ѡ��ť--��
	private JRadioButton female = new JRadioButton();  //��ѡ��ť--Ů
	
	private JLabel labelHobby = new JLabel("���ã�  ");
	private String[] strHobbies={"�����˶�","����","����","����Ϸ"};
	private JCheckBox hobbies[] = new JCheckBox[4];
	private JLabel labelHobbies[] = new JLabel[4];
		
	private JButton buttonSave = new JButton("����");
	private JButton buttonModify = new JButton("�޸�");
	private JButton buttonExit = new JButton("�˳�");
	
	private int windowHeight = 280;  //���ڸ߶�		
	private int windowWidth = 400;   //���ڿ��
	
	JPanel pEamil=new JPanel();  //email�����޸Ĺ��ܹ���
	JPanel pName=new JPanel();  //�û��������޸Ĺ��ܹ���
	JPanel pSex=new JPanel();  //�Ա����޸Ĺ��ܹ���
	JPanel pHobby=new JPanel();  //���ã����޸Ĺ��ܹ���
	private JPanel pButton = new JPanel();  //��ť����壬���޸Ĺ��ܹ���
	private JPanel panel=new JPanel();  //����壬���޸Ĺ��ܹ���	
	
	//���ò���	
	private void init(){	
		//email
		pEamil.add(labelEmail);	
		pEamil.add(userEmail);	
		
		//�û���
		pName.add(labelName);	
		pName.add(userName);
		
		//�Ա�
		ButtonGroup sexRadioGroup = new  ButtonGroup();
		sexRadioGroup.add(male);	   
		sexRadioGroup.add(female);
		pSex.add(labelSex);	
		pSex.add(labelMale);	
		pSex.add(male);				
		pSex.add(labelFemale);	
		pSex.add(female);	
		male.setSelected(true);			
		
		//����
		pHobby.add(labelHobby);  
		for (int i=0; i<hobbies.length; i++){
			hobbies[i] = new JCheckBox();	
			labelHobbies[i]=new JLabel();
			labelHobbies[i].setText(strHobbies[i]);			
			pHobby.add(hobbies[i]);
			pHobby.add(labelHobbies[i]);
		}
		
		//��ť
		pButton.add(buttonSave);	
		pButton.add(buttonExit);	

		//����������
		panel.add(pEamil);
		panel.add(pName);
		panel.add(pSex);
		panel.add(pHobby);
		panel.add(pButton);
		
		this.add(panel);
	}	
	
	public RegisterDialog(JFrame parent, String msg, UserDao userDao) {//ע��Ի���		
		super(parent,msg, true);		
		this.userDao = userDao;		
	}
	
	public void showMe(JFrame parent){
		this.init();  //���ô��ڲ���	
		addEventHandler();		
		setPosition(parent);
		this.validate();
		setVisible(true);
	}	
	private void setPosition(JFrame parent){
		//����Ի������ʾλ��
		int parentX = parent.getX();
		int parentY = parent.getY();	
		int parentWidth = parent.getWidth();
		int parentHeight = parent.getHeight();
		int dialogX = parentX + (parentWidth-windowWidth)/2;
		int dialogY = parentY + (parentHeight-windowHeight)/2+40;
		this.setBounds(dialogX,dialogY,windowWidth,windowHeight);
	}
	
	public void addEventHandler(){
		buttonSave.addActionListener(new ButtonSaveHandler());	
		buttonExit.addActionListener(new ButtonExitHandler());
	}
	
	private class ButtonSaveHandler implements ActionListener{  //���水ť���¼�������
		public void actionPerformed(ActionEvent e){
			//1.�û�email
			String email = userEmail.getText();
			
			//2.����
			String name = userName.getText();
			
			//3.�Ա�
			String sex = male.isSelected() ? "��":"Ů";

			//4.����
			String hobby = getHobbiesInfo();			
			
			if(email.length()==0 ){
				JOptionPane.showMessageDialog( null, "������email", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
				userEmail.grabFocus();
			}else if(!email.matches("[a-zA-Z0-9_+\\.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}")){
				JOptionPane.showMessageDialog( null, "email��ʽ����", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
				userEmail.setText("");	
				userEmail.grabFocus();
			}else if(name.length()==0) { 
				JOptionPane.showMessageDialog( null, "����д�û���", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
				userName.grabFocus();
			}else{
				if(userDao.selectByEmail(email)!=null){  //������ע��
					JOptionPane.showMessageDialog( null, "�������Ѵ���", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
					userEmail.setText("");	
					userEmail.grabFocus();
				}else{
					User user = new User(email, name, sex, hobby);
					userDao.insert(user);					
					clear();										
				}
			}
		}
	}
	private class ButtonExitHandler implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			dispose();			
		}		
	}
	
	public RegisterDialog(JFrame parent, String msg, UserDao userDao, User user) { //�޸ĶԻ���
		super(parent, msg, true);
		this.userDao = userDao;
		
		init();  //���ô���
		userEmail.setEditable(false);			
		
		pButton.remove(buttonSave);	//ɾ��ע�ᴰ���е�"����"��ť
		pButton.add(buttonModify);
		pButton.add(buttonExit);//����ɾ����ť��λ��
		panel.add(pButton);
		this.add(panel);
		
		userEmail.setText(user.getEmail());
		userName.setText(user.getUserName());		
		
		if(user.getSex().equals("��")){
			male.setSelected(true);
		}else{
			female.setSelected(true);
		}
		
		if(user.getHobbies().contains("�����˶�")){
			hobbies[0].setSelected(true);
		}
		if(user.getHobbies().contains("����")){
			hobbies[1].setSelected(true);
		}
		if(user.getHobbies().contains("����")){
			hobbies[2].setSelected(true);
		}
		if(user.getHobbies().contains("����Ϸ")){
			hobbies[3].setSelected(true);
		}
					
		buttonModify.addActionListener(new ButtonModifyHandler());			
		buttonExit.addActionListener(new ButtonExitHandler());
		
		//����Ի������ʾλ��
		setPosition(parent);
		
		validate();
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}
	
	private class ButtonModifyHandler implements ActionListener{  //�޸İ�ť���¼�������
		public void actionPerformed(ActionEvent e){
			//�ռ������ύ����Ϣ
			//1.email
			String email = userEmail.getText();
			
			//2.�û���
			String name = userName.getText();
			
			//3.�Ա�
			String sex = male.isSelected() ? "��":"Ů";

			//4.����
			String hobby = getHobbiesInfo();			
								
			if(name.length()==0) { 
				JOptionPane.showMessageDialog( null, "����д�û���", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
				userName.grabFocus();
			}else {
				User user = new User(email, name, sex, hobby);
				//��������
				userDao.update(user); 				
				clear();							
			}
		}
	}

	/**
	 * ������
	 */
	private void clear(){
		userEmail.setText("");	
		userName.setText("");
		male.setSelected(true);
		
		for(int i=0; i<hobbies.length; i++)	{
			hobbies[i].setSelected(false);	
		}
	}
	
	/**
	 * getInfo():��ȡ������Ϣ
	 * */	
	private String getHobbiesInfo(){  
		StringBuilder strHobbies = new StringBuilder();
		for(int i=0; i<hobbies.length; i++){
			if(hobbies[i].isSelected()){  //ѡ���˸ð���
				String hobbyText = labelHobbies[i].getText(); //��ȡ���Ӧ�ı�ǩ�ı�
				strHobbies.append("  "+hobbyText+"  ");  
			}
		}		
		return strHobbies.toString();
	}
}
