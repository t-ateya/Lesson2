package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controller.BaseballKeyListener;
import model.BaseballGame;

import java.awt.GridLayout;



public class BaseballGamePanel {

	public enum GameState {
		READY, PLAYING, GAMEOVER
	}
	private JFrame window;
	private BaseballCanvas canvas;
	private JTextField gameKeyField = new JTextField();
	private JTextField guessField = new JTextField();
	private JButton[] digitButtons;
	private JButton playButton = new JButton("Play Ball~~");
	private JButton exitButton = new JButton("Exit");
	private GameState gameState = GameState.PLAYING;

	private BaseballGame baseball; 

	public BaseballGamePanel(JFrame window){
		this.window = window;
	}



	public void init(){
		Container cp = window.getContentPane();

		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(2, 2));
		northPanel.add(new JLabel("Secret Game Key: "));
		northPanel.add(gameKeyField);
		northPanel.add(new JLabel("Your Guess: "));
		northPanel.add(guessField);
		gameKeyField.setEditable(false); //Read-Only mode
		guessField.setEditable(false);

		cp.add(BorderLayout.NORTH, northPanel);

		canvas = new  BaseballCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(4,3));

		BaseballKeyListener keyListener = new BaseballKeyListener(this);

		digitButtons = new JButton[10];
		for (int i = 0; i<10; i++){
			digitButtons[i] = new JButton("" + i);
			southPanel.add(digitButtons[i]);
			digitButtons[i].addActionListener(keyListener);
		}
		playButton.addActionListener(keyListener);
		exitButton.addActionListener(keyListener);
	
		southPanel.add(playButton);
		southPanel.add(exitButton);
		cp.add(BorderLayout.SOUTH, southPanel);

		for (var b: digitButtons){
			//b.setEnabled(false);
		}
	}

	public BaseballGame getBaseballGame(){
		return baseball;
	}

	public JButton getPlayButton(){
		return playButton;
	}

	public JButton getExitButton(){
		return exitButton;
	}
	
	public JButton[] getDigButtons(){
		return digitButtons;
	}

	public JTextField getGameKeyField(){
		return gameKeyField;
	}

	public JTextField getGuessField(){
		return guessField;
	}

	public BaseballCanvas getCanvas(){
		return canvas;
	}

	public JFrame getWindow(){
		return window;
	}

	public GameState getGameState(){
		return gameState;
	}

	public void setGameState(GameState state){
		this.gameState = state;
	}

}
