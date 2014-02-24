package gameboard;

import config.Config;

public enum Level {
	
	Easy(Config.NUMBER_IMAGE_EASY), Medium(Config.NUMBER_IMAGE_MEDIUM), Hard(Config.NUMBER_IMAGE_HARD);
	
	private int value;

	Level(int value){
		this.setValue(value);
	}
	
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
}
