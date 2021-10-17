package smartcity;

public class UserData {
	private String userId = "";
	private String Password;
	private boolean authentiation = false;
	private String securityQues;
	private String securityAns;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public boolean isAuthentiation() {
		return authentiation;
	}
	public void setAuthentiation(boolean authentiation) {
		this.authentiation = authentiation;
	}
	public String getSecurityQues() {
		return securityQues;
	}
	public void setSecurityQues(String securityQues) {
		this.securityQues = securityQues;
	}
	public String getSecurityAns() {
		return securityAns;
	}
	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}	
	public void resetFields() {
		this.setUserId("");
		this.setAuthentiation(false);
		this.setPassword("");
		this.setSecurityAns("");
		this.setSecurityQues("");
	}
	
}
