package com.lprimat.genetic;

public class Engine {

	private Game game;
	private Physic physic;
	private int realAngle;
	private int realThrust;

	public Engine(Physic physic, Game game) {
		this.game = game;
		this.physic = physic;
		realAngle = 0;
		realThrust = 0;
	}

	public void play(int i) {
		for (; i != 0; i--) {
			physic.computePhysics(game);
		}
	}

	public void play(int i, double angle, int thrust) {
		for (; i != 0; i--) {
			incrementAngle(angle);
			incrementThrust(thrust);
			consumeFuel();
			physic.computePhysics(game);
		}
	}

	private void consumeFuel() {
		game.ship.fuel -= realThrust;
	}

	public void play(int[] angles, int[] thrusts) {
		int i = angles.length;
		for (; i != 0; i--) {
			computeInputs(angles[i], thrusts[i]);
			physic.computePhysics(game);
		}
	}

	private void computeInputs(int i, int j) {

	}

	private void incrementAngle(double angle) {
		realAngle += Math.abs(angle) > Math.abs(realAngle) + 15 ? (angle >= 0 ? 15 : -15) : angle - realAngle;
		game.ship.angle = realAngle;
	}

	private void incrementThrust(int thrust) {
		realThrust += thrust > realThrust + 1 ? 1 : thrust - realThrust;
		game.ship.thrust = realThrust;
	}
}
