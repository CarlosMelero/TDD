import static org.junit.Assert.*;

import org.junit.Test;


public class TestTDD {
private TDD tdd;
	
	@Before
	public void setUp(){
		tdd = new TDD();
	}
	@Test
	public void addClaveReturnsValue(){
		tdd.put("Nombre", "Luis");
		assertEquals("Luis" , tdd.get("Nombre"));
	}

}
