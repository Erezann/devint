package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import config.Config;
import gameboard.Level;

public class Game extends Frame {
	private Level level;
	private ArrayList<JLabel> labels;
	private JPanel panel;	

	public Game(Level level) {
		super(Config.QSJ);
		this.setLevel(level);
		init();
	}

	private void init() {
		JPanel panel = new JPanel();
		this.setLabels(new ArrayList<JLabel>());
		switch(this.getLevel()){
		case EASY :
			initEasy();
			break;
		case MEDIUM :
			initMedium();
			break;
		case HARD :
			initHard();
			break;
		default:
			break;	
		}
	}
	
	private void initHard() {
		// TODO Auto-generated method stub
		
	}

	private void initMedium() {
		// TODO Auto-generated method stub
		
	}

	private void initEasy(){
		panel.setLayout(new GridLayout(2,2));
		for(int i = 0; i < this.getLabels().size();i++){
			
		}
	}
	/**
	 * @return the level
	 */
	public Level getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(Level level) {
		this.level = level;
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

	/**
	 * @return the labels
	 */
	public ArrayList<JLabel> getLabels() {
		return labels;
	}

	/**
	 * @param labels the labels to set
	 */
	public void setLabels(ArrayList<JLabel> labels) {
		this.labels = labels;
	}

}
