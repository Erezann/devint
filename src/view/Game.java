package view;

import ia.Ask;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
	private JLabel nom, score, sentence;
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
				}
				initImages(listPhotos);
				validate();
			}
		});

		this.enter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				List<Photo> photos = new ArrayList<>();
				for (int i = 0; i < listPhotos.size(); i++) {
					if (listPhotos.get(i).isSelected()) {
						photos.add(listPhotos.get(i));
					}
				}
				initImages(photos);
				validate();
			}
		});

		this.toGiveUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Game(level, player);
			}
		});
	}

	private void init() {
		this.initInformations();
		this.initSentence();
		this.initInteractions();

		this.listPhotos = new ArrayList<>();
		this.initImages(listPhotos);

		this.getBody().setLayout(new BorderLayout());
		this.getBody().add(this.sentence, BorderLayout.NORTH);
		this.getBody().add(this.interactions, BorderLayout.EAST);
		this.getBody().add(this.images, BorderLayout.CENTER);
		this.getBody().add(this.informations, BorderLayout.WEST);
		this.getContentPane().add(this.getBody(), BorderLayout.CENTER);
	}

	private void initImages(List<Photo> photos) {
		this.images = new JPanel();
		switch (this.level) {
		case EASY:
			initEasy(photos);
			break;
		case MEDIUM:
			initMedium(photos);
			break;
		case HARD:
			initHard(photos);
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
	}

	private void initInformations() {
		this.informations = new JPanel();
		this.nom = new JLabel("Nom :" + this.player.getName());
		this.score = new JLabel("Score :" + this.player.getScore());

		this.informations.setLayout(new GridLayout(2, 1));
		this.informations.add(nom);
		this.informations.add(score);
	}

	private void initHard(List<Photo> photos) {
		this.images.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < this.level.getValue(); i++) {
			this.images.add(new Photo(this.deck.get(i).getUrl(), 0.6));
		}
	}

	private void initMedium(List<Photo> photos) {
		this.images.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < this.level.getValue(); i++) {
			this.images.add(new Photo(this.deck.get(i).getUrl(), 0.8));
		}
	}

	private void initEasy(List<Photo> photos) {
		this.images.setLayout(new GridLayout(2, 2));
		for (int i = 0; i < this.level.getValue(); i++) {
			photos.add(new Photo(this.deck.get(i).getUrl(), 1.2));
			this.images.add(photos.get(i));
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
	 * @return the nom
	 */
	public JLabel getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(JLabel nom) {
		this.nom = nom;
	}

	/**
	 * @return the score
	 */
	public JLabel getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(JLabel score) {
		this.score = score;
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
