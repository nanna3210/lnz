package Drhussain;

public class TwodArray {

	public static void main(String[] args) {

		int[][] data = new int[3][3];

		data[0][0] = 1;
		data[0][1] = 8;
		data[0][2] = 7;
		data[1][0] = 6;
		data[1][1] = 5;
		data[1][2] = 4;
		data[2][0] = 7;
		data[2][1] = 9;
		data[2][2] = 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(data[i][j] + "\t");

			}
			System.out.println();
		}

	}
}
