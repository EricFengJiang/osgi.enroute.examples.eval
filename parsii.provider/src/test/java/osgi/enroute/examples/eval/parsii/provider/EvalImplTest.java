package osgi.enroute.examples.eval.parsii.provider;

import junit.framework.TestCase;
import osgi.enroute.examples.eval.parsii.provider.EvalImpl;

public class EvalImplTest extends TestCase{
	public void testSimple () throws Exception{
		EvalImpl t = new EvalImpl();
		assertEquals(3.0, t.eval("1+2"));
	}
}
