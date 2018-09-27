
package bouncingball;

import edu.ucsc.cross.jheq.core.model.JumpMap;
import edu.ucsc.cross.jheq.core.model.Variables;
import edu.ucsc.cross.jheq.core.object.NoInput;

/**
 * Jump map implementation
 */
public class G implements JumpMap<State, NoInput> {

	@Override
	public void evaluateG(State x, State x_plus, NoInput u, Variables vars) {

		// get parameters
		Parameters parameters = vars.get(Parameters.class);
		x_plus.yPosition = 0.0;
		x_plus.yVelocity = -x.yVelocity * parameters.restitutionCoefficient;
	}
}
