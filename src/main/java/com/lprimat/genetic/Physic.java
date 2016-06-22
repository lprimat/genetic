package com.lprimat.genetic;

public class Physic {

	public static double GRAVITY = 3.711;
	private Ship ship;
	private Game game;
	
	public Physic () {
	}
	
	public void computePhysics(Game game) {
		this.game = game;
		this.ship = game.ship;
		
		computePositions();
		computeSpeeds();
		computeInputs();
	}
	
	private void computeInputs() {
		
	}

	private void computeSpeeds() {
		double angle = Math.toRadians(ship.angle);
		
		ship.hSpeed = ship.hSpeed - 1.0 * Math.sin(angle) * ship.thrust;
		ship.vSpeed = ship.vSpeed + 1.0 * (Math.cos(angle) * ship.thrust - GRAVITY);
	}
	
	private void computePositions() {
		double angle = Math.toRadians(ship.angle);
		
		ship.posX = ship.posX + ship.hSpeed - 0.5 * Math.sin(angle) * ship.thrust;
		ship.posY = ship.posY + ship.vSpeed  + 0.5 * (Math.cos(angle)* ship.thrust - GRAVITY);
	}
}
