package pb2.cuentasbancarias;

public class CuentaSueldo {
	
	
	private Double saldo;

	public CuentaSueldo () {
		
		
	}
	
	public CuentaSueldo(Double saldo) {
	this.saldo=saldo;
		
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void extraer(Double d)
	{
		if(this.getSaldo()-d>=0)
	    {saldo=this.getSaldo()-d;
		this.setSaldo(saldo);
	    }
		else
			this.setSaldo(null);
	}
	public void depositar(Double m)
	{
	    saldo=this.getSaldo()+m;
		this.setSaldo(saldo);
		
	}




}
