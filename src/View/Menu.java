package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import config.Config;

public class Menu extends Frame{
	private JPanel panel;
	private JButton newGame, resume, option, leave;
		
	public Menu(){
		super("Qui suis-je ?");
		initButton();
	}
	
	private void initButton(){
		this.setNewGame(new JButton(Config.NEW_GAME));
		this.setResume(new JButton(Config.RESUME));
		this.setOption(new JButton(Config.OPTION));
		this.setLeave(new JButton(Config.LEAVE));
		
		Font font = new Font(Config.FONT_BUTTON, Font.CENTER_BASELINE, Config.FONT_SIZE_BUTTON);
		this.getNewGame().setFont(font);
		this.getResume().setFont(font);
		this.getOption().setFont(font);
		this.getLeave().setFont(font);
		
		Dimension dimension = new Dimension(100, 40);
		this.getNewGame().setSize(dimension);
		this.getResume().setSize(dimension);
		this.getOption().setSize(dimension);
		this.getLeave().setSize(dimension);
		
		this.getNewGame().setForeground(Config.FONT_COLOR_BUTTON);
		this.getResume().setForeground(Config.FONT_COLOR_BUTTON);
		this.getOption().setForeground(Config.FONT_COLOR_BUTTON);
		this.getLeave().setForeground(Config.FONT_COLOR_BUTTON);
		
		this.setPanel(new JPanel());
		this.getPanel().setLayout(new GridLayout(4,1));
		this.getPanel().add(this.getNewGame());
		this.getPanel().add(this.getResume());
		this.getPanel().add(this.getOption());
		this.getPanel().add(this.getLeave());
		
		this.getContentPane().add(this.getPanel(), BorderLayout.CENTER);
	}

	/**
	 * @return the panel
	 */
	public JPanel getPanel() {
		return panel;
	}

	/**
	 * @param panel the panel to set
	 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	/**
	 * @return the newGame
	 */
	public JButton getNewGame() {
		return newGame;
	}

	/**
	 * @param newGame the newGame to set
	 */
	public void setNewGame(JButton newGame) {
		this.newGame = newGame;
	}

	/**
	 * @return the resume
	 */
	public JButton getResume() {
		return resume;
	}

	/**
	 * @param resume the resume to set
	 */
	public void setResume(JButton resume) {
		this.resume = resume;
	}

	/**
	 * @return the option
	 */
	public JButton getOption() {
		return option;
	}

	/**
	 * @param option the option to set
	 */
	public void setOption(JButton option) {
		this.option = option;
	}

	/**
	 * @return the leave
	 */
	public JButton getLeave() {
		return leave;
	}

	/**
	 * @param leave the leave to set
	 */
	public void setLeave(JButton leave) {
		this.leave = leave;
	}
}
