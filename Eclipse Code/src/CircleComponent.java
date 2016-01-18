import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
A component that draws five circles (different color) with the following diameters: 40, 80, 120, 160, and 200, all tangent at a common point.
**/

public class CircleComponent extends JComponent
	{
		public void paintComponent(Graphics g)
			{
				Graphics2D g2 = (Graphics2D) g;

				Ellipse2D.Double c1 = new Ellipse2D.Double(0, 200, 40, 40);
				g2.draw(c1);
				g2.setColor(Color.PINK);
				
				Ellipse2D.Double c2 = new Ellipse2D.Double(0, 180, 80, 80);
				g2.draw(c2);
				g2.setColor(Color.BLUE);
				
				Ellipse2D.Double c3 = new Ellipse2D.Double(0, 160, 120, 120);
				g2.draw(c3);
				g2.setColor(Color.GREEN);
				
				Ellipse2D.Double c4 = new Ellipse2D.Double(0, 140, 160, 160);
				g2.draw(c4);
				g2.setColor(Color.ORANGE);
				
				Ellipse2D.Double c5 = new Ellipse2D.Double(0, 120, 200, 200);
				g2.draw(c5);
				g2.setColor(Color.MAGENTA);
			}
	}