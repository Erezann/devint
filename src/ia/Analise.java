package ia;

import characteristics.Beak;
import characteristics.Move;
import characteristics.Tail;
import gameboard.Deck;
import groups.Birds;
import groups.Characteristics;

public class Analise {
	private Deck deck;

	public Analise(Deck deck) {
		this.setDeck(deck);
	}

	public int getNumberOfBirds() {
		int count = 0;
		for (int i = 0; i < this.getDeck().getDeck().size(); i++) {
			if (this.getDeck().get(i).getCharacteristics() instanceof Birds) {
				count++;
			}
		}
		return count;
	}

	public int getNumberOfBirdsBeakBig() {
		int count = 0;
		for (int i = 0; i < this.getDeck().getDeck().size(); i++) {
			Characteristics characteristics = this.getDeck().get(i)
					.getCharacteristics();
			if (characteristics instanceof Birds
					&& characteristics.getCharacteristics().contains(Beak.BIG)) {
				count++;
			}
		}
		return count;
	}

	public int getNumberOfBirdsTailsSmall() {
		int count = 0;
		for (int i = 0; i < this.getDeck().getDeck().size(); i++) {
			Characteristics characteristics = this.getDeck().get(i)
					.getCharacteristics();
			if (characteristics instanceof Birds
					&& characteristics.getCharacteristics()
							.contains(Tail.SMALL)) {
				count++;
			}
		}
		return count;
	}

	public int getNumberOfBirdsMoveTwoTabs() {
		int count = 0;
		for (int i = 0; i < this.getDeck().getDeck().size(); i++) {
			Characteristics characteristics = this.getDeck().get(i)
					.getCharacteristics();
			if (characteristics instanceof Birds
					&& characteristics.getCharacteristics().contains(
							Move.TWO_TABS)) {
				count++;
			}
		}
		return count;
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
}
