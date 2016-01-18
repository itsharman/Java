import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 A component that draws a triangle
**/

public class LineComponent extends JComponent
 {
	public void paintComponent(Graphics g)
		{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;

		// Draw line 1
		Line2D.Double line1 = new Line2D.Double(5, 10, 100, 150);
		g2.draw(line1);

		// Draw line 2
		Line2D.Double line2 = new Line2D.Double(30, 110, 100, 150);
		g2.draw(line2);

		// Draw line 3
		Line2D.Double line3 = new Line2D.Double(5, 10, 30, 110);
		g2.draw(line3);
		}
}