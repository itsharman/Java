package grayImage;

public class PixelRunner {

	public static void main(String[] args) {

		GrayImage image = new GrayImage();
		
		image.print();
		image.processImage();
		
		System.out.println("\n" + image.countWhitePixels());
		
	
	}

}
