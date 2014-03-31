package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

import config.Config;

public class Button extends JButton {
	private static final long serialVersionUID = 1L;
	private String title;
	
	public Button(String title){
		super(title);
		this.setTitle(title);
		init();
	}

	private void init() {
		this.setFont(new Font(Config.FONT_BUTTON, Font.CENTER_BASELINE,
				Config.FONT_SIZE_BUTTON));
		this.setSize(new Dimension(100,40));
		this.setForeground(Config.FONT_COLOR_BUTTON);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
}
