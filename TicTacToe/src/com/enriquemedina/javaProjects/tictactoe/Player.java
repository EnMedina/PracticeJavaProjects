package com.enriquemedina.javaProjects.tictactoe;

public class Player {
	private String name;
	private int score;
	
	public Player(String name, int initialScore ) {
		this.name = name;
		this.score = initialScore;
	}
	
	public Player(String name) {
		this(name,0);
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public int increaseScore(int val) {
		score += val;
		return score;
	}
	
	public int decreaseScore(int val) {
		score -=val;
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
