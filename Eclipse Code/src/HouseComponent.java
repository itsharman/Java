import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;


public class HouseComponent extends JComponent
{

	public void paintComponent(Graphics g)
		{
			// Recover Graphics2D
			Graphics2D g2 = (Graphics2D) g;
			
			Rectangle r1 = new Rectangle(200, 200, 300, 300);
			g2.draw(r1);

			// Draw line 1
			Line2D.Double line1 = new Line2D.Double(200, 200, 350, 50);
			g2.draw(line1);

			// Draw line 2
			Line2D.Double line2 = new Line2D.Double(500, 200, 350, 50);
			g2.draw(line2);
		}
	
}
