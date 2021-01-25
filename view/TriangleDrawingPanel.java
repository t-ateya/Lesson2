package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class TriangleDrawingPanel {

	private JFrame window;
	private JRadioButton redButton = new JRadioButton("Red");
	private JRadioButton yellowButton = new JRadioButton("Yellow");
	private JRadioButton blueButton = new JRadioButton("Blue");
	private JButton clearButton = new JButton("Clear");
	private JButton exitButton = new JButton("Exit");

	public TriangleDrawingPanel(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);

		southPanel.setLayout(new GridLayout(2, 1));
		JPanel radioPanel = new JPanel();
		radioPanel.add(redButton);
		radioPanel.add(yellowButton);
		radioPanel.add(blueButton);
		southPanel.add(radioPanel);

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(clearButton);
		buttonPanel.add(exitButton);
		southPanel.add(buttonPanel);

	}
	
	
}
