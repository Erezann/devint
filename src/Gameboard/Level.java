package gameboard;

import config.Config;

public enum Level {

	EASY(Config.NUMBER_IMAGE_EASY), MEDIUM(Config.NUMBER_IMAGE_MEDIUM), HARD(
			Config.NUMBER_IMAGE_HARD);

	private int value;

	Level(int value) {
		this.setValue(value);
	}

	@Override
	public String toString() {
		switch (this) {
		case EASY:
			return Config.EASY;
		case MEDIUM:
			return Config.MEDIUM;
		case HARD:
			return Config.HARD;
		default:
			return "";
		}
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
}
