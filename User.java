package BankApplication;

public class User {
	
	
	  private String userName;
	  private int userId;
	  private String userPassword;
	public User(String userName, int userId, String userPassword) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", userPassword=" + userPassword + "]";
	}
	}



