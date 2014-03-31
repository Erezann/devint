package view;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import config.Config;

public class DeletePlayer extends Frame{

	private JPanel panel;
	private JLabel label;
	private Button oui;
	private Button non;

	public DeletePlayer() {
		super(Config.DELETE);
		init();
		setListeners();
	}

	private void setListeners() {
		
	}

	private void init() {
		this.setPanel(new JPanel());
		this.setLabel(new JLabel(
				"Es-tu sûr de vouloir supprimer ce joueur ?"));
		this.setOui(new Button(Config.OUI));
		this.setNon(new Button(Config.NON));
		
		this.getPanel().add(oui);
		this.getPanel().add(non);
		
		this.getContentPane().add(this.getPanel(), BorderLayout.CENTER);
		
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
	 * @param label the label to set
	 */
	public void setLabel(JLabel label) {
		this.label = label;
	}

	/**
	 * @return the oui
	 */
	public Button getOui() {
		return oui;
	}

	/**
	 * @param oui the oui to set
	 */
	public void setOui(Button oui) {
		this.oui = oui;
	}

	/**
	 * @return the non
	 */
	public Button getNon() {
		return non;
	}

	/**
	 * @param non the non to set
	 */
	public void setNon(Button non) {
		this.non = non;
	}

}
