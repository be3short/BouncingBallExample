
package bouncingball;

import edu.ucsc.cross.jheq.model.FlowMap;
import edu.ucsc.cross.jheq.model.HybridSystem;

/**
 * Flow map implementation
 */
public class F implements FlowMap<State> {

	@Override
	public void evaluateF(State x, State x_dot, HybridSystem sys) {

		Parameters parameters = sys.variables().get(Parameters.class);
		x_dot.yPosition = x.yVelocity;
		x_dot.yVelocity = -parameters.gravityConstant;// parameters.gravityConstant;

	}
}