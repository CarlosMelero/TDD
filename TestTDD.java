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
	@Test
	public void addClaveDosValoresModificaValor(){
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));
		tdd.put("Nombre", "Pedro");
		assertEquals("Pedro", tdd.get("Nombre"));
	}
	
	@Test(expected = NoExisteClaveAsociada.class)
	public void addClaveDevuelveExcepcion(){
		tdd.put("Nombre", "Juan");
		tdd.get("Apellido");
	}

	@Test
	public void addClaveDevuelveValorSiNoExisteDevuelveValorPorDefecto(){
		tdd.put("Nombre", "Juan");
		assertEquals("Juan", tdd.getOrElse("Nombre", "0"));
		assertEquals("0", tdd.getOrElse("Apellido", "0"));
		
	}
	@Test
	public void devuelveTrueSiExisteClave(){
		tdd.put("Nombre", "Juan");
		assertEquals(true, tdd.containsKey("Nombre"));
	
	@Test
	public void devuelveFalseSiNoExisteClave(){
		tdd.put("Nombre", "Antonio");
		assertEquals(false, tdd.containsKey("Apellidos"));	

	}

	@Test
	public void devuelveCeroSiLaTablaEstaVacia(){
		assertEquals(0, tdd.size());
		
	}
	
	@Test
	public void devuelveUnoSiHayUnElemento(){
		tdd.put("Apellidos", "Rondón");
		assertEquals(1, tdd.size());
		
	}
	@Test
	public void devuelveDosSiHayDosElementos(){
		tdd.put("Nombre", "Carlos");
		tdd.put("Apellido", "Melero");
		assertEquals(2, tdd.size());
	}	
	
	@Test
	public void devuelveTrueSiBorraClave(){
		tdd.put("Nombre", "Carlos");
		assertEquals(true, tdd.remove("Nombre"));	
	
	@Test
	public void devuelveFalseSiNoPuedeBorrarClave(){
		tdd.put("Apellidos", "Melero");
		assertEquals(false, tdd.remove("Nombre"));
	}
	@Test
	public void devuelveCeroSiLaTablaEstaVacia(){
		assertEquals(0, tdd.size());
		
	}
	
}

