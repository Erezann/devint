package view;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import config.Config;

public class NewGame extends Frame {
	private JPanel panel;
	private JLabel label;
	private JTextField enterName;
	private Button newPlayer;

	public NewGame() {
		super(Config.NEW_GAME);
		init();
		setListeners();
	}

	private void init() {
		this.setPanel(new JPanel());
		this.setLabel(new JLabel(
				"Entre ton prénom si t'as déja joué puis appuies sur la touche Entrée :"));
		this.setEnterName(new JTextField("Prénom"));
		this.setNewPlayer(new Button("Ajouter un nouvel utilisateur"));

		Font font2 = new Font(Config.FONT_TEXT, Font.BOLD,
				Config.FONT_SIZE_TEXT);
		this.getLabel().setFont(font2);
		this.getEnterName().setFont(font2);

		this.getPanel().add(this.getLabel());
		this.getPanel().add(this.getEnterName());
		this.getPanel().add(this.getNewPlayer());
		this.getContentPane().add(this.getPanel(), BorderLayout.CENTER);
	}

	private void setListeners() {
		this.getEnterName().addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO gestion de connexion de l'utilisateur.
				if (arg0.getKeyChar() == Event.ENTER) {
					dispose();
					new Menu();
				}
			}
		});

		this.getNewPlayer().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new NewPlayer();
			}
		});
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
	 * @return the newPlayer
	 */
	public Button getNewPlayer() {
		return newPlayer;
	}

	/**
	 * @param newPlayer
	 *            the newPlayer to set
	 */
	public void setNewPlayer(Button newPlayer) {
		this.newPlayer = newPlayer;
	}

}
