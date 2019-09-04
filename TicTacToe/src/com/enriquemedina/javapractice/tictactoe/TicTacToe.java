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
		btn.setText("Say 'Hello World'");
		btn.setOnAction( event -> System.out.println("Hello world"));
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root,300,250));
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
		System.out.println("Initial launch is done");
	}

}