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
	}

	private void computeSpeeds() {
		double angle = Math.toRadians(ship.angle);
		
		ship.hSpeed = ship.hSpeed - 1.0 * Math.sin(angle) * ship.power;
		ship.vSpeed = ship.vSpeed + 1.0 * (Math.cos(angle) * ship.power - GRAVITY);
	}
	
	private void computePositions() {
		double angle = Math.toRadians(ship.angle);
		
		ship.posX = ship.posX + ship.hSpeed - 0.5 * Math.sin(angle) * ship.power;
		ship.posY = ship.posY + ship.vSpeed  + 0.5 * (Math.cos(angle)* ship.power - GRAVITY);
	}
}
