
package bouncingball;

import edu.ucsc.cross.jheq.core.object.DataStructure;

/**
 * state data structure implementation
 */
public class State extends DataStructure {

	/**
	 * vertical position
	 */
	public double yPosition;

	/**
	 * vertical velocity
	 */
	public double yVelocity;

	/**
	 * Construct the state with the given initial conditions
	 * 
	 * @param y_position
	 *            initial y position
	 * @param y_velocity
	 *            initial y velocity
	 */
	public State(double y_position, double y_velocity) {

		yPosition = y_position;
		yVelocity = y_velocity;
	}

	/**
	 * Construct the state with the given initial conditions
	 * 
	 * @param y_position
	 *            initial y position
	 * @param y_velocity
	 *            initial y velocity
	 */
	public State() {

		yPosition = 0.0;
		yVelocity = 0.0;
	}
}
