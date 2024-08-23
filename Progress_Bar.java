import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JProgressBar;
import java.awt.*;

class ProgressDemo{
	
	JFrame frame = new JFrame();
	JProgressBar bar1 = new JProgressBar();
	JProgressBar bar2 = new JProgressBar();
	
	ProgressDemo(){
		
		bar1.setValue(0);
		bar1.setBounds(0, 0, 420, 50);
		bar1.setStringPainted(true);
		bar1.setForeground(Color.green);
		
		bar2.setValue(0);
		bar2.setBounds(0,100, 420, 50);
		bar2.setStringPainted(true);
		bar2.setForeground(Color.blue);
		
		frame.add(bar1);
		frame.add(bar2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		fill();
	}
		
		void fill() {
			 int counter = 0;
			 while(counter<=100) {
				 bar1.setValue(counter);
				 try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 counter +=1;
			 }
			 bar1.setString("Done!");
			 
			 int counter2 = 100;
			 while(counter2>=0) {
				 bar2.setValue(counter);
				 try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 counter -=1;
			 }
			 bar2.setString("Done Again!");
		}
	}
	
public class Progress_Bar {

	public static void main(String[] args) {
		// Progreass Bar = Visual aid to let the user know that an opression is in prossesing
		ProgressDemo demo = new ProgressDemo();
		
	}

}
