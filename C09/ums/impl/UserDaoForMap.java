package chap9.example.ums.impl;

import java.util.HashMap;

import java.util.Map;

import chap9.example.ums.EmailExistException;
import chap9.example.ums.PasswordException;
import chap9.example.ums.Pwd2ShortException;
import chap9.example.ums.User;
import chap9.example.ums.UserDao;
import chap9.example.ums.UserNotFoundException;



public class UserDaoForMap implements UserDao{
	private Map<String, User> users;	//key是email, value是用户对象

	public UserDaoForMap() {
		users = new HashMap<String, User>();
	}
	
	public User getUser(String email, String password) throws UserNotFoundException, PasswordException{
		User user = users.get(email);
		if(user==null){
			throw new UserNotFoundException("没有这个用户!");
		}
	    if(user.getPassword().equals(password)){
	    	return user;	//登录成功
	    }else{
	    	throw new PasswordException("密码不对!");
	    }	 
	}

	public User addUser(User user) throws EmailExistException, Pwd2ShortException{
	    if(users.containsKey(user.getEmail())){
	    	throw new EmailExistException("已经注册!");
	    }	    
		if(user.getPassword()==null || user.getPassword().length()<6){
			throw new Pwd2ShortException("密码太短!");
		}
	    users.put(user.getEmail(), user);
	    return user;
	}
}
