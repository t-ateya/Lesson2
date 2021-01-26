package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import controller.TriangleEventListener;

public class TriangleDrawingPanel {

	private JFrame window;
	private TriangleCanvas canvas;
	private JRadioButton redButton = new JRadioButton("Red");
	private JRadioButton yellowButton = new JRadioButton("Yellow");
	private JRadioButton blueButton = new JRadioButton("Blue");
	private JButton clearButton = new JButton("Clear");
	private JButton exitButton = new JButton("Exit");

	public TriangleDrawingPanel(JFrame window) {
		this.window = window;
	}

	public void init() {
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

		// radio group
		ButtonGroup colorGroup = new ButtonGroup();
		colorGroup.add(redButton);
		colorGroup.add(yellowButton);
		colorGroup.add(blueButton);

		// titled border for radio
		TitledBorder title = BorderFactory.createTitledBorder("Color");
		radioPanel.setBorder(title);

		canvas = new TriangleCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);
		

		// attach event listener
		final var listener = new TriangleEventListener(this);
		exitButton.addActionListener(listener);
		clearButton.addActionListener(listener);
		redButton.addActionListener(listener);
		yellowButton.addActionListener(listener);
		blueButton.addActionListener(listener);
		canvas.addMouseListener(listener);

	}

	public JFrame getWindow() {
		return window;
	}

	public TriangleCanvas getCanvas() {
		return canvas;
	}

	public JRadioButton getRedButton() {
		return redButton;
	}

	public JRadioButton getYellowButton() {
		return yellowButton;
	}

	public JRadioButton getBlueButton() {
		return blueButton;
	}

	public JButton getClearButton() {
		return clearButton;
	}

	public JButton getExitButton() {
		return exitButton;
	}

	

}

/*class TriangleMouseEvent implements MouseListener, MouseMotionListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked: " + e.getX() + ", " + e.getY());

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed: " + e.getX() + ", " + e.getY());

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released: " + e.getX() + ", " + e.getY());

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered: " + e.getX() + ", " + e.getY());

	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited: " + e.getX() + ", " + e.getY());

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Dragged: " + e.getX() + ", " + e.getY());

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Moved: " + e.getX() + ", " + e.getY());

	}
		
}
*/