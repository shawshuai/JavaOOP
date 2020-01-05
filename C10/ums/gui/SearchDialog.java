package chap10.example.ums.gui;

import java.awt.Panel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import chap10.example.ums.dao.UserDao;
import chap10.example.ums.entity.User;

public class SearchDialog extends JDialog{
	private UserDao userDao;  
	
	private JLabel labelName = new JLabel("email");
	private JTextField userEmail = new JTextField(20);		
	private JButton buttonSearch = new JButton("  ��ѯ    ");
	
	private int windowHeight = 120;  //���ڸ߶�	
	private int windowWidth = 400;   //���ڿ��
	
	public SearchDialog(JFrame parent, String msg, UserDao userDao){
		super(parent, msg, true);			
		this.userDao = userDao;		
	}	
	
	public void showMe(JFrame parent){		
		Panel pSouth=new Panel();
		pSouth.add(buttonSearch);
		
		Panel pCenter=new Panel();
		pCenter.add(labelName);
		pCenter.add(userEmail);
		pCenter.add(pSouth);		

		addEventHandler(parent);
		
		add(pCenter);

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
	
	public void addEventHandler(JFrame parent){
		buttonSearch.addActionListener(new ButtonSearchEmailHandler(parent));			
	}	
	
	private class ButtonSearchEmailHandler implements ActionListener{  //��email��ѯ�û�
		private JFrame parents;
		public ButtonSearchEmailHandler(JFrame parent){
			parents = parent;
		}
		
		public void actionPerformed(ActionEvent e){			
			if(userEmail.getText()==null || userEmail.getText().length()==0){
				JOptionPane.showMessageDialog( null, "������Ҫ��ѯ�û���email", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
			}else{
				User user = userDao.selectByEmail(userEmail.getText());
				if(user!=null){
					//����ѯ�����û���ӵ�list,��ʾ�ڱ����
					List<User> resList = new ArrayList<User>();
					resList.add(user);
					new ShowDataTableDialog(parents,"��ѯ���", resList);
				}else{
					JOptionPane.showMessageDialog( null, "���û�������", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
				}	
			}
		}
	}
}
