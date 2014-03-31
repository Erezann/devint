package view;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import config.Config;

import manager.Manager;

public class Photo extends JLabel implements MouseListener {

	private static final long serialVersionUID = 1L;
	private boolean selected;
	private ImageIcon imageIcon;
	private double ratio;
	private String url;

	public Photo(String url, double ratio) {
		super("", JLabel.CENTER);
		this.selected = false;
		this.addMouseListener(this);
		this.setUrl(url);
		this.ratio = ratio;
		this.imageIcon = new ImageIcon(url);
		this.setIcon(imageIcon);
		Image image = Manager.scaleImage(imageIcon.getImage(), this.ratio);
		imageIcon.setImage(image);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		ImageIcon imageIcon = new ImageIcon(Config.URL_SRC_ICON + "cache.jpg");
		Image image = Manager.scaleImage(imageIcon.getImage(), this.ratio);
		imageIcon.setImage(image);
		this.setIcon(imageIcon);
		this.selected = true;
		System.out.println(this.url + " est coche " + this.selected);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the selected
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * @param selected
	 *            the selected to set
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	/**
	 * @return the imageIcon
	 */
	public ImageIcon getImageIcon() {
		return imageIcon;
	}

	/**
	 * @param imageIcon the imageIcon to set
	 */
	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
	
	/**
	 * @return the ratio
	 */
	public double getRatio() {
		return ratio;
	}

	/**
	 * @param ratio the ratio to set
	 */
	public void setRatio(double ratio) {
		this.ratio = ratio;
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
}
