package p1.application;


	

	public class UserBag {
	 private User[] arr;
	 private int nElems;
	 
	 public UserBag(int maxSize) {
	  arr = new User[maxSize];
	  nElems = 0;
	 }
	 
	 public void insert(User user) {
	  arr[nElems++] = user;
	 }
	 
	 public User find(String username, String password) {
	  for(int i =0; i < nElems; i++) {
	   if(arr[i].getUsername().equalsIgnoreCase(username) &&  
	     arr[i].getPassword().contentEquals(password)) {
	    return arr[i];
	   }
	   }
	  
	  return null;
	 }

	 public User find(String username) {
	  for(int i =0; i < nElems; i++) {
	   if(arr[i].getUsername().equalsIgnoreCase(username)) {
	    return arr[i];
	   }
	   }
	  
	  return null;
	 }

	}

