import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyDrag extends JFrame{
	
	DragPanel dragpanel = new DragPanel();
	MyDrag(){
		this.add(dragpanel);
		this.setTitle("Drag and drop demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class DragPanel extends JPanel{
	
	ImageIcon image = new ImageIcon("C:\\Users\\Win11\\OneDrive\\Pictures\\Screenshot (1).png");
	final int Withd = image.getIconWidth();
	final int Height = image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	
	DragPanel(){
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	 private class ClickListener extends MouseAdapter{
		 public void mousePressed(MouseEvent e) {
			 prevPt = e.getPoint();
		 }
	 }
	 private class DragListener extends MouseMotionAdapter{
		 public void mouseDragged(MouseEvent e) {
			 Point currentPt = e.getPoint();
			 imageCorner.translate((int)(currentPt.getX()-prevPt.getX()), (int)(currentPt.getY()-prevPt.getY()));
			 prevPt = currentPt;
			 repaint();
		 
		 }
	 }
}
public class Drag_Drop {

	public static void main(String[] args) {
		new MyDrag();
	}
}
