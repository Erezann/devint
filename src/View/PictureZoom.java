package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;

import config.Config;


public class PictureZoom extends JDialog {
	private static final long serialVersionUID = 1L;
	private Photo photo;
	private Button button;
	private JLabel name;

	public PictureZoom(Photo photo, JFrame relation, boolean modal) {
		super(relation, photo.getPicture().getName(), modal);
		this.photo = photo;
		init();
	}

	private void init() {
		this.setTitle(this.photo.getPicture().getName());
		this.setSize(1000, 800);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		

		this.button = new Button(Config.REGRESS_GAME);
		this.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();				
			}
		});
		
		this.name = new JLabel(this.photo.getPicture().getName());
		Font font = new Font(Config.FONT_HEADER, Font.BOLD, Config.FONT_SIZE_HEADER);
		this.name.setFont(font);
		this.name.setForeground(Config.FONT_COLOR_HEADER);
		
		this.getContentPane().add(this.name, BorderLayout.NORTH);
		this.getContentPane().add(this.photo, BorderLayout.CENTER);
		this.getContentPane().add(this.button,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
}
