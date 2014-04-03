package gameboard;


import java.util.ArrayList;

public class Deck {
	private ArrayList<Picture> deck;
	private Picture toFound;
	private Database database;
	private Level level;

	public Deck(Level level) {
		this.setLevel(level);
		this.setDatabase(new Database());
		this.getDatabase().blend();
		this.setDeck(new ArrayList<Picture>());
		try {
			for (int i = 0; i < this.getLevel().getValue(); i++) {
				this.getDeck().add(this.getDatabase().get(i));
			}
		} catch (Exception e) {

		}
		this.toFound = this.deck.get((int) Math.random() * (this.deck.size() - 1));
		System.out.println(toFound.getUrl());
	}

	public void add(Picture image) {
		this.getDeck().add(image);
	}

	public Picture get(int index) {
		return this.getDeck().get(index);
	}

	public void set(int index, Picture image) {
		this.getDeck().set(index, image);
	}

	/**
	 * @return the deck
	 */
	public ArrayList<Picture> getDeck() {
		return deck;
	}

	/**
	 * @param deck
	 *            the deck to set
	 */
	public void setDeck(ArrayList<Picture> deck) {
		this.deck = deck;
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
	 * @return the database
	 */
	public Database getDatabase() {
		return database;
	}

	/**
	 * @param database
	 *            the database to set
	 */
	public void setDatabase(Database database) {
		this.database = database;
	}

	/**
	 * @return the toFound
	 */
	public Picture getToFound() {
		return toFound;
	}

	/**
	 * @param toFound the toFound to set
	 */
	public void setToFound(Picture toFound) {
		this.toFound = toFound;
	}
}
