import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow_Layout {

	public static void main(String[] args) {
		// Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = 	places components in a row, sized at their preferred size. 
		//					If the horizontal space in the container is too small,
		//					the FlowLayout class uses the next available row.

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout((LayoutManager) new FlowLayout(FlowLayout.CENTER,10,10));
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);
	}

}
