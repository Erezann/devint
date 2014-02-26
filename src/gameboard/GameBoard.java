package gameboard;

import image.Database;
import image.Deck;

public class GameBoard {
	private Deck deck;
	private Database database;
	private Level level;

	public GameBoard(Level level) {
		this.setDeck(new Deck());
		this.setLevel(level);
		this.initialize();
	}

	private void initialize() {
		this.getDatabase().blend();
		for (int i = 0; i < this.getLevel().getValue(); i++) {
			this.getDeck().add(this.getDatabase().get(i));
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
