package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import config.Config;

public class Frame extends JFrame {
	private JLabel header;
	private JButton regress;

	public Frame(String title) {
		super();
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		initFrame(title, screenSize);
	}

	private void initFrame(String title, Dimension screenSize) {
		this.setTitle(title);
		this.setSize(screenSize);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setUndecorated(true);
		
		initHeader(screenSize);
		if(!(this instanceof Menu)){
			initButton(screenSize);
		}
		
		this.setVisible(true);
	}

	private void initHeader(Dimension screenSize) {
		this.setHeader(new JLabel(this.getTitle(), JLabel.CENTER));
		this.getHeader().setPreferredSize(
				new Dimension((int) screenSize.getWidth() - Config.FONT_SIZE_HEADER / 4, Config.FONT_SIZE_HEADER * 2));
		Font font = new Font(Config.FONT_HEADER, Font.BOLD, Config.FONT_SIZE_HEADER);
		this.getHeader().setFont(font);
		this.getHeader().setForeground(Config.FONT_COLOR_HEADER);
		this.getContentPane().add(this.getHeader(), BorderLayout.NORTH);
	}
	
	private void initButton(Dimension screenSize){
		this.setRegress(new JButton(Config.REGRESS));
		this.getRegress().setPreferredSize(
				new Dimension((int) screenSize.getWidth() - Config.FONT_SIZE_HEADER / 4, Config.FONT_SIZE_HEADER * 2));
		Font font = new Font(Config.FONT_HEADER, Font.BOLD, Config.FONT_SIZE_HEADER);
		this.getRegress().setFont(font);
		this.getRegress().setForeground(Config.FONT_COLOR_HEADER);
		this.getRegress().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Menu();
			}
		});
		this.getContentPane().add(this.getRegress(), BorderLayout.SOUTH);
	}
	

	/**
	 * @return the header
	 */
	public JLabel getHeader() {
		return header;
	}

	/**
	 * @param header
	 *            the header to set
	 */
	public void setHeader(JLabel header) {
		this.header = header;
	}

	/**
	 * @return the regress
	 */
	public JButton getRegress() {
		return regress;
	}

	/**
	 * @param regress the regress to set
	 */
	public void setRegress(JButton regress) {
		this.regress = regress;
	}
}
