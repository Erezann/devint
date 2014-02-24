package image;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Image> deck;
		
	public Deck(){
		this.setDeck(new ArrayList<Image>());
	}
	
	public void add(Image image){
		this.getDeck().add(image);
	}
	
	public Image get(int index){
		return this.getDeck().get(index);
	}
	
	public void set(int index, Image image){
		this.getDeck().set(index, image);
	}
	
	/**
	 * @return the deck
	 */
	public ArrayList<Image> getDeck() {
		return deck;
	}
	/**
	 * @param deck the deck to set
	 */
	public void setDeck(ArrayList<Image> deck) {
		this.deck = deck;
	}	
}
