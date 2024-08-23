import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ColorChooser extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	ColorChooser(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		button = new JButton("Pick a color");
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("this is a text");
		label.setFont(new Font("MV Boli",Font.PLAIN,100));
		label.setOpaque(true);
		
		button.addActionListener(this);
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JColorChooser ColorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);
			label.setForeground(color);
			//label.setBackgrounf(color);
		}
		
	}
}

		
public class Color_Chooser {

	public static void main(String[] args) {
		new ColorChooser();
		

	}

}