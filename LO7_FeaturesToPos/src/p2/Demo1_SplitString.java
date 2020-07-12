package p2;

public class Demo1_SplitString {

	public static void main(String[] args) {
		String words = "james, John, Robert, Michael, Zach, Fire";
		String [] nametokens = words.split(",");
		for(int i = 0; i < nametokens.length; i++)
		System.out.println(nametokens[i].trim());
	}

}
