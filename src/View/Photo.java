package view;

import gameboard.Picture;

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
	private Picture picture;
	private String urlTemp, name;

	public Photo(Picture image, double ratio) {
		super("", JLabel.CENTER);
		this.selected = false;
		this.addMouseListener(this);
		this.picture = image;
		this.urlTemp = image.getUrl();
		this.ratio = ratio;
		this.imageIcon = this.getDecouvert();
		this.setIcon(imageIcon);
	}

	public ImageIcon getDecouvert() {
		ImageIcon photo = new ImageIcon(this.urlTemp);
		Image image = Manager.scaleImage(photo.getImage(), this.ratio);
		photo.setImage(image);
		return photo;
	}

	private ImageIcon getCache() {
		ImageIcon cache = new ImageIcon(Config.URL_SRC_ICON + "cache.jpg");
		Image image = Manager.scaleImage(cache.getImage(), this.ratio);
		cache.setImage(image);
		return cache;
	}

	public ImageIcon getDelete() {
		ImageIcon delete = new ImageIcon(Config.URL_SRC_ICON + "delete.jpg");
		Image image = Manager.scaleImage(delete.getImage(), this.ratio);
		delete.setImage(image);
		return delete;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int buttonDown = e.getButton();

		if (buttonDown == MouseEvent.BUTTON1) {
			if (this.selected) {
				this.setIcon(this.getDecouvert());
				this.selected = false;
			} else {
				this.setIcon(this.getCache());
				this.selected = true;
			}
		} else {
			Photo p = new Photo(this.getPicture(), 2.5);
			new PictureZoom(p, null, true);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}

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
	 * @param imageIcon
	 *            the imageIcon to set
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
	 * @param ratio
	 *            the ratio to set
	 */
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	/**
	 * @return the picture
	 */
	public Picture getPicture() {
		return picture;
	}

	/**
	 * @param picture
	 *            the picture to set
	 */
	public void setPicture(Picture picture) {
		this.picture = picture;
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
