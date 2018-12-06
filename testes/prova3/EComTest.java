package prova3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EComTest {
	
	private ECom ecom;

	@Before
	public void exemploECom() {
		this.ecom = new ECom("Bar", "123", "Jose", 3);
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testECom() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCNPJ() {
		assertEquals("123", this.ecom.getCNPJ());
	}

	@Test
	public void testToString() {
		assertEquals("Bar * 123 * Jose * RESTAURANTE", this.ecom.toString());
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testAlteraTipo() {
		this.ecom.alteraTipo(1);
		assertEquals("Bar * 123 * Jose * QUIOSQUE", this.ecom.toString());
	}

	@Test
	public void testInformarValorArrecadado() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTaxa() {
		fail("Not yet implemented");
	}

	@Test
	public void testTotalArrecadado() {
		fail("Not yet implemented");
	}

}
