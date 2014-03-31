package view;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import config.Config;

public class Options extends Frame {

	private JPanel panel;
	private Button newPlayer, modifyPlayer, deletePlayer;
	
	public Options() {
		super(Config.OPTION);
		init();
		
		setListeners();
	}
	
	private void init() {
		this.setPanel(new JPanel());
		this.setNewPlayer(new Button(Config.NEW_PLAYER));
		this.setModifyPlayer(new Button(Config.MODIFY));
		this.setDeletePlayer(new Button(Config.DELETE));
		this.getPanel().setLayout(new GridLayout(3, 1));
		this.getPanel().add(this.getNewPlayer());
		this.getPanel().add(this.getModifyPlayer());
		this.getPanel().add(this.getDeletePlayer());

		this.getContentPane().add(this.getPanel());
		
	}

	private void setListeners() {
		this.getNewPlayer().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new NewPlayer();
			}
		});

		this.getModifyPlayer().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SearchPlayer(false);
			}
		});
		
		this.getDeletePlayer().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SearchPlayer(true);
			}
		});
	}

	/**
	 * @return the newPlayer
	 */
	public Button getNewPlayer() {
		return newPlayer;
	}

	/**
	 * @param newPlayer the newPlayer to set
	 */
	public void setNewPlayer(Button newPlayer) {
		this.newPlayer = newPlayer;
	}


	/**
	 * @return the modifyPlayer
	 */
	public Button getModifyPlayer() {
		return modifyPlayer;
	}

	/**
	 * @param modifyPlayer the modifyPlayer to set
	 */
	public void setModifyPlayer(Button modifyPlayer) {
		this.modifyPlayer = modifyPlayer;
	}

	/**
	 * @return the deletePlayer
	 */
	public Button getDeletePlayer() {
		return deletePlayer;
	}

	/**
	 * @param deletePlayer the deletePlayer to set
	 */
	public void setDeletePlayer(Button deletePlayer) {
		this.deletePlayer = deletePlayer;
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
}
