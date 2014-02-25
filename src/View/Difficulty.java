package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gameboard.Level;

import javax.swing.JButton;
import javax.swing.JPanel;

import config.Config;

public class Difficulty extends Frame {
	private JPanel panel;
	private JButton easy, medium, hard;

	public Difficulty() {
		super(Config.DIFFICULTY);
		init();
		setListeners();
	}

	private void init() {
		this.setPanel(new JPanel());
		this.setEasy(new JButton(Level.EASY.toString()));
		this.setMedium(new JButton(Level.MEDIUM.toString()));
		this.setHard(new JButton(Level.HARD.toString()));

		Font font = new Font(Config.FONT_BUTTON, Font.CENTER_BASELINE,
				Config.FONT_SIZE_BUTTON);
		this.getEasy().setFont(font);
		this.getMedium().setFont(font);
		this.getHard().setFont(font);

		Dimension dimension = new Dimension(100, 40);
		this.getEasy().setSize(dimension);
		this.getMedium().setSize(dimension);
		this.getHard().setSize(dimension);

		this.getEasy().setForeground(Config.FONT_COLOR_BUTTON);
		this.getMedium().setForeground(Config.FONT_COLOR_BUTTON);
		this.getHard().setForeground(Config.FONT_COLOR_BUTTON);

		this.getPanel().add(this.getEasy());
		this.getPanel().add(this.getMedium());
		this.getPanel().add(this.getHard());
		this.getContentPane().add(this.getPanel(), BorderLayout.CENTER);
	}

	private void setListeners() {
		this.getEasy().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Game(Level.EASY);
			}
		});

		this.getMedium().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Game(Level.MEDIUM);
			}
		});

		this.getHard().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Game(Level.HARD);
			}
		});

	}

	/**
	 * @return the easy
	 */
	public JButton getEasy() {
		return easy;
	}

	/**
	 * @param easy
	 *            the easy to set
	 */
	public void setEasy(JButton easy) {
		this.easy = easy;
	}

	/**
	 * @return the medium
	 */
	public JButton getMedium() {
		return medium;
	}

	/**
	 * @param medium
	 *            the medium to set
	 */
	public void setMedium(JButton medium) {
		this.medium = medium;
	}

	/**
	 * @return the hard
	 */
	public JButton getHard() {
		return hard;
	}

	/**
	 * @param hard
	 *            the hard to set
	 */
	public void setHard(JButton hard) {
		this.hard = hard;
	}

	/**
	 * @return the panel
	 */
	public JPanel getPanel() {
		return panel;
	}

	/**
	 * @param panel
	 *            the panel to set
	 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

}
