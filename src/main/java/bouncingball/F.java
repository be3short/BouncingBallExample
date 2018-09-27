
package bouncingball;

import edu.ucsc.cross.jheq.core.model.FlowMap;
import edu.ucsc.cross.jheq.core.model.Variables;
import edu.ucsc.cross.jheq.core.object.NoInput;

/**
 * Flow map implementation
 */
public class F implements FlowMap<State, NoInput> {

	@Override
	public void evaluateF(State x, State x_dot, NoInput u, Variables vars) {

		// get parameters
		Parameters parameters = vars.get(Parameters.class);
		x_dot.yPosition = x.yVelocity;
		x_dot.yVelocity = -parameters.gravityConstant;

	}
}