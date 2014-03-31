package view;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import config.Config;

public class SearchPlayer extends Frame {

	private JPanel panel;
	private JLabel label;
	private JTextField enterName;
	private boolean toDelete;

	public SearchPlayer(Boolean toDelete) {
		super(Config.SEARCH);
		init();
		setListeners();
	}

	private void init() {
		this.setPanel(new JPanel());
		this.setLabel(new JLabel(
				"Entre le prénom du joueur que tu cherches puis appuies sur la touche Entrée :"));
		this.setEnterName(new JTextField("Prénom"));
		
		Font font = new Font(Config.FONT_TEXT, Font.BOLD, Config.FONT_SIZE_TEXT);
		this.getLabel().setFont(font);
		this.getEnterName().setFont(font);
		
		this.getPanel().add(label);
		this.getPanel().add(enterName);
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
				if (arg0.getKeyChar() == Event.ENTER) {
					dispose();
					if(toDelete)
						new DeletePlayer();
					else 
						new ModifyPlayer();
				}
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

	/**
	 * @return the toDelete
	 */
	public boolean isToDelete() {
		return toDelete;
	}

	/**
	 * @param toDelete the toDelete to set
	 */
	public void setToDelete(boolean toDelete) {
		this.toDelete = toDelete;
	}

}
