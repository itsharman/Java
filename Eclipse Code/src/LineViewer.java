import javax.swing.JFrame;

public class LineViewer
{
	public static void main(String[] args)
		{
			JFrame frame = new JFrame();
			frame.setSize(250, 250);
			frame.setTitle("A Scalene Triangle");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			LineComponent component = new LineComponent();
			frame.add(component);

			frame.setVisible(true);
		}	
}
