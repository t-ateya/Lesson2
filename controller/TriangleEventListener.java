package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.MenuScreen;
import view.TriangleDrawingPanel;

public class TriangleEventListener implements ActionListener {
	private TriangleDrawingPanel panel;

	public TriangleEventListener (TriangleDrawingPanel panel){
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == panel.getExitButton()){
			JFrame window = panel.getWindow();
			window.getContentPane().removeAll();
			var menu = new MenuScreen(window);
			menu.init();
			window.pack();
			window.revalidate();
			

		}else if (source == panel.getClearButton()){
			System.out.println("Clear");
		}else if (source == panel.getRedButton()){
			System.out.println("Red");
		}else if (source == panel.getYellowButton()){
			System.out.println("Yellow");
		}else if (source == panel.getBlueButton())
			System.out.println("Blue");
	}
	
}
