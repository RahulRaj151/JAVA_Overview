import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_Panels {

	public static void main(String[] args) {
		
		ImageIcon icon = new ImageIcon("C:/Users/Win11/OneDrive/Pictures/id/new id/other/10.png");
		JLabel label = new JLabel();
		label.setIcon(icon);
		
		
		// JPanel = a GUI component that functions as a containers to hold other components
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0, 0, 250, 250);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250, 0, 250, 250);
		
		JFrame frame = new JFrame(); //creates a Frame
		frame.setVisible(true); // make the frame visible
		frame.setTitle("my frame"); // set a title 
		frame.setLayout(null);
		frame.setSize(420,420);// size as x-y dimension
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		redpanel.add(label);
		frame.add(redpanel);
		frame.add(bluepanel);

	}

}
