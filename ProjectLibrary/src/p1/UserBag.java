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

	

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}
