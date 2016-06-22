package com.lprimat.genetic;

public class Physic {

	public static double GRAVITY = 3.711;
	private Ship ship;
	
	public Physic (Ship ship) {
		this.ship = ship;
	}
	
	public void computePhysics() {
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
	
//	x = x+vx-0.5*sin(angle*M_PI/180.)*thrust;
//    y = y+vy+0.5*(cos(angle*M_PI/180.)*thrust-G);
//    vx = vx-1.*sin(angle*M_PI/180.)*thrust;
//    vy = vy+1.*(cos(angle*M_PI/180.)*thrust-G);
}
