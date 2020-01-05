package chap9.example.ums;

public interface UserDao {
	public User getUser(String email,String password) throws UserNotFoundException, PasswordException;	
	public User addUser(User user) throws EmailExistException, Pwd2ShortException;

}
