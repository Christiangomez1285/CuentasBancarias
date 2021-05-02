package pb2.cuentasbancarias;

public class CajaAhorro extends CuentaSueldo {
	private Double saldo;
	private Double recargo=6.0;
	private Integer extracciones;
	
	public CajaAhorro(Double saldo,Integer extracciones) {
		
		super(saldo);
		this.extracciones=extracciones;
		
	}
	
	@Override
	public void extraer (Double d) {
		if(this.getSaldo()-d>=0)
		{
			if(extracciones>=6) {
				saldo=super.getSaldo()-d-recargo;
				this.setSaldo(saldo);
			}
			else
			{
				saldo=this.getSaldo()-d;
				this.setSaldo(saldo);
			}
		}
		else
			this.setSaldo(null);
	}

}
