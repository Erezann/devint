package gameboard;


import java.util.ArrayList;

public class Deck {
	private ArrayList<Image> deck;
	private Database database;
	private Level level;

	public Deck(Level level) {
		this.setLevel(level);
		this.setDatabase(new Database());
		this.getDatabase().blend();
		this.setDeck(new ArrayList<Image>());
		try {
			for (int i = 0; i < this.getLevel().getValue(); i++) {
				this.getDeck().add(this.getDatabase().get(i));
			}
		} catch (Exception e) {

		}

	}

	public void add(Image image) {
		this.getDeck().add(image);
	}

	public Image get(int index) {
		return this.getDeck().get(index);
	}

	public void set(int index, Image image) {
		this.getDeck().set(index, image);
	}

	/**
	 * @return the deck
	 */
	public ArrayList<Image> getDeck() {
		return deck;
	}

	/**
	 * @param deck
	 *            the deck to set
	 */
	public void setDeck(ArrayList<Image> deck) {
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
}
