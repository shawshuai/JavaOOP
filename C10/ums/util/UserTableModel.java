package chap10.example.ums.util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import chap10.example.ums.entity.User;

public class UserTableModel extends AbstractTableModel{
	private List<User> users;
	
	public UserTableModel(List users){
		this.users =users;	
	}

	public int getColumnCount() {
		return 5;		
	}

	public int getRowCount() {
		return users.size();
	}

	public Object getValueAt(int row, int col) {  //��ָ�����С���ȡ������
		User user = (User)users.get(row);
  	    switch(col){
			 case 0: return row+1+"";
			 case 1: return user.getEmail();  //email
			 case 2: return user.getUserName(); //����
			 case 3: return user.getSex();  //�Ա�
			 case 4: return user.getHobbies(); //����
		 }
		 return null;
	}

	public String getColumnName(int col) {
		switch(col){
		 case 0: return "���";
		 case 1: return "email";  //email
		 case 2: return "�û���"; //����
		 case 3: return "�Ա�";  //�Ա�
		 case 4: return "����"; //����
		}
		return null;
	}	
}
