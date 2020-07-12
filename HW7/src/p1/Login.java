package p1;

public class Login {

	public static boolean isLoggedIn(User[] users, String username, String password) {
		User userFound = null;
		boolean isLoggedInFlag = false;
		
		for (int i = 0; i < users.length; i++) {
			userFound = users[i].findByName(username);
		}
		if (userFound != null) {
			if (password.equals(userFound.getPassword())) {
				isLoggedInFlag = true;
			}

		}
		return isLoggedInFlag;

	}

	

}
