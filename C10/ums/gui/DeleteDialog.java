package chap10.example.ums.gui;

import java.awt.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import chap10.example.ums.dao.UserDao;
import chap10.example.ums.entity.User;


public class DeleteDialog extends JDialog{
	private UserDao userDao; 
	
	private JLabel labelEmail = new JLabel("  �û�email");
	private JTextField userEmail = new JTextField(20);		
	private JButton buttonRemove = new JButton("ɾ���û�");
	
	private int windowHeight = 150;  //���ڸ߶�		
	private int windowWidth = 400;   //���ڿ��
	
	public DeleteDialog(JFrame parent, String msg, UserDao userDao){
		super(parent,msg,true);
		this.userDao = userDao;
	}
	
	public void showMe(JFrame parent){
		Panel pCenter=new Panel();
		Panel pSouth=new Panel();
		pSouth.add(buttonRemove);
		
		pCenter.add(labelEmail);
		pCenter.add(userEmail);
		pCenter.add(pSouth);
		add(pCenter);
		
		buttonRemove.addActionListener(new ButtonRemoveHandler());		
		
		//����Ի������ʾλ��
		setPosition(parent);		
		setVisible(true);
		validate();		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
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
	
	private class ButtonRemoveHandler implements ActionListener{  //ɾ����ť���¼�������
		public void actionPerformed(ActionEvent e){
			if(userEmail.getText()==null || userEmail.getText().length()==0){  
				JOptionPane.showMessageDialog( null, "������Ҫɾ���û���email", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );			
			}else{			
				User user = userDao.delete(userEmail.getText());
				if(user!=null){
					JOptionPane.showMessageDialog( null, "�û���ɾ��", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
					userEmail.setText(null);
				}else{
					JOptionPane.showMessageDialog( null, "���û�������", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
				}				
			}
		}
	}
}