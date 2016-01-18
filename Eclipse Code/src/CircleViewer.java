import javax.swing.JFrame;

public class CircleViewer
	{
		public static void main(String[] args)
			{
				JFrame frame = new JFrame();
				frame.setSize(500, 500);
				frame.setTitle("Five Circles");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				CircleComponent component = new CircleComponent();
				frame.add(component);

				frame.setVisible(true);
			}
	}