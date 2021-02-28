package test;

import model.BaseballGame;

public class BaseBallGameTest {

	public static  void main(String []args){

		final int Max = 500;

		for (int i = 0; i < Max; i++){
			BaseballGame b = new BaseballGame();
			assert checkKey(b.getKey());

		}

		BaseballGame b1 = new BaseballGame(0, 1, 2);
		b1.setGuess(0, 1);
		b1.setGuess(1, 5);
		b1.setGuess(2, 9);
		b1.computeBallsStrikes();

		b1 = new BaseballGame(0, 1, 2);
		b1.setGuess(0, 1);
		b1.setGuess(1, 0);
		b1.setGuess(2, 2);
		b1.computeBallsStrikes();

		b1 = new BaseballGame(0, 1, 2);
		b1.setGuess(0, 5);
		b1.setGuess(1, 6);
		b1.setGuess(2, 9);
		b1.computeBallsStrikes();

		b1 = new BaseballGame(1, 2, 3);
		b1.setGuess(0, 1);
		b1.setGuess(1, 2);
		b1.setGuess(2, 3);
		b1.computeBallsStrikes();

		assert b1.getBallCount() == 0;
		assert b1.getStrikeCount() == 3;
		
		ballStrikeCountCheck(1, 2, 3, 1, 6, 5, 0, 1);
		ballStrikeCountCheck(2, 1, 3, 6, 1, 5, 0, 1);
		ballStrikeCountCheck(1, 2, 3, 8, 6, 3, 0, 1);
		ballStrikeCountCheck(1, 2, 3, 8, 1, 0, 1, 0);
		ballStrikeCountCheck(1, 2, 3, 2, 0, 8, 1, 0);
		ballStrikeCountCheck(1, 2, 3, 3, 0, 8, 1, 0);
		ballStrikeCountCheck(1, 2, 3, 3, 1, 8, 2, 0);
		ballStrikeCountCheck(1, 2, 3, 1, 2, 3, 0, 3);
	}
	
	private static boolean checkKey(int[] key){

		if (key[0] == key[1] || key[0] == key[2] || key[1] == key[2]){
			return false;
		}else {
			return true;
		}
	}

	private static boolean ballStrikeCountCheck(int k0, int k1, int k2, int g0, int g1, int g2, int balls, int strikes){
		BaseballGame b = new BaseballGame();
		b.setGuess(0, g0);
		b.setGuess(1, g1);
		b.setGuess(2, g2);
		b.computeBallsStrikes();


		if (b.getBallCount() == balls  && b.getStrikeCount() == strikes){
			return true;
		}else {
			String keys = " " +  k0 + k1 + k2;
			String guesses = " " + g0 + g1 + g2;
			System.out.println(" Key: " + keys + " Guess: " + guesses + " Incorrect Count");
			System.out.println(" Balls: " + b.getBallCount() + " Strikes: " + b.getStrikeCount());
			return false;
		}

	}


	
	
}
