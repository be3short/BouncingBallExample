
package bouncingball;

import edu.ucsc.cross.jheq.object.DataStructure;

/**
 * Parameter data structure implementation that will be included in the
 * additional variables parameter
 */
public class Parameters extends DataStructure {

	/**
	 * Coefficient of restitution
	 */
	public double restitutionCoefficient;

	/**
	 * Gravity constant
	 */
	public double gravityConstant;

	/**
	 * Construct the parameters of the bouncing ball environment
	 * 
	 * @param restitution_coefficient determines energy absorbed at each bounce
	 * @param gravity_constant        defines acceleration due to gravity
	 */
	public Parameters(double restitution_coefficient, double gravity_constant) {

		restitutionCoefficient = restitution_coefficient;
		gravityConstant = gravity_constant;
	}

	public Parameters() {

		restitutionCoefficient = 0.0;
		gravityConstant = 0.0;
	}
}
