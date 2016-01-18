package intro;

public class ninexnine {

	public static void main(String[] args) {

		int[][] sudoku = new int[9][9];
		
//		System.out.println(sudoku.length);
//		System.out.println(sudoku[0].length);
		
//		for(int c = 0; c < sudoko.length; c++)
//			for(int r = 0; r < sudoku[c].length;r++) //does the first "book" -- row major order is a lot easier than column ""
//			{
//				sudoku[0][c] = 1;
//				printArr(sudoku);
//			}
		
		for(int i = 0; i < sudoku[0].length;i++) {
			
			sudoku[i][i] = 1;
			printArr(sudoku);
			
		}
		
	}
	
	public static void printArr(int[][] a)
	{
		System.out.println("\nArray: ");
		for(int r = 0; r < a.length; r++)
		{
			for(int c = 0; c < a[r].length;c++)
			{
				System.out.print (a[r][c]+ " ");
			}
			System.out.println();
		}
	}

}
