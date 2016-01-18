import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class Tester {
	
	public static void main (String args[])
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Chapter 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
						
//		System.out.println("hey guys");
//		for (int i = 0; i < 100; i++)
//			System.out.println(System.nanoTime());
//		System.out.print("Eager");
//		System.out.print("Monday");
//		
//		int age = 17;
//		int yearofbirth = 2014 - age;
//		
//		System.out.println("Age: " + age);
//		System.out.println("YOB: " + yearofbirth);
	
	}

}

public class RectangleComponent extends JComponent
{
	public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			Rectangle box = new Rectangle(5, 10, 20, 30);
			g2.draw(box);
			box.translate(15, 25);
			g2.draw(box);
			RectangleComponent component = new RectangleComponent();
			frame.add(component);
	}
}