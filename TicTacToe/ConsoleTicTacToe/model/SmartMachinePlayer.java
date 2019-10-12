package com.enriquemedina.javapracticeprograms.tictactoe.model;

public class SmartMachinePlayer implements Player {

	@Override
	public int nextTurn(int[] arr) {
		boolean isValidMove = false;
		int move = 0;
		while( !isValidMove ) {
			move = (int)(Math.random()*9);
			if( arr[move] < 10) {
				isValidMove = true;
			}
		}
		return move;
	}

}
