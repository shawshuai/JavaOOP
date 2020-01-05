package chap10.example.ums.gui;

import java.awt.Panel;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import chap10.example.ums.dao.UserDao;
import chap10.example.ums.entity.User;


public class ModifyDialog extends JDialog{
	private UserDao userDao;  	
	
	private JLabel labelEmail = new JLabel("�û�email");
	private JTextField userEmail = new JTextField(20);
	private JButton buttonModify = new JButton("�޸�ע����Ϣ");
	
	private int windowHeight = 150;  //���ڸ߶�	
	private int windowWidth = 400;   //���ڿ��
	
	public ModifyDialog(JFrame parent, String msg, UserDao userDao){
		super(parent, msg, true);
		this.userDao = userDao; 
	}		
	
	public void showMe(JFrame parent){
		Panel pSouth=new Panel();
		pSouth.add(buttonModify);

		Panel pCenter=new Panel();
		pCenter.add(labelEmail);
		pCenter.add(userEmail);
		pCenter.add(pSouth);
		
		add(pCenter);
				
		buttonModify.addActionListener(new ButtonModifyHandler(parent));
		
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
	/**
	 * 
	 * �޸İ�ť���¼�������
	 *
	 */
	private class ButtonModifyHandler implements ActionListener{
		private JFrame parents;
		public ButtonModifyHandler(JFrame parent){
			parents = parent;
		}
		
		public void actionPerformed(ActionEvent e){
			if(userEmail.getText()==null || userEmail.getText().length()==0){
				JOptionPane.showMessageDialog( null, "������Ҫ�޸��û���email", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
			}else{				
				User user  = userDao.selectByEmail(userEmail.getText());
				if(user!=null){ 
					new RegisterDialog(parents, "�޸�ע����Ϣ", userDao, user);
					setVisible(false);
				}else{
					JOptionPane.showMessageDialog( null, "û�и��û�", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
				}
			}
		}
	}	
}	