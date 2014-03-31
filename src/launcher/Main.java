package launcher;

import ia.Ask;
import gameboard.Deck;
import gameboard.Level;
import view.Controller;
import view.Difficulty;
import view.Frame;
import view.Game;
import view.Menu;
import view.NewPlayer;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// new Controller();
		new Menu();
		// Deck deck = new Deck(Level.EASY);
		// Ask ask = new Ask(deck);
		// for(int i = 0; i < ask.getChoices().getChoices().size(); i++)
		// System.out.println(ask.getChoices().getChoices().get(i).getValue() +
		// " : " + ask.getChoices().getChoices().get(i).getPhrase());
		// System.out.println(ask.getSentence());
	}
}
