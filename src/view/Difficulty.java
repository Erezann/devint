package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gameboard.Level;

import javax.swing.JPanel;

import player.Player;

import config.Config;

public class Difficulty extends Frame {
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private Button easy, medium, hard;
	private Player player;

	public Difficulty(Player player) {
		super(Config.DIFFICULTY);
		this.setPlayer(player);
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
				new Controller(Level.EASY, getPlayer());
			}
		});

		this.getMedium().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Controller(Level.MEDIUM, getPlayer());
			}
		});

		this.getHard().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Controller(Level.HARD, getPlayer());
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

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

}
