package pb2.cuentasbancarias;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CuentaSueldoTest {
	

	
	@Test
	public void queExistaLaCuentaSueldo() {
		Double saldo = 2000.0;
		CuentaSueldo cuentasueldo = new CuentaSueldo(saldo);
		assertNotNull(cuentasueldo);
	}
	
	@Test
	public void queExistaLaCajadeAhorros() {
		Double saldo = 2000.0;
		Integer extracciones=20;
		CajaAhorro cajaahorro = new CajaAhorro(saldo,extracciones);
		assertNotNull(cajaahorro);
	}
	

	
	@Test
	public void queLaExtraccionSePuedaRealizar() {
		Double saldo = 2000.0;
		CuentaSueldo cuentasueldo = new CuentaSueldo(saldo);
		cuentasueldo.extraer(1000.0);
		assertTrue(cuentasueldo.getSaldo()>=0);	
	}
	
	@Test
	public void queSeCobreExtraccionDespuesdela5ta() {
		Double saldo = 2000.0;
		Integer extracciones=6;
		CajaAhorro cajaahorro = new CajaAhorro(saldo,extracciones);
		cajaahorro.extraer(500.0);
		assertEquals(1494.0,cajaahorro.getSaldo(),0.01);
		
	}
	
	@Test
	public void queSeCobreComisionPorGirarEnDescubierto() {
		Double saldo=3000.0;
		Double descubierto=200.0;
		CuentaCorriente cuentacorriente = new CuentaCorriente(saldo,descubierto);
		cuentacorriente.extraer(2000.0);
		assertEquals(1000.0,cuentacorriente.getSaldo(),0.01);
		
	}
	

}
