
package bouncingball;

import edu.ucsc.cross.jheq.model.HybridSystem;
import edu.ucsc.cross.jheq.object.MappedObject;

public class Output implements MappedObject {

	public boolean event;

	public Output() {

		event = false;
	}

	@Override
	public void evaluate(HybridSystem sys) {

		if (sys.model().D()) {
			event = true;
		} else {
			event = false;
		}
	}

}
