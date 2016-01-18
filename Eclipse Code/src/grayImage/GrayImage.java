package grayImage;

public class GrayImage {

	public static final int BLACK = 0;
	public static final int WHITE = 255;
	
	private int[][] pixelValues;
	
	public GrayImage() {
		
		int n = (int) (Math.random() * 7 + 2);
		int m = (int) (Math.random() * 7 + 2);
		
		pixelValues = new int[n][m];
		
		fillAray();
		
	}
	
	private void fillAray() {

		for(int i = 0; i < pixelValues.length; i++) { //columns
			
			for(int j = 0; j < pixelValues[i].length; j++) { //rows
				
				if(Math.random() > .5) { 
					
					pixelValues[i][j] = WHITE;
					
				}
				
				else pixelValues[i][j] = (int) (Math.random() * 255);
				
			} 
			
		}
		
	}

	public void print() {
		
		for(int i = 0; i < pixelValues.length; i++) { //columns
			
			for(int j = 0; j < pixelValues[i].length; j++) { //rows
				
				System.out.print(pixelValues[i][j] + " ");
				
			} 
			
			System.out.println();
			
		}
		
	}
	
	public int countWhitePixels() {
		
		int quantity = 0;
		
		for(int i = 0; i < pixelValues.length; i++) {
			
			for(int j = 0; j < pixelValues[i].length; j++) {
				
				if(pixelValues[i][j] == 255) quantity++;
				
			}
			
		} return quantity;
		
	}
	
	public void processImage() {
		
		for(int i = 0; i < pixelValues.length - 2; i++) {
			
			for(int j = 0; j < pixelValues.length - 2; j++)	{
				
				pixelValues[i][j] -= pixelValues[i + 2][j + 2];
				
				if(pixelValues[i][j] < 0) pixelValues[i][j] = 0;
			}
		}
	}
}
