package manager;

import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import config.Config;

public abstract class Manager {

	public static int random(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

	public static Image scaleImage(Image source, int width, int height) {
		BufferedImage img = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = (Graphics2D) img.getGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.drawImage(source, 0, 0, width, height, null);
		g.dispose();
		return img;
	}

	public static Image scaleImage(final Image source, final double factor) {
		int width = (int) (source.getWidth(null) * factor);
		int height = (int) (source.getHeight(null) * factor);
		return scaleImage(source, width, height);
	}

//	public static Cursor getHand() {
//		ImageIcon imageIcon = new ImageIcon(Config.URL_SRC_ICON + "cursor_hand.png")
//		Image img = imageIcon.getImage();;
//		return createCustomCursor(img, new Point(16, 16), "cursor_hand");
//	}
}
