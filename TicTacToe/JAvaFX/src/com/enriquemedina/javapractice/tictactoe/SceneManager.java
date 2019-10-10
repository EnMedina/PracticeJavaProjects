package com.enriquemedina.javapractice.tictactoe;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SceneManager {
	
	public static Scene getGameScene() {
		
		VBox root = new VBox();
		Image image = new Image("file:res\\grid.png");
		ImageView image1 = new ImageView();
		image1.setImage(image);
		root.getChildren().add(image1);
		return new Scene(root, 300, 300);
	}
	
	public static Scene getStartScene() {
		
		VBox root = new VBox();
		Button button1 = new Button();
		
		button1.setText("Button Text");
		root.getChildren().add(button1);
		return new Scene(root, 300, 300);
	}
}
