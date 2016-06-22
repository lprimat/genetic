package com.lprimat.genetic;

public class Engine {

	private Game game;
	private Physic physic;
	
	public Engine(Physic physic, Game game) {
		this.game = game;
		this.physic = physic;
	}

	public void play(int i) {
		for (; i != 0; i--) {
			physic.computePhysics(game);
		}
	}	
}
