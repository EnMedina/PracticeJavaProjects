package com.enriquemedina.javapractice.tictactoe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TicTacToe extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello world");
		Button btn = new Button();
		btn.setText("Play Game");
		btn.setOnAction( event -> startGame(primaryStage)); 
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root,300,250));
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
