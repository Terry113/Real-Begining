package p1;

public class User {
	private String username;
	private String password;
	private User[] arr;
	private int nElems;

	public User(String username, String password) {

		this.username = username;
		this.password = password;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [Username=" + username + ", Password=" + password;
	}

	public User findByName(String username2) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getUsername().equalsIgnoreCase(username2)) {
				return arr[i];
			}
		}
		return null;

	}

}