package p4_copy_objects;

public class demo1 {

	public static void main(String[] args) {
		Copy_objects cat1 =new Copy_objects("cat", 5, 5.5);
		//shollow copy
Copy_objects cat2;
  cat2 = cat1;
  System.out.println(cat2);
  System.out.println(cat1==cat2);
  Copy_objects cat3 = new Copy_objects("cat", 5, 5.5);
  Copy_objects cat4 = new Copy_objects("cat", 5, 5.5);

	}

}
