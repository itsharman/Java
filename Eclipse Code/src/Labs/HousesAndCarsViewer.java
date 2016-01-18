package Labs;

import javax.swing.JFrame;

public class HousesAndCarsViewer {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Two Houses & Two Cars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		HousesAndCars component = new HousesAndCars();
		frame.add(component);

		frame.setVisible(true);
	}	

}
