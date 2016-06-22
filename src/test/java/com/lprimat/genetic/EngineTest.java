package com.lprimat.genetic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EngineTest {
	
	private Game game;
	private Ship ship;
	private Physic physic;
	private Engine engine;

	@Before
	public void init() {
		ship = new Ship(2500, 2700, 0, 0, 550, 0, 0);
		physic = new Physic();
		game = new Game(ship);
		engine = new Engine(physic, game);
	}

	@Test
	public void play_20_easy_turn() {
		engine.play(20);
		
		assertEquals(1958, Math.round(ship.posY), 0.01);
		assertEquals(-74, Math.round(ship.vSpeed), 0.01);
	}
	
	@Test
	public void play_30_turn_with_low_angle_and_power() {
		ship.angle = 15;
		ship.thrust = 1;
		engine.play(30);
	
		assertEquals(2384, Math.round(ship.posX), 0.01);
		assertEquals(1465, Math.round(ship.posY), 0.01);
		assertEquals(-8, Math.round(ship.hSpeed), 0.01);
		assertEquals(-82, Math.round(ship.vSpeed), 0.01);
	}
	
	@Test
	public void play_30_turn_with_high_angle_and_power() {
		engine.play(30, 90, 4);
		
		assertEquals(965, Math.round(ship.posX), 0.01);
		assertEquals(1246, Math.round(ship.posY), 0.01);
		assertEquals(-111, Math.round(ship.hSpeed), 0.01);
		assertEquals(-103, Math.round(ship.vSpeed), 0.01);
		assertEquals(436, ship.fuel);
	}
	
	@Test
	public void play_35_turn_with_high_angle_and_power() {
		engine.play(35, -80, 3);
		
		assertEquals(4111, Math.round(ship.posX), 0.01);
		assertEquals(893, Math.round(ship.posY), 0.01);
		assertEquals(98, Math.round(ship.hSpeed), 0.01);
		assertEquals(-107, Math.round(ship.vSpeed), 0.01);
		assertEquals(448, ship.fuel);
	}
	
	
	
	
}
