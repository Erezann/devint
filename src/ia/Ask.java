package ia;

import gameboard.Deck;

public class Ask {
	private Deck deck;
	private Choices choices;

	public Ask(Deck deck) {
		this.setDeck(deck);
		this.setChoices(new Choices(this.getDeck()));
	}
  
	public String getSentence() {
		int deskLength = this.getDeck().getDeck().size();
		if((this.getChoices().get(0).getValue() >= (deskLength - this.getChoices().get(deskLength - 1).getValue()))){
			return this.getChoices().get(0).getPhrase();
		} else {
			return this.getChoices().get(deskLength - 1).getPhrase();
		}
	}

	/**
	 * @return the deck
	 */
	public Deck getDeck() {
		return deck;
	}

	/**
	 * @param deck
	 *            the deck to set
	 */
	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	/**
	 * @return the choices
	 */
	public Choices getChoices() {
		return choices;
	}

	/**
	 * @param choices
	 *            the choices to set
	 */
	public void setChoices(Choices choices) {
		this.choices = choices;
	}
}
