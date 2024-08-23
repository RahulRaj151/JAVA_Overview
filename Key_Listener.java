import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Key extends JFrame implements KeyListener{
	
	JLabel label;

	Key(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.addKeyListener(this);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
		case 'a':label.setLocation(label.getX()-10,label.getY());
		break;
		case 'w':label.setLocation(label.getX(),label.getY()-10);
		break;
		case 's':label.setLocation(label.getX(),label.getY()+10);
		break;
		case 'd':label.setLocation(label.getX()+10,label.getY());
		break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed = Invoked when a physical key is pressed down. Uses KeyCOde, int output
		switch(e.getKeyCode()) {
		case 37:label.setLocation(label.getX()-10,label.getY());
			break;
		case 38:label.setLocation(label.getX(),label.getY()-10);
			break;
		case 40:label.setLocation(label.getX(),label.getY()+10);
			break;
		case 39:label.setLocation(label.getX()+10,label.getY());
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased = Called Whenever a button is released
		System.out.println("you released key char: " + e.getKeyChar());
		System.out.println("you released key char: " + e.getKeyCode());
	
	}
}
public class Key_Listener {

	public static void main(String[] args) {
		
		new Key();
	}
}
