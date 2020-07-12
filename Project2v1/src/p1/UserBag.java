package p1;

public class UserBag {
	private User[] arr;
	private int nElems;

	public UserBag(int Maxsize) {
		arr = new User[Maxsize];
		nElems = 0;
	}

	public void insert(User user) {
		arr[nElems++] = user;
	}

	public User findByName(String user) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getUsername().equalsIgnoreCase(user)) {
				return arr[i];
			}
		}
		return null;
	}

	public User deleteUserName(String username) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getUsername().equalsIgnoreCase(username)) {
				break;
			}
		}
		if (i == nElems) {
			return null;
		} else {
			User temp = arr[i];
			for (int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;

			return temp;
		}

	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}
