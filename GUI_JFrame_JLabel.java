import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.Border;

public class GUI_JFrame_JLabel {

	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a String of Text, Image or both
		ImageIcon image = new ImageIcon("10.png"); 
		
		Border border = BorderFactory.createLineBorder(Color.green);
		
		JLabel label = new JLabel(); // create a Label
		label.setText("Hello World, how you've been doing ?"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);// set horizontal position of the text
		label.setVerticalTextPosition( JLabel.TOP);// set vertical position of the text
		label.setForeground(Color.red);// change the color of the text
		label.setFont(new Font("MV Boli", Font.BOLD, 40));// change Font of the text
		label.setBackground(Color.green);// set background color
		label.setOpaque(true);// display the background color
		label.setBorder(border);// set border of the label
		label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position of the image
		label.setVerticalAlignment(JLabel.TOP);// set vertical position of the image
		
		// JFrame = a GUI window to add components to
		JFrame frame = new JFrame(); //creates a Frame
		frame.setVisible(true); // make the frame visible
		frame.setTitle("my frame"); // set a title 
		//frame.setSize(420,420);// size as x-y dimension
		//frame.setResizable(false);// set the application cannot be resize
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// EXIT THE APPLICATION
		frame.add(label);
		frame.pack();
		
		ImageIcon icon = new ImageIcon("C:/Users/Win11/OneDrive/Pictures/id/new id/other/10.png"); // create an imageIcon
		frame.setIconImage(icon.getImage()); //change icon in the frame
		//frame.getContentPane().setBackground(Color.blue);// set color to the frame

	}

}
