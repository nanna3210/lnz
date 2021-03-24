package Drhussain;

public class Spiralmatrix {

	
	public static void main(String[] args) {
		int [][] array = {{1,2,3,4},{5,6,7,8} ,{9,10,11,12},{ 13,14,15,16}};
		new Spiralmatrix().printmatrix(array);
	}


	private void printmatrix(int[][] array) {

			int firstRow = 0; 
			int lastrow= array.length-1;
			int firstCol = 0 ; 
			int lastCol = array[0].length-1; 
			while (firstRow<lastrow && firstCol<lastCol) {
				
				
				for (int i = firstCol; i<=lastCol ; i++) { 
					System.out.println(array[firstRow][i]);
				}
				for (int i = firstRow+1; i <= lastrow; i++) {
					System.out.println(array[i][lastCol]);
				}
				for (int i = lastCol-1; i <= firstCol; i--) {
					System.out.println(array[lastrow][i]);
				}
				for (int i = lastrow-1; i > firstCol; i--) {
					System.out.println(array[i][firstCol]);
				}
				
				firstRow++;
				lastCol--;
				lastrow--;
				firstCol++;
			}
			
		
	}
	
	
	
	
	
}
