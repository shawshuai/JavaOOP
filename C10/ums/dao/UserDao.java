package chap10.example.ums.dao;

import java.util.List;

import chap10.example.ums.entity.User;

public interface UserDao {
	public void insert(User user); 
	
	public User delete(String name);
	
	public void update(User user);

	public User selectByEmail(String email) ;
	
	public List<User> selectAll();
}
