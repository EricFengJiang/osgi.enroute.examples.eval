package osgi.enroute.examples.eval.simple.provider;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import osgi.enroute.examples.eval.simple.provider.EvalImpl;

public class EvalImpl4Test{
	@Test
	public void simple () throws Exception{
		EvalImpl t = new EvalImpl();
		assertEquals(3.0, t.eval("1+2"),0);
	}
}
