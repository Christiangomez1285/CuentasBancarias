package pb2.cuentasbancarias;

public class CuentaCorriente extends CuentaSueldo {
	private Double saldo;
	private Double descubierto;
	private Double comision=0.05;
	
	public CuentaCorriente(Double saldo,Double descubierto) {
		super(saldo);
		this.descubierto=descubierto;
	}
	
	@Override
	public void extraer (Double d) {
		if(this.getSaldo()-d<0)
		{
			if(this.getSaldo()+descubierto-d>=0)
			{
				saldo=(this.getSaldo()-d)-(-comision*(this.getSaldo()-d));
				this.setSaldo(saldo);
			}
			else
				this.setSaldo(null);
			}
		else
		{
			   saldo=this.getSaldo()-d;
				this.setSaldo(saldo);
		}
		
	}
}
