package lab;

public class PracSudoko {

	public static void main(String[] args) {

		int[][] sudoko = new int[6][4];
		
		for(int c = 0; c < sudoko.length; c++)
			for(int r = 0; r < sudoko[c].length;r++) //does the first "book" -- row major order is a lot easier than column ""
			{
				sudoko[r][c] = 1;
				printArr(sudoko);
			}
		
	}
	
	public static void printArr(int[][] a)
	{
		System.out.println("\n ");
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