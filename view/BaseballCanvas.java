package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
//This class is used for drawing purpose

public class BaseballCanvas extends JPanel {
	public static int WIDTH = 500;
	public static int HEIGHT = 500;

	private BaseballGamePanel panel;
	public BaseballCanvas (BaseballGamePanel panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.BLACK);

		
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		//custom drawing

	}

	
}
