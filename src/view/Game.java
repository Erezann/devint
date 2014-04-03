package view;

import ia.Ask;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import player.Player;

import config.Config;
import gameboard.Deck;
import gameboard.Level;

public class Game extends Frame {
	private static final long serialVersionUID = 1L;
	private Level level;
	private JPanel informations, images, interactions;
	private ArrayList<Photo> listPhotos;
	private Deck deck;
	private Player player;
	private JLabel sentence;
	private JButton enter, toGiveUp, back;
	private String phrase;
	private Ask ask;

	public Game(Level level, Player player) {
		super(Config.QSJ);
		this.player = player;
		this.level = level;
		this.deck = new Deck(level);
		this.ask = new Ask(this.deck);
		init();
		setListeners();
	}

	private void setListeners() {
		this.back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 0; i < listPhotos.size(); i++) {
					listPhotos.get(i).setSelected(false);
					listPhotos.get(i).setIcon(listPhotos.get(i).getDecouvert());
				}
				revalidate();
				System.out.println(listPhotos.size());
			}
		});

		this.enter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int cpt = 0;
				for (int i = 0; i < listPhotos.size(); i++) {
					if (listPhotos.get(i).isSelected()) {
						listPhotos.get(i)
								.setIcon(listPhotos.get(i).getDelete());
						cpt++;
					}
				}
				if (cpt == listPhotos.size()) {
					for (int i = 0; i < listPhotos.size(); i++) {
						listPhotos.get(i).setSelected(false);
						listPhotos.get(i).setIcon(
								listPhotos.get(i).getDecouvert());
					}
				}
				if(cpt == listPhotos.size() - 1){
					for (int i = 0; i < listPhotos.size(); i++) {
						if(!listPhotos.get(i).isSelected() && listPhotos.get(i).getPicture().getUrl().compareTo(deck.getToFound().getUrl()) == 0){
							dispose();
							new Frame("Gagné");
							break;
						} else {
							new Frame("Perdu");
							dispose();
							break;
						}
					}
				}
				revalidate();
			}
		});
	}

	private void init() {
		this.initSentence();
		this.initInteractions();
		this.listPhotos = new ArrayList<>();
		this.initImages();

		this.getBody().setLayout(new BorderLayout());
		this.getBody().add(this.sentence, BorderLayout.NORTH);
		this.getBody().add(this.interactions, BorderLayout.EAST);
		this.getBody().add(this.images, BorderLayout.CENTER);
		this.getContentPane().add(this.getBody(), BorderLayout.CENTER);
	}

	private void initImages() {
		this.images = new JPanel();
		switch (this.level) {
		case EASY:
			initEasy();
			break;
		case MEDIUM:
			initMedium();
			break;
		case HARD:
			initHard();
			break;
		default:
			break;
		}
		this.getBody().add(this.images, BorderLayout.CENTER);
	}

	private void initInteractions() {
		this.interactions = new JPanel();

		this.enter = new JButton(new ImageIcon(Config.URL_SRC_ICON
				+ "enter.jpg"));
		this.toGiveUp = new JButton(new ImageIcon(Config.URL_SRC_ICON
				+ "help.jpg"));
		this.back = new JButton(new ImageIcon(Config.URL_SRC_ICON
				+ "return.jpg"));

		this.interactions.setLayout(new GridLayout(3, 1));
		this.interactions.add(this.back);
		this.interactions.add(this.toGiveUp);
		this.interactions.add(this.enter);
	}

	private void initSentence() {
		this.phrase = this.ask.getSentence();
		this.sentence = new JLabel(this.phrase, JLabel.CENTER);
		Font font = new Font(Config.FONT_SENTENCE, Font.BOLD, Config.FONT_SIZE_SENTENCE);
		this.sentence.setFont(font);
		this.sentence.setForeground(Config.FONT_COLOR_SENTENCE);
	}

	private void initHard() {
		this.images.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < this.level.getValue(); i++) {
			this.images.add(new Photo(this.deck.get(i), 0.6));
			this.images.add(listPhotos.get(i));
		}
	}

	private void initMedium() {
		this.images.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < this.level.getValue(); i++) {
			this.images.add(new Photo(this.deck.get(i), 0.8));
			this.images.add(listPhotos.get(i));
		}
	}

	private void initEasy() {
		this.images.setLayout(new GridLayout(2, 2));
		for (int i = 0; i < this.level.getValue(); i++) {
			this.listPhotos.add(new Photo(this.deck.get(i), 1.2));
			this.images.add(listPhotos.get(i));
		}
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
	 * @return the informations
	 */
	public JPanel getInformations() {
		return informations;
	}

	/**
	 * @param informations
	 *            the informations to set
	 */
	public void setInformations(JPanel informations) {
		this.informations = informations;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param player
	 *            the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * @return the sentence
	 */
	public JLabel getSentence() {
		return sentence;
	}

	/**
	 * @param sentence
	 *            the sentence to set
	 */
	public void setSentence(JLabel sentence) {
		this.sentence = sentence;
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
	 * @return the ask
	 */
	public Ask getAsk() {
		return ask;
	}

	/**
	 * @param ask
	 *            the ask to set
	 */
	public void setAsk(Ask ask) {
		this.ask = ask;
	}

	/**
	 * @return the images
	 */
	public JPanel getImages() {
		return images;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(JPanel images) {
		this.images = images;
	}

	/**
	 * @return the interactions
	 */
	public JPanel getInteractions() {
		return interactions;
	}

	/**
	 * @param interactions
	 *            the interactions to set
	 */
	public void setInteractions(JPanel interactions) {
		this.interactions = interactions;
	}
}
