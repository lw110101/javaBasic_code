package user_book;

public class User {

	String acounts;
	String password;
	
	public User(String acounts, String password) {
		this.acounts = acounts;
		this.password = password;
	}
	
	public String getAcounts() {
		return acounts;
	}

	public void setAcounts(String acounts) {
		this.acounts = acounts;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ÓÃ»§Ãû:" + this.acounts + "  ÃÜÂë:" + this.password;
	}
	@Override
	public boolean equals(Object obj) {
		User u=(User)obj;
		return this.acounts.equals(u.acounts);
	}
}