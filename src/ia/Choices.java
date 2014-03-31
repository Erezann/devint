package ia;

import gameboard.Deck;
import gameboard.Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Choices {
	private ArrayList<Choice> choices;
	private Deck deck;
	private Analise analise;

	public Choices(Deck deck) {
		this.setChoices(new ArrayList<Choice>());
		this.setDeck(deck);
		this.setAnalise(new Analise(this.getDeck()));
		init();
	}

	public Choices(Level level) {
		this(new Deck(level));
	}

	private void init() {
		this.getChoices().add(
				new Choice(this.getAnalise().getNumberOfBirds(),
						"Je suis un oiseau.", "Je ne suis pas un oiseau."));
		this.getChoices().add(
				new Choice(this.getAnalise().getNumberOfBirdsBeakBig(),
						"J'ai un grand bec.", "Je n'ai pas un grand bec."));
		this.getChoices().add(
				new Choice(this.getAnalise().getNumberOfBirdsMoveTwoTabs(),
						"Je marche sur deux pattes.",
						"Je ne marche pas sur deux pattes."));
		this.getChoices().add(
				new Choice(this.getAnalise().getNumberOfBirdsTailsSmall(),
						"J'ai une petite queue.",
						"Je n'ai pas une petite queue."));

		Collections.sort(this.getChoices(), new ComparatorChoice());
	}

	private class ComparatorChoice implements Comparator<Choice> {

		@Override
		public int compare(Choice o1, Choice o2) {
			return o1.compareTo(o2);
		}

	}

	public void add(Choice choice) {
		this.getChoices().add(choice);
	}

	public void remove(int i) {
		this.getChoices().remove(i);
	}

	public Choice get(int i) {
		return this.getChoices().get(i);
	}

	public void set(int i, Choice choice) {
		this.getChoices().set(i, choice);
	}

	/**
	 * @return the choices
	 */
	public ArrayList<Choice> getChoices() {
		return choices;
	}

	/**
	 * @param choices
	 *            the choices to set
	 */
	public void setChoices(ArrayList<Choice> choices) {
		this.choices = choices;
	}

	/**
	 * @return the analise
	 */
	public Analise getAnalise() {
		return analise;
	}

	/**
	 * @param analise
	 *            the analise to set
	 */
	public void setAnalise(Analise analise) {
		this.analise = analise;
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
