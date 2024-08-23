import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;

import javax.swing.*;
import javax.swing.JPanel;

class MyGraphic extends JFrame{
	MyPanel panel;
	
	MyGraphic(){
		
		panel = new MyPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
class MyPanel extends JPanel{
	Image image;
	MyPanel(){
		
		image = new ImageIcon("C:\\Users\\Win11\\OneDrive\\Pictures\\Screenshot (1).png").getImage();
		this.setPreferredSize(new Dimension(500,500));
	}
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(5));
		//g2D.drawLine(0, 0, 500, 500);
		//g2D.drawRect(0, 0, 100, 200);
		//g2D.fillRect(0, 0, 100, 200);
		//g2D.setPaint(Color.orange);
		//g2D.drawOval(0, 0, 100, 100);
		//g2D.fillOval(0, 0, 100, 100);
		//g2D.setPaint(Color.red);
		//g2D.fillArc(0, 0, 100, 100, 0, 180);
		//g2D.setPaint(Color.white);
		//g2D.fillArc(0, 0, 100, 100, 180, 180);
		g2D.drawImage(image, 0, 0, null);
		int[] x = {150,250,350};
		int[] y = {300,150,300};
		g2D.fillPolygon(x,y,3);
		
		//g2D.drawString("u are winning", 50, 50);
	}
}
public class Graphic_2D {

	public static void main(String[] args) {
		new MyGraphic();
	}
}
