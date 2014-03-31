package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import config.Config;

public class Menu extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Button newGame, resume, option, leave;

	public Menu() {
		super(Config.QSJ);
		initButton();
		setListeners();
		this.setRegress(null);
	}

	private void initButton() {
		this.newGame = new Button(Config.NEW_GAME);
		this.resume = new Button(Config.RESUME);
		this.option = new Button(Config.OPTION);
		this.leave = new Button(Config.LEAVE);

		this.getBody().setLayout(new GridLayout(4, 1));
		this.getBody().add(this.getNewGame());
		this.getBody().add(this.getResume());
		this.getBody().add(this.getOption());
		this.getBody().add(this.getLeave());

		this.getContentPane().add(this.getBody(), BorderLayout.CENTER);
	}

	private void setListeners() {
		this.newGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new NewGame();
			}
		});

		this.resume.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Resume();
			}
		});

		this.option.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Options();
			}
		});

		this.leave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(getDefaultCloseOperation());
			}
		});
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
