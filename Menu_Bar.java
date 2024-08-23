import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MenuFrame extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	JMenuBar menubar = new JMenuBar();
	JMenu filemenu = new JMenu();
	JMenu editmenu = new JMenu();
	JMenu Helpmenu = new JMenu();
	JMenuItem loadItem = new JMenuItem();
	JMenuItem saveItem = new JMenuItem();
	JMenuItem ExitItem = new JMenuItem();
	
	MenuFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setJMenuBar(menubar);
		this.setVisible(true);
		
		filemenu = new JMenu("File");
		editmenu = new JMenu("Edit");
		Helpmenu = new JMenu("Help");
		
		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(Helpmenu);
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		ExitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		ExitItem.addActionListener(this);
		
		filemenu.setMnemonic(KeyEvent.VK_F); // Alt + F = Shortcut key for File
		editmenu.setMnemonic(KeyEvent.VK_E); // Alt + E = Shortcut key for Edit
		Helpmenu.setMnemonic(KeyEvent.VK_H); // Alt + H = Shortcut key for Help
		loadItem.setMnemonic(KeyEvent.VK_L); // l = Shortcut key to load
		saveItem.setMnemonic(KeyEvent.VK_S); // s = Shortcut key to save
		ExitItem.setMnemonic(KeyEvent.VK_E); // e = Shortcut key to exit
		
		filemenu.add(loadItem);
		filemenu.add(saveItem);
		filemenu.add(ExitItem);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==loadItem) {
			System.out.println("you have loaded a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("you have saved the file");
		}
		if(e.getSource()==ExitItem) {
			System.exit(0);
		}
	}
}
public class Menu_Bar {

	public static void main(String[] args) {
		new MenuFrame();
	}
}
