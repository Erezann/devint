package image;

import gameboard.Level;

import java.util.ArrayList;

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
		}
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
