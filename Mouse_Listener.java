import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyMouse extends JFrame implements MouseListener{
	
	JLabel label;
	MyMouse(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		//label.addMouseListener(this);
		this.addMouseListener(this);
		
		this.setVisible(true);
		this.add(label);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when a mouse button has been Clicked (pressed and released) o a component
		System.out.println("you clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been Pressed on the component
		System.out.println("you pressed the mouse");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on the component
		System.out.println("you released the mouse");
		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when a mouse enters a component
		System.out.println("you enter the component");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// invoked When the Mouse exits a component
		System.out.println("you exits from the component");
		label.setBackground(Color.red);
	}
}
public class Mouse_Listener {

	public static void main(String[] args) {
		new MyMouse();

	}

}
