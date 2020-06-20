
package bouncingball;

import edu.ucsc.cross.jheq.model.FlowSet;
import edu.ucsc.cross.jheq.model.HybridSystem;

/**
 * Flow set implementation
 */
public class C implements FlowSet<State> {

	@Override
	public boolean evaluateC(State x, HybridSystem sys) {

		boolean flow = x.yPosition >= 0.0;
		return flow;
	}
}
