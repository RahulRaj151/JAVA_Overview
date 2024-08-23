import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import javax.swing.*;

class Game{
	
	JFrame frame;
	JLabel label;
	Game.UpAction upAction;
	Game.DownAction downAction;
	Game.LeftAction leftAction;
	Game.RightAction rightAction;
	
	Game(){
		
		frame = new JFrame("KEy Bindings Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 450);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100,100,100,100);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
		label.getActionMap().put("upAction", upAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
		label.getActionMap().put("downAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
	}
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()-10);
		}
	}
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()+10);
			
		}
	}
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()-10, label.getY());
			
		}
	}
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()+10, label.getY());
			
		}
	}
}
public class Key_Bindings {

	public static void main(String[] args) {
		/* Key Binding= bind an actioon to a keystock
						don't requires you to CLick a component to give it focus
						all Swing Components use key Bindings
						increased Flexibility compared to KeyListeners
						can assign key Strokes to Individual Swing componenets
						more difficult to utilize and setup
						*/
		new Game();
		
	}

}
