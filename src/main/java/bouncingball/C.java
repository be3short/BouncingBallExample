
package bouncingball;

import edu.ucsc.cross.jheq.core.model.FlowSet;
import edu.ucsc.cross.jheq.core.model.Variables;
import edu.ucsc.cross.jheq.core.object.NoInput;

/**
 * Flow set implementation
 */
public class C implements FlowSet<State, NoInput> {

	@Override
	public boolean evaluateC(State x, NoInput u, Variables vars) {

		boolean flow = x.yPosition > 0.0 || ((x.yPosition == 0.0) && (x.yVelocity >= 0));
		;
		return flow;
	}
}
