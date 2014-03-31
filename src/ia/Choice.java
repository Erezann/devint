package ia;

public class Choice {
	private int value;
	private String phrase, negative;

	public Choice(int value, String phrase, String negative) {
		this.setPhrase(phrase);
		this.setValue(value);
		this.setNegative(negative);
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

	/**
	 * @return the phrase
	 */
	public String getPhrase() {
		return phrase;
	}

	/**
	 * @param phrase
	 *            the phrase to set
	 */
	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	/**
	 * @return the negative
	 */
	public String getNegative() {
		return negative;
	}

	/**
	 * @param negative
	 *            the negative to set
	 */
	public void setNegative(String negative) {
		this.negative = negative;
	}

	public int compareTo(Choice c) {
		if (this.getValue() == c.getValue()) {
			return 0;
		} else if (this.getValue() > c.getValue()) {
			return 1;
		} else {
			return -1;
		}
	}
}
