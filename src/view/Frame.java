package view;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import config.Config;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel header;
	private Button regress;
	private JPanel body;

	public Frame(String title) {
		super();
		// Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
		// .getScreenSize();
		Dimension screenSize = new Dimension(1000, 800);
		initFrame(title, screenSize);
		this.body = new JPanel();
		this.getContentPane().add(this.body, BorderLayout.CENTER);
	}

	private void initFrame(String title, Dimension screenSize) {
		this.setTitle(title);
		this.setSize(screenSize);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setExtendedState(Frame.MAXIMIZED_BOTH);
		// setUndecorated(true);

		initHeader(screenSize);
		if (!(this instanceof Menu)) {
			initButton(screenSize);
		}
		setLiseners();

		this.setVisible(true);
	}

	private void setLiseners() {
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				if (e.getPoint() == null) {
					setCursor(Cursor.getDefaultCursor());
				} else {
					setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}

			}

			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	private void initHeader(Dimension screenSize) {
		this.header = new JLabel(this.getTitle(), JLabel.CENTER);
		this.header.setPreferredSize(new Dimension((int) screenSize.getWidth()
				- Config.FONT_SIZE_HEADER / 4, Config.FONT_SIZE_HEADER));
		Font font = new Font(Config.FONT_HEADER, Font.BOLD,
				Config.FONT_SIZE_HEADER);
		this.header.setFont(font);
		this.header.setForeground(Config.FONT_COLOR_HEADER);
		this.getContentPane().add(this.header, BorderLayout.NORTH);
	}

	private void initButton(Dimension screenSize) {
		this.regress = new Button(Config.REGRESS);

		this.regress.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Menu();
			}
		});

		this.getContentPane().add(this.regress, BorderLayout.SOUTH);
	}

	/**
	 * @return the header
	 */
	public JLabel getHeader() {
		return header;
	}

	/**
	 * @param header
	 *            the header to set
	 */
	public void setHeader(JLabel header) {
		this.header = header;
	}

	/**
	 * @return the regress
	 */
	public Button getRegress() {
		return regress;
	}

	/**
	 * @param regress
	 *            the regress to set
	 */
	public void setRegress(Button regress) {
		this.regress = regress;
	}

	/**
	 * @return the body
	 */
	public JPanel getBody() {
		return body;
	}

	/**
	 * @param body
	 *            the body to set
	 */
	public void setBody(JPanel body) {
		this.body = body;
	}
}
