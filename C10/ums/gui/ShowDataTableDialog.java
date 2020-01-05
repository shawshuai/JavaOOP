package chap10.example.ums.gui;


import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import chap10.example.ums.entity.User;
import chap10.example.ums.util.UserTableModel;

public class ShowDataTableDialog extends JDialog{	
	private int windowHeight = 300;  //���ڸ߶�		
	private int windowWidth = 450;   //���ڿ��	
	private JTable table;	
	
	public ShowDataTableDialog(JFrame parent, String msg, List<User> users){
		super(parent, "�û��б�",true);
		
		table  = new JTable();
		
		//����TableModel
		UserTableModel model = new UserTableModel(users);
		
		//ΪJTable����TableModel
		table.setModel(model);
	}	
	
	public void showMe(JFrame parent){		
		//�����п�
		table.getColumn("���").setPreferredWidth(30);
		table.getColumn("email").setPreferredWidth(100);
		table.getColumn("�û���").setPreferredWidth(60);
		table.getColumn("�Ա�").setPreferredWidth(60);
		table.getColumn("����").setPreferredWidth(200);
		
		//�ر�JTable���Զ���������
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//��JTable������������
		JScrollPane pane = new JScrollPane(table);
		
		//�����������봰��
		this.add(pane);		
		
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
}
