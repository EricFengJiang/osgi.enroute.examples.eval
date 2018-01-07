package osgi.enroute.examples.eval.parsii.provider;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import osgi.enroute.examples.eval.parsii.provider.EvalImpl;

public class EvalImpl4Test{
	@Test
	public void simple () throws Exception{
		EvalImpl t = new EvalImpl();
		assertEquals(4.0, t.eval("1+3"),0);
	}
}
