package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import config.Config;

public class Frame extends JFrame {
	private JLabel header;

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
		initHeader(screenSize);
		this.setVisible(true);
	}

	private void initHeader(Dimension screenSize) {
		this.setHeader(new JLabel(this.getTitle(), JLabel.CENTER));
		this.getHeader().setPreferredSize(
				new Dimension((int) screenSize.getWidth() - Config.FONT_SIZE_HEADER / 4, Config.FONT_SIZE_HEADER * 2));
		this.getHeader().setFont(new Font(Config.FONT_HEADER, Font.BOLD, Config.FONT_SIZE_HEADER));
		this.getContentPane().add(this.getHeader(), BorderLayout.NORTH);
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
}
