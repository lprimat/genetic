package com.lprimat.genetic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EngineTest {
	
	@Test
	public void play_20_easy_turn() {
		Ship ship = new Ship(2500, 2700, 0, 0, 550, 0, 0);
		Physic physic = new Physic(ship);
		Game game = new Game(ship, physic);
		Engine engine = new Engine(game);
		
		engine.play(20);
		assertEquals(1958, Math.round(ship.posY), 0.01);
		assertEquals(-74, Math.round(ship.vSpeed), 0.01);
	}
}
