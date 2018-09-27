
package bouncingball;

import edu.ucsc.cross.jheq.core.model.JumpSet;
import edu.ucsc.cross.jheq.core.model.Variables;
import edu.ucsc.cross.jheq.core.object.NoInput;

/**
 * Jump set implementation
 */
public class D implements JumpSet<State, NoInput> {

	@Override
	public boolean evaluateD(State x, NoInput u, Variables vars) {

		boolean jump = x.yPosition <= 0.0 && x.yVelocity <= 0.0;
		;
		// add logic to determine if (x,u) is in D
		return jump;
	}

}
