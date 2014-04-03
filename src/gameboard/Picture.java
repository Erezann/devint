package gameboard;

import groups.Characteristics;

public class Picture {
	private int id;
	private String url, name;
	private Characteristics characteristics;

	public Picture() {
		this.setUrl("");
		this.setId(0);
	}

	public Picture(int id, String name, String url) {
		this(id, name, url, new Characteristics());
	}

	public Picture(int id, String name, String url,
			Characteristics characteristics) {
		this.setUrl(url);
		this.setName(name);
		this.setId(id);
		this.setCharacteristics(characteristics);
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the characteristics
	 */
	public Characteristics getCharacteristics() {
		return characteristics;
	}

	/**
	 * @param characteristics
	 *            the characteristics to set
	 */
	public void setCharacteristics(Characteristics characteristics) {
		this.characteristics = characteristics;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
