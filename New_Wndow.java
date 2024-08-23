import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class LaunchPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton button = new JButton("New Windows");
	
	LaunchPage(){
		button.setBounds(150,150, 100, 50);
		button.addActionListener(this);
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			frame.dispose();
			Window Window = new Window();
		}	
	}
}
class Window{
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello World");
	
	Window() {
		label.setBounds(0,0,100, 150);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
public class New_Wndow {

	public static void main(String[] args) {
		LaunchPage LaunchPage = new LaunchPage();
	}
}