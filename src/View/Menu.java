package view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame{
	private JLabel label;
		
	public Menu(){
		super("Menu");
		this.initialize();
	}
	
	private void initialize(){
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		this.setSize(screenSize);
		this.setVisible(true);
	}
	
	
}
