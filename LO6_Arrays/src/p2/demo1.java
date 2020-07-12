package p2;

public class demo1 {

	public static void main(String[] args) {
		int[][] n = new int [3][4];
		n[0][0] = 0;
		n[0][1] = 1;
		n[0][2] = 2;
		n[0][3] = 3;
		n[1][0] = 4;
		n[1][1] = 5;
		n[1][2] = 6;
		n[1][3] = 7;
		n[2][0] = 8;
		n[2][1] = 9;
		n[2][2] = 10;
		n[2][3] = 11;
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++)
			System.out.print(n[i][j]);
		}
	}

}
