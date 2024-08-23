import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class CheckFrame extends JFrame implements ActionListener{

	JButton button;
	JCheckBox checkBox;
	
	CheckFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
	}
}


public class CheckBox {

	public static void main(String[] args) {
		
		// JCheckBox = A GUI component that can be selected or deselected
		
				new CheckFrame();
	}

}
