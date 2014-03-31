package player;

import java.util.ArrayList;

import serialization.Data;

public class Users {
	private ArrayList<Player> users;

	public Users() {
		try {
			this.setUsers(this.deserialize());
		} catch (Exception e) {
			this.setUsers(new ArrayList<Player>());
			serialize();
		}
	}

	/**
	 * @return the users
	 */
	public ArrayList<Player> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(ArrayList<Player> users) {
		this.users = users;
	}

	public void serialize() {
		Data.store(this, "users");
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Player> deserialize() {
		return (ArrayList<Player>) Data.load("users");
	}
}
