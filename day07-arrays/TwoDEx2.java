
public class TwoDEx2 {

	public static void main(String[] args) {
		// Create a rectangular array with 3 rows & 3 cols
		int[][] numbers = new int[3][3];
		numbers[0][0] = 1;
		numbers[0][1] = 4;
		numbers[0][2] = 7;
		numbers[1][0] = 2;
		numbers[1][1] = 8;
		numbers[1][2] = 14;
		numbers[2][0] = 3;
		numbers[2][1] = 9;
		numbers[2][2] = 21;
		
		// alternatively...
		int[][] nums = {
			{ 1, 4, 7 },
			{ 2, 8, 14 },
			{ 3, 9, 21 }
		};
		
		// jagged array - each row has a different number of columns
		char[][] jagged = new char[4][];
		jagged[0] = new char[2];
		jagged[1] = new char[3];
		jagged[2] = new char[1];
		jagged[3] = new char[4];
		
		// Print all the items in a 2D array (for)
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}
		
		// Print all the items in a 2D array (enhanced for)
		for (int[] row : numbers) {
			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}

}
