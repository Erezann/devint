package gameboard;

import groups.Birds;
import groups.MammalWithoutFur;

import java.util.ArrayList;

import characteristics.Beak;
import characteristics.Diet;
import characteristics.Neck;
import characteristics.Other;
import characteristics.Size;
import characteristics.Tail;

import serialization.Data;

import manager.Manager;

import config.Config;

public class Database {
	private ArrayList<Image> database;

	public Database() {
		try {
			this.setDatabase(this.deserialize().getDatabase());
		} catch (Exception e) {
			this.setDatabase(new ArrayList<Image>());
			initDatabase();
		}
	}

	private void initDatabase() {
		/**
		 * BIRDS
		 */
		Birds bird = new Birds();
		bird.add(Neck.LONG);
		bird.add(Beak.SMALL);
		this.getDatabase().add(
				new Image(1, "Autruche", Config.URL_SRC_IMAGE
						+ "oiseaux/autruche.jpg", bird));

		bird = new Birds();
		bird.add(Beak.SMALL);
		bird.add(Other.NEAR_WATER);
		this.getDatabase().add(
				new Image(2, "Manchot", Config.URL_SRC_IMAGE
						+ "oiseaux/manchot.jpg", bird));

		bird = new Birds();
		bird.add(Beak.SMALL);
		bird.add(Other.NEAR_WATER);
		bird.add(Other.FLY);
		this.getDatabase().add(
				new Image(3, "Mouette", Config.URL_SRC_IMAGE
						+ "oiseaux/mouette.jpg", bird));

		bird = new Birds();
		bird.add(Beak.SMALL);
		bird.add(Tail.BIG);
		bird.add(Other.FLY);
		this.getDatabase()
				.add(new Image(4, "Paon", Config.URL_SRC_IMAGE
						+ "oiseaux/paon.jpg"));

		bird = new Birds();
		bird.add(Beak.BIG);
		bird.add(Other.NEAR_WATER);
		bird.add(Other.FLY);
		this.getDatabase().add(
				new Image(5, "Pelican", Config.URL_SRC_IMAGE
						+ "oiseaux/pelican.jpg"));

		bird = new Birds();
		bird.add(Beak.SMALL);
		this.getDatabase().add(
				new Image(6, "Poule", Config.URL_SRC_IMAGE
						+ "oiseaux/poule.jpg"));

		bird = new Birds();
		bird.add(Beak.BIG);
		this.getDatabase().add(
				new Image(7, "Toucan", Config.URL_SRC_IMAGE
						+ "oiseaux/toucan.jpg"));

		/**
		 * MAMMAL WITHOUT FUR
		 */
		MammalWithoutFur mammalWithoutFur = new MammalWithoutFur();
		mammalWithoutFur.add(Size.LARGE);
		mammalWithoutFur.add(Other.TRUNK);
		this.database.add(new Image(8, "Elephant", Config.URL_SRC_IMAGE
				+ "mammifere/elephant.jpg"));

		mammalWithoutFur = new MammalWithoutFur();
		mammalWithoutFur.add(Size.SMALL);
		mammalWithoutFur.add(Other.PIKE);
		this.database.add(new Image(9, "Herisson", Config.URL_SRC_IMAGE
				+ "mammifere/herisson.jpg"));
		
		mammalWithoutFur = new MammalWithoutFur();
		mammalWithoutFur.add(Size.LARGE);
		mammalWithoutFur.add(Other.NEAR_WATER);
		this.database.add(new Image(10, "Hippopotame", Config.URL_SRC_IMAGE
				+ "mammifere/hippopotame.jpg"));
		
		mammalWithoutFur = new MammalWithoutFur();
		mammalWithoutFur.add(Size.MEDIUM);
		mammalWithoutFur.add(Other.WOOL);
		this.database.add(new Image(11, "Mouton", Config.URL_SRC_IMAGE
				+ "mammifere/mouton.jpg"));
		
		mammalWithoutFur = new MammalWithoutFur();
		mammalWithoutFur.add(Size.LARGE);
		mammalWithoutFur.add(Other.HORN);
		this.database.add(new Image(12, "Rhinoceros", Config.URL_SRC_IMAGE
				+ "mammifere/rhinoceros.jpg"));
		
		mammalWithoutFur = new MammalWithoutFur();
		mammalWithoutFur.add(Size.SMALL);
		mammalWithoutFur.add(Other.CARAPACE);
		this.database.add(new Image(13, "Tatou", Config.URL_SRC_IMAGE
				+ "mammifere/tatou.jpg"));
		
	}

	public void blend() {
		int n1, n2, size = this.getDatabase().size();
		for (int i = 0; i < Config.NUMBER_BLEND_DECK; i++) {
			n1 = Manager.random(0, size);
			n2 = Manager.random(0, size);
			Image temp = this.getDatabase().get(n1);
			this.getDatabase().set(n1, this.getDatabase().get(n2));
			this.getDatabase().set(n2, temp);
		}
	}

	public void add(Image image) {
		this.getDatabase().add(image);
	}

	public Image get(int index) {
		return this.getDatabase().get(index);
	}

	public void set(int index, Image image) {
		this.getDatabase().set(index, image);
	}

	public void serialize() {
		Data.store(this, "deck");
	}

	public Database deserialize() {
		return (Database) Data.load("deck");
	}

	/**
	 * @return the database
	 */
	public ArrayList<Image> getDatabase() {
		return database;
	}

	/**
	 * @param database
	 *            the database to set
	 */
	public void setDatabase(ArrayList<Image> database) {
		this.database = database;
	}

}
