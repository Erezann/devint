package image;

import characteristics.Age;
import characteristics.Beard;
import characteristics.EyesColor;
import characteristics.HairColor;
import characteristics.Sexe;

public class Image {
	private int id;
	private String url;
	private HairColor hairColor;
	private EyesColor eyesColor;
	private Age age;
	private Sexe sexe;
	private Beard beard;
	
	public Image(){
		this.setUrl("");
		this.setHairColor(HairColor.Without);
		this.setEyesColor(EyesColor.Without);
		this.setAge(Age.Without);
		this.setSexe(Sexe.Without);
		this.setBeard(Beard.Withouth);
		this.setId(0);
	}
	
	public Image(int id, String url, HairColor hairColor, EyesColor eyesColor, Age age, Sexe sexe, Beard beard){
		this.setUrl(url);
		this.setHairColor(hairColor);
		this.setEyesColor(eyesColor);
		this.setAge(age);
		this.setSexe(sexe);
		this.setBeard(beard);
		this.setId(id);
	}
	
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the hairColor
	 */
	public HairColor getHairColor() {
		return hairColor;
	}
	/**
	 * @param hairColor the hairColor to set
	 */
	public void setHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
	}
	/**
	 * @return the eyesColor
	 */
	public EyesColor getEyesColor() {
		return eyesColor;
	}
	/**
	 * @param eyesColor the eyesColor to set
	 */
	public void setEyesColor(EyesColor eyesColor) {
		this.eyesColor = eyesColor;
	}
	/**
	 * @return the age
	 */
	public Age getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Age age) {
		this.age = age;
	}
	/**
	 * @return the sexe
	 */
	public Sexe getSexe() {
		return sexe;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	/**
	 * @return the beard
	 */
	public Beard getBeard() {
		return beard;
	}
	/**
	 * @param beard the beard to set
	 */
	public void setBeard(Beard beard) {
		this.beard = beard;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
