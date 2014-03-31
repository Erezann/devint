package groups;

import java.util.ArrayList;

public class Characteristics {
	private ArrayList<Object> characteristics;
	
	public Characteristics(){
		this.setCharacteristics(new ArrayList<>());
	}
	
	public Characteristics(ArrayList<Object> characteristics){
		this.setCharacteristics(characteristics);
	}

	public void add(Object object){
		this.getCharacteristics().add(object);
	}
	
	public void remove(int i){
		this.getCharacteristics().remove(i);
	}
	
	public Object get(int i){
		return this.getCharacteristics().get(i);
	}
	
	public void set(int i, Object object){
		this.getCharacteristics().set(i, object);
	}
	
	/**
	 * @return the characteristics
	 */
	public ArrayList<Object> getCharacteristics() {
		return characteristics;
	}

	/**
	 * @param characteristics the characteristics to set
	 */
	public void setCharacteristics(ArrayList<Object> characteristics) {
		this.characteristics = characteristics;
	}
	
	

}
