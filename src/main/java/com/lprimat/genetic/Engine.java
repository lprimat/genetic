package com.lprimat.genetic;

public class Engine {

	private Game game;
	
	public Engine(Game game) {
		this.game = game;
	}

	public void play(int i) {
		for (; i != 0; i--) {
			game.physic.computePhysics();
		}
	}	
}
