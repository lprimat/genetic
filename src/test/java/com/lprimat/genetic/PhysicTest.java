package com.lprimat.genetic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PhysicTest {
	
	private Ship ship;
	private Physic physic;
	
	@Before
	public void init() {
		ship = new Ship(0, 2700, 0, 0, 550, 0, 0);
		physic = new Physic(ship);
	}
	
	@Test
	public void compute_simple_gravity() {
		physic.computePhysics();
		
		assertEquals(2698, Math.round(ship.posY), 0.01);
		assertEquals(-4, Math.round(ship.vSpeed), 0.01);
	}
	
	@Test
	public void compute_simple_leff_thrust() {
		ship.angle = -90;
		ship.power = 1;
		physic.computePhysics();
		
		assertEquals(0.5, ship.posX, 0.0001);
		assertEquals(1, ship.hSpeed, 0.0001);
	}
	
	
}
