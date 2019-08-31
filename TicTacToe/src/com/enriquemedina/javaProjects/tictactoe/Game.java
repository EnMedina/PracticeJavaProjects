package com.enriquemedina.javaProjects.tictactoe;

import java.util.List;
import javafx.application.*;

abstract class Game {
	private Application graphics;
	private List<Player> players;
	
	
	
	public abstract void start();
	protected abstract void nextTurn();
	public abstract void finish();
	
	
}
