package view;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import player.Player;

import config.Config;

public class NewPlayer extends Frame {
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JTextField enterName;

	public NewPlayer() {
		super(Config.NEW_PLAYER);
		init();
		setListeners();
	}

	private void init() {
		this.label = new JLabel(
				"Entre ton prénom puis appuies sur la touche Entrée :");
		this.enterName = new JTextField("Prénom");

		Font font = new Font(Config.FONT_TEXT, Font.BOLD, Config.FONT_SIZE_TEXT);
		this.label.setFont(font);
		this.enterName.setFont(font);

		this.getBody().add(this.label);
		this.getBody().add(this.enterName);
		this.getContentPane().add(this.getBody(), BorderLayout.CENTER);
	}

	private void setListeners() {
		this.enterName.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyChar() == Event.ENTER) {
					dispose();
					Player player = new Player(enterName.getText());
					new Difficulty(player);
				}
			}
		});
	}

	/**
	 * @return the label
	 */
	public JLabel getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(JLabel label) {
		this.label = label;
	}

	/**
	 * @return the enterName
	 */
	public JTextField getEnterName() {
		return enterName;
	}

	/**
	 * @param enterName
	 *            the enterName to set
	 */
	public void setEnterName(JTextField enterName) {
		this.enterName = enterName;
	}

}
