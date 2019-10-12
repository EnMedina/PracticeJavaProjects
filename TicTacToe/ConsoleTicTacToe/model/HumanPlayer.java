package com.enriquemedina.javapracticeprograms.tictactoe.model;

import java.util.Scanner;

public class HumanPlayer implements Player {
	Scanner in ;
	
	HumanPlayer(Scanner in ){
		this.in = in;
	}
	
	@Override
	public int nextTurn(int[] arr) {
		System.out.println("What is your move?");
		boolean validMove = false;
		int move = 0;
		while( !validMove ) {
			String strMove = in.next();
			try {
				move = Integer.parseInt(strMove);
				if( arr[move] < 10 ) {
					validMove = true;
				}
			} catch( Exception e) {
				System.out.println("Invalid move, try again ");
			}
		}
		return move;
	}

}
