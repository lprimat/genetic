package com.lprimat.genetic;

public class Ship {
	
	public double posX;
	public double posY;
	public double hSpeed;
	public double vSpeed;
	public int fuel;
	public double angle;
	public int thrust;
	
	public Ship(double posX, double posY, double hSpeed, double vSpeed,
			int fuel, double angle, int power) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.hSpeed = hSpeed;
		this.vSpeed = vSpeed;
		this.fuel = fuel;
		this.angle = angle;
		this.thrust = power;
	}
	
	
}
