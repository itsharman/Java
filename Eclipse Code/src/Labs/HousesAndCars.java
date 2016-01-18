package Labs;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;


public class HousesAndCars extends JComponent
{
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		
		Rectangle house1 = new Rectangle(10, 200, 300, 200);
		g2.draw(house1);

		Line2D.Double lineA1 = new Line2D.Double(10, 200, 160, 50);
		g2.draw(lineA1);
		
		Line2D.Double lineA2 = new Line2D.Double(310, 200, 160, 50);
		g2.draw(lineA2);
		
		
		Rectangle house2 = new Rectangle(450, 200, 300, 200);
		g2.draw(house2);

		Line2D.Double lineB1 = new Line2D.Double(450, 200, 600, 50);
		g2.draw(lineB1);
		
		Line2D.Double lineB2 = new Line2D.Double(750, 200, 600, 50);
		g2.draw(lineB2);
		
		
		Rectangle car1 = new Rectangle(10, 420, 300, 50);
		g2.draw(car1);
		Ellipse2D.Double c1w1 = new Ellipse2D.Double(10, 460, 50, 50);
		g2.draw(c1w1);
		Ellipse2D.Double c1w2 = new Ellipse2D.Double(250, 460, 50, 50);
		g2.draw(c1w2);
		
		
		Rectangle car2 = new Rectangle(450, 420, 300, 50);
		g2.draw(car2);
		Ellipse2D.Double c2w1 = new Ellipse2D.Double(450, 460, 50, 50);
		g2.draw(c2w1);
		Ellipse2D.Double c2w2 = new Ellipse2D.Double(700, 460, 50, 50);
		g2.draw(c2w2);
		
	}

}
