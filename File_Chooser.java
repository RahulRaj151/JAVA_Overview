import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.plaf.FileChooserUI;

class FileChooser extends JFrame implements ActionListener{

	JButton button;
	FileChooser(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		button = new JButton("Select File");
		button.addActionListener(this);
		this.add(button);
		this.pack();
		this.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("C:\\Users\\Win11\\Desktop"));
			
			//int response = fileChooser.showOpenDialog(null); // select file to open
			int response = fileChooser.showSaveDialog(null); // select file to save
			if(response == JFileChooser.APPROVE_OPTION) {
				File file1 = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file1);
			}
		}	
	}
}
public class File_Chooser {

	public static void main(String[] args) {
		// JFileChooser = a GUI machanism to let the user to select a file
		
		new FileChooser();
	}
}
