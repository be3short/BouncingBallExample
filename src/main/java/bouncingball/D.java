
package bouncingball;

import edu.ucsc.cross.jheq.model.HybridSystem;
import edu.ucsc.cross.jheq.model.JumpSet;

/**
 * Jump set implementation
 */
public class D implements JumpSet<State> {

	@Override
	public boolean evaluateD(State x, HybridSystem sys) {

		boolean jump = x.yPosition <= 0.0 && x.yVelocity <= 0.0;
		return jump;
	}

}
