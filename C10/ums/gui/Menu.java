package chap10.example.ums.gui;

import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import chap10.example.ums.dao.UserDao;
import chap10.example.ums.dao.impl.UserDaoImplForList;
import chap10.example.ums.entity.User;

public class Menu extends JFrame{
	private JMenuItem jmiRegiste, jmiModify, jmiRemove, jmiAddright,jmiRemoveRight,jmiAssignright;
	private JMenuItem jmiSearchByEmail,jmiSearchAll;
	
	private JButton btnRegiste, btnEdit, btnRemove, btnSearch;
	
	private UserDao userDao;
	
	public static void main(String[] args) throws IOException{
		new Menu().showMe();
	}	  
	
	public Menu(){
	    userDao = new UserDaoImplForList();
	}
	
	private void createMenuBar(){
		//�����˵���
		JMenuBar  menuBar = new  JMenuBar();
		//�����˵�
		JMenu registeMenu = new JMenu("ע��(N)");
		//�����ȼ�
		registeMenu.setMnemonic(KeyEvent.VK_N);
		//����������˵���Ӳ˵���
		registeMenu.add(jmiRegiste = new JMenuItem("ע���û�"));
		//���ÿ�ݼ�
		jmiRegiste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		//���˵���ӵ��˵���
		menuBar.add(registeMenu);
		
		JMenu editmenu = new JMenu("�༭�û���Ϣ(E)");
		editmenu.setMnemonic(KeyEvent.VK_E);
		menuBar.add(editmenu);
		editmenu.add(jmiModify = new JMenuItem("�޸��û���Ϣ(M)",'M'));
		editmenu.add(jmiRemove = new JMenuItem("ɾ���û���Ϣ(R)",'R'));

		JMenu searchmenu = new JMenu("��ѯ�û���Ϣ(S)");
		searchmenu.setMnemonic(KeyEvent.VK_S);
		menuBar.add(searchmenu);
		searchmenu.add(jmiSearchByEmail = new JMenuItem("��email��ѯ(N)",'N'));
		searchmenu.add(jmiSearchAll = new JMenuItem("��������û�(H)",'H'));
		
		JMenu rightmenu = new JMenu("Ȩ�޹���(L)");
		menuBar.add(rightmenu);
		rightmenu.setMnemonic(KeyEvent.VK_L);
		rightmenu.add(jmiAddright = new JMenuItem("����Ȩ��(N)",'N'));
		rightmenu.add(jmiRemoveRight = new JMenuItem("ɾ��Ȩ��(R)",'R'));
		rightmenu.add(jmiAssignright = new JMenuItem("Ϊ�û�����Ȩ��(A)",'A'));
		
		this.setJMenuBar(menuBar);
	}
	
	private void createToolBar(){
		JToolBar toolBar = new JToolBar();  //����������		
		
		btnRegiste = new JButton("", new ImageIcon(this.getClass().getResource("../ico/add.gif")));
		btnRegiste.setToolTipText("ע���û�");
		btnEdit = new JButton("", new ImageIcon(this.getClass().getResource("../ico/modify.gif")));
		btnEdit.setToolTipText("�޸��û���Ϣ");
		btnRemove = new JButton("", new ImageIcon(this.getClass().getResource("../ico/remove.gif")));
		btnRemove.setToolTipText("ɾ���û���Ϣ");
		btnSearch = new JButton("", new ImageIcon(this.getClass().getResource("../ico/search.gif")));
		btnSearch.setToolTipText("��������û�");
		
		toolBar.add(btnRegiste);  
		toolBar.add(btnEdit); 
		toolBar.add(btnRemove);
		toolBar.add(btnSearch);
		
		//�������������JFrame��thisΪ��ǰ���ڶ���
		this.add("North",toolBar);
	}
	private void init(){
		//1.�����˵���
		createMenuBar();  
		
		//2.����������
		createToolBar();  			
		
		//3.��ť���
		JPanel panel = new JPanel();
	    panel.setPreferredSize(new Dimension(800,400));
		this.add("Center",panel);
	}
	
	public void showMe(){
		//���ô��ڶ���
		this.init();
		this.addEventHandler();
		this.setTitle("�û�����ϵͳ");
		this.setBounds(300,200,800,400);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addEventHandler(){
		jmiRegiste.addActionListener(new RegisteHandler());
		jmiModify.addActionListener(new ModifyHandler());
		jmiRemove.addActionListener(new RemoveHandler());
		jmiSearchByEmail.addActionListener(new SearchByEmailHandler());
		jmiSearchAll.addActionListener(new SearchAllHandler());
		
		btnRegiste.addActionListener(new RegisteHandler());
		btnEdit.addActionListener(new ModifyHandler());
		btnRemove.addActionListener(new RemoveHandler());
		btnSearch.addActionListener(new SearchAllHandler());
	}
	
	private class RegisteHandler implements ActionListener{//ע��
		public void actionPerformed(ActionEvent events) {
			new RegisterDialog(Menu.this, "ע���û�", userDao).showMe(Menu.this);
		}  		
	}

	private class ModifyHandler implements ActionListener{//�޸�
		public void actionPerformed(ActionEvent events) {
			new ModifyDialog(Menu.this, "�޸��û���Ϣ", userDao).showMe(Menu.this);
		}  		
	}
	private class RemoveHandler implements ActionListener{//ɾ��
		public void actionPerformed(ActionEvent events) {
			new DeleteDialog(Menu.this,"ɾ���û���Ϣ", userDao).showMe(Menu.this);
		}  		
	}
	
	private class SearchByEmailHandler implements ActionListener{//��email��ѯ
		public void actionPerformed(ActionEvent events) {
			new SearchDialog(Menu.this,"��email��ѯ", userDao).showMe(Menu.this);
		}  		
	}

	private class SearchAllHandler implements ActionListener{  //��ѯ�����û�
		public void actionPerformed(ActionEvent e){
			List<User> users = userDao.selectAll();
			if(users.size()!=0){
				new ShowDataTableDialog(Menu.this, "��ѯ���", users).showMe(Menu.this);  //��ʾ�����û�				
			}else{
				JOptionPane.showMessageDialog( null, "û���û�����Ϣ", "��ʾ" ,JOptionPane.PLAIN_MESSAGE );
			}			
		}
	}
}