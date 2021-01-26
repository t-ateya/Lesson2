package view;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class TriangleCanvas extends JPanel {
	private TriangleDrawingPanel panel;

	public TriangleCanvas(TriangleDrawingPanel panel){
		this.panel = panel;
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.BLACK);
	}

		@Override
		public void paintComponent(Graphics g){
			super.paintComponent(g);

		}

	
	
}
