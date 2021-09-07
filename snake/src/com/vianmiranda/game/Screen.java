package com.vianmiranda.game;

import java.awt.Dimension;

import javax.swing.JPanel;

public class Screen extends JPanel {
	
	public static final int WIDTH = 800, HEIGHT = 800;
	
	public Screen() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
	}
}
