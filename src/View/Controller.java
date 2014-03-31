package view;

import ia.Ask;
import gameboard.Level;
import player.Player;

public class Controller {
	private Player player;
	private Game game;
	private Level level;
	private Ask ask;

	public Controller(Level level, Player player) {
		this.player = player;
		this.level = level;
		this.game = new Game(level, player);
		this.ask = new Ask(this.game.getDeck());
		this.game.setPhrase(this.ask.getSentence());
		this.game.revalidate();
	}

	
	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * @return the level
	 */
	public Level getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}

	/**
	 * @return the ask
	 */
	public Ask getAsk() {
		return ask;
	}


	/**
	 * @param ask the ask to set
	 */
	public void setAsk(Ask ask) {
		this.ask = ask;
	}
}
