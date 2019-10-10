package com.enriquemedina.javapractice.tictactoe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("TicTacToe");
		primaryStage.setScene(SceneManager.getStartScene());
		primaryStage.getScene().
		primaryStage.show();
	}
	
	private void startGame(Stage primaryStage) {
		primaryStage.setTitle("Tic Tac Toe");
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
		System.out.println("Initial launch is done");
	}

}
