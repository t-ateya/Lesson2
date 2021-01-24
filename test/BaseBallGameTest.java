package test;

import model.BaseBallGame;

public class BaseBallGameTest {

	public static  void main(String []args){

		final int Max = 500;

		for (int i = 0; i < Max; i++){
			BaseBallGame b = new BaseBallGame();
			assert checkKey(b.getKey());

		}

		
	}
	
	public static boolean checkKey(int[] key){

		if (key[0] == key[1] || key[0] == key[2] || key[1] == key[2]){
			return false;
		}else {
			return true;
		}
	}
	
	
}
