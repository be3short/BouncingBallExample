
package bouncingball;

import edu.ucsc.cross.jheq.model.HybridSystem;
import edu.ucsc.cross.jheq.model.JumpMap;

/**
 * Jump map implementation
 */
public class G implements JumpMap<State> {

	@Override
	public void evaluateG(State x, State x_plus, HybridSystem sys) {

		// get parameters
		Parameters parameters = sys.variables().get(Parameters.class);
		x_plus.yPosition = 0.0;
		x_plus.yVelocity = -x.yVelocity * parameters.restitutionCoefficient;
	}
}
