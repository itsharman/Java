package lab;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JComponent;

public class SodaCanRunner
{
   public static void draw(Graphics g)
   {
	   	Graphics2D g2 = (Graphics2D) g;

		Ellipse2D.Double c1 = new Ellipse2D.Double(0, 0, 150, 150); g2.draw(c1);
		Ellipse2D.Double c2 = new Ellipse2D.Double(150, 0, 150, 150); g2.draw(c2);
		Ellipse2D.Double c3 = new Ellipse2D.Double(300, 0, 150, 150); g2.draw(c3);
		Ellipse2D.Double c4 = new Ellipse2D.Double(450, 0, 150, 150); g2.draw(c4);
		Ellipse2D.Double c5 = new Ellipse2D.Double(600, 0, 150, 150); g2.draw(c5);
		Ellipse2D.Double c6 = new Ellipse2D.Double(750, 0, 150, 150); g2.draw(c6);
				
		Ellipse2D.Double c7 = new Ellipse2D.Double(0, 150, 150, 150); g2.draw(c7);
		Ellipse2D.Double c8 = new Ellipse2D.Double(150, 150, 150, 150); g2.draw(c8);
		Ellipse2D.Double c9 = new Ellipse2D.Double(300, 150, 150, 150); g2.draw(c9);
		Ellipse2D.Double c10 = new Ellipse2D.Double(450, 150, 150, 150); g2.draw(c10);
		Ellipse2D.Double c11 = new Ellipse2D.Double(600, 150, 150, 150); g2.draw(c11);
		Ellipse2D.Double c12 = new Ellipse2D.Double(750, 150, 150, 150); g2.draw(c12);
		
		Ellipse2D.Double c13 = new Ellipse2D.Double(0, 300, 150, 150); g2.draw(c13);
		Ellipse2D.Double c14 = new Ellipse2D.Double(150, 300, 150, 150); g2.draw(c14);
		Ellipse2D.Double c15 = new Ellipse2D.Double(300, 300, 150, 150); g2.draw(c15);
		Ellipse2D.Double c16 = new Ellipse2D.Double(450, 300, 150, 150); g2.draw(c16);
		Ellipse2D.Double c17 = new Ellipse2D.Double(600, 300, 150, 150); g2.draw(c17);
		Ellipse2D.Double c18 = new Ellipse2D.Double(750, 300, 150, 150); g2.draw(c18);

		Ellipse2D.Double c19 = new Ellipse2D.Double(0, 450, 150, 150); g2.draw(c19);
		Ellipse2D.Double c20 = new Ellipse2D.Double(150, 450, 150, 150); g2.draw(c20);
		Ellipse2D.Double c21 = new Ellipse2D.Double(300, 450, 150, 150); g2.draw(c21);
		Ellipse2D.Double c22 = new Ellipse2D.Double(450, 450, 150, 150); g2.draw(c22);
		Ellipse2D.Double c23 = new Ellipse2D.Double(600, 450, 150, 150); g2.draw(c23);
		Ellipse2D.Double c24 = new Ellipse2D.Double(750, 450, 150, 150); g2.draw(c24);

   }

   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 915;
      final int FRAME_HEIGHT = 640;
      
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JComponent component = new JComponent()
      {
         public void paintComponent(Graphics graph)
         {
            draw(graph);
         }
      };

      frame.add(component);
      frame.setVisible(true);
   }
}
