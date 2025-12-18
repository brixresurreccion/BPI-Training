package M2_GroupProject;

public class User{
	
	private String userName;
	private int userId;
	
	public User() {
		
	}
	public User(String userName) {
		this.userName = userName;
		//this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	/*public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return userId;
	}*/
}
