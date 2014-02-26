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
	private Button easy, medium, hard;

	public Difficulty() {
		super(Config.DIFFICULTY);
		init();
		setListeners();
	}

	private void init() {
		this.setPanel(new JPanel());
		this.setEasy(new Button(Config.EASY));
		this.setMedium(new Button(Config.MEDIUM));
		this.setHard(new Button(Config.HARD));
		
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
	public Button getEasy() {
		return easy;
	}

	/**
	 * @param easy
	 *            the easy to set
	 */
	public void setEasy(Button easy) {
		this.easy = easy;
	}

	/**
	 * @return the medium
	 */
	public Button getMedium() {
		return medium;
	}

	/**
	 * @param medium
	 *            the medium to set
	 */
	public void setMedium(Button medium) {
		this.medium = medium;
	}

	/**
	 * @return the hard
	 */
	public Button getHard() {
		return hard;
	}

	/**
	 * @param hard
	 *            the hard to set
	 */
	public void setHard(Button hard) {
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
