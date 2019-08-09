import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame{
	
	guiPanel panel;
	
	public GUI(String title) {
		super(title);
		this.setSize(250, 150);
		
		panel = new guiPanel();
		
		this.getContentPane().add(panel);
		
		this.setVisible(true);
		
	}
	

	
}