package view;

import config.Config;
import gameboard.Level;

public class Game extends Frame {
	private Level level;

	public Game(Level level) {
		super(Config.QSJ);
		this.setLevel(level);
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

}
