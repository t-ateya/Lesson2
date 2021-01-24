package model;

import java.util.Random;

public class BaseBallGame {
	private int[]key = new int[3];
	private int[]guess = new int[3];
	private int ballCount = 0;
	private int strikeCount = 0;
	
	public BaseBallGame(){
		generateKey();
	}

	private void  generateKey(){
		Random r = new Random();
		key[0] = r.nextInt(10); //generate int 0-9 inclusive
		do {
			key[1] = r.nextInt(10);
		} while (key[1] == key[0]);
		do {
			key[2] = r.nextInt(10);
		}while (key[2] == key[1] || key[2] == key[0]);
	}

	public int[] getKey(){
		return key;
	}

	public int[] getGuess(){
		return guess;
	}

	public void setGuess(int pos, int value){
		assert 0 <=pos && pos <3 : "setGuess out of range in position";
		guess[pos] = value;
		
	}

	public int getBallCount(){
		return ballCount;
	}

	public int getStrikeCount(){
		return strikeCount;
	}

	

}
