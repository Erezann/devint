package controller;

import view.Menu;

public class Controller {
	private Menu menu;
	
	public Controller(){
		this.setMenu(new Menu());
	}

	/**
	 * @return the menu
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}
