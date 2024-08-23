import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("C:/Users/Win11/OneDrive/Pictures/id/new id/other/10.png");
		
		button = new JButton();
		label = new JLabel(icon);
		label.setBounds(150,150,150,150);
		label.setVisible(false);
		
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(this);
		button.setText("button");
		button.setBorder(BorderFactory.createEtchedBorder());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(500,500);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("Clicked");
			//button.setEnabled(false);
			label.setVisible(true);
		}
	}
}

public class Botton {

	public static void main(String[] args) {
		MyFrame MyFrame = new MyFrame(); 
		
		// JRadioButton = One or more buttons in a grouping in which only 1 may be selected per group
		new RadioBottonFrame();
	}
}

class RadioBottonFrame extends JFrame implements ActionListener{

	 JRadioButton pizzaButton;
	 JRadioButton hamburgerButton;
	 JRadioButton hotdogButton;
	 
	 RadioBottonFrame(){
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setLayout(new FlowLayout());
	  
	  pizzaButton = new JRadioButton("pizza");
	  hamburgerButton = new JRadioButton("hamburger");
	  hotdogButton = new JRadioButton("hotdog");
	  
	  ButtonGroup group = new ButtonGroup();
	  group.add(pizzaButton);
	  group.add(hamburgerButton);
	  group.add(hotdogButton);
	  
	  pizzaButton.addActionListener(this);
	  hamburgerButton.addActionListener(this);
	  hotdogButton.addActionListener(this);
	  	  
	  this.add(pizzaButton);
	  this.add(hamburgerButton);
	  this.add(hotdogButton);
	  this.pack();
	  this.setVisible(true);
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
	  if(e.getSource()==pizzaButton) {
	   System.out.println("You ordered pizza!");
	  }
	  else if(e.getSource()==hamburgerButton) {
	   System.out.println("You ordered a hamburger!");
	  }
	  else if(e.getSource()==hotdogButton) {
	   System.out.println("You ordered a hotdog!");
	  }
	 }
	}

