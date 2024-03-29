package com.enriquemedina.javapracticeprograms.tictactoe;

import java.util.Scanner;

public class Game {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Initializing tic, tac, toe");
		
		
		int menuOption = 0;
		printMainMenu();
		menuOption = getMenuOption();
		if( menuOption != 4) {
			TicTacToe game = new TicTacToe(menuOption);	
			game.startGame();
			while( !game.isOver() ) {
				game.nextTurn();
			}
		
		}
		
		
		System.out.println("Thank you for playing!");

	}
	
	public static void printMainMenu() {
		System.out.println(" Who do you want to play against ? ");
		System.out.println("1.- Another Human");
		System.out.println("2.- Random Computer");
		System.out.println("3.- Hardcore Computer");
		System.out.println("4.- Exit game");	
	}
	
	public static int getMenuOption() {
		String option = scanner.next();
		boolean validOption = false;
		int menuOption = 0;
		while( !validOption ) {
			try {
				menuOption = Integer.parseInt(option);
				if( menuOption > 0 && menuOption <= 4) {
					validOption = true;
				}
			}catch(Exception e){
				System.out.println("Not a valid option, provide another one");
				option = scanner.next();
			}
		}
		return menuOption;
	}	
}
