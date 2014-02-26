package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import config.Config;

public class Menu extends Frame {
	private JPanel panel;
	private Button newGame, resume, option, leave;

	public Menu() {
		super(Config.QSJ);
		initButton();
		setListeners();
		this.setRegress(null);
	}

	private void initButton() {
		this.setNewGame(new Button(Config.NEW_GAME));
		this.setResume(new Button(Config.RESUME));
		this.setOption(new Button(Config.OPTION));
		this.setLeave(new Button(Config.LEAVE));
		this.setPanel(new JPanel());
		
		this.getPanel().setLayout(new GridLayout(4, 1));
		this.getPanel().add(this.getNewGame());
		this.getPanel().add(this.getResume());
		this.getPanel().add(this.getOption());
		this.getPanel().add(this.getLeave());

		this.getContentPane().add(this.getPanel(), BorderLayout.CENTER);
	}

	private void setListeners() {
		this.getNewGame().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new NewGame();
			}
		});

		this.getResume().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Resume();
			}
		});

		this.getOption().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Options();
			}
		});

		this.getLeave().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(getDefaultCloseOperation());
			}
		});
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
	 * @return the newGame
	 */
	public Button getNewGame() {
		return newGame;
	}

	/**
	 * @param newGame
	 *            the newGame to set
	 */
	public void setNewGame(Button newGame) {
		this.newGame = newGame;
	}

	/**
	 * @return the resume
	 */
	public Button getResume() {
		return resume;
	}

	/**
	 * @param resume
	 *            the resume to set
	 */
	public void setResume(Button resume) {
		this.resume = resume;
	}

	/**
	 * @return the option
	 */
	public Button getOption() {
		return option;
	}

	/**
	 * @param option
	 *            the option to set
	 */
	public void setOption(Button option) {
		this.option = option;
	}

	/**
	 * @return the leave
	 */
	public Button getLeave() {
		return leave;
	}

	/**
	 * @param leave
	 *            the leave to set
	 */
	public void setLeave(Button leave) {
		this.leave = leave;
	}
}
