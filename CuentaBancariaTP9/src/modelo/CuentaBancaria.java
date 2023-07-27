package modelo;

public abstract class CuentaBancaria {
protected String titular;
protected double saldo;



public CuentaBancaria(String titular) {
	super();
	this.titular = titular;
}
public String getTitular() {
	return titular;
}
public double getSaldo() {
	return saldo;
}

@Override
public String toString() {
	return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
}

public void depositar(double cantidad) {
	this.saldo += cantidad;
}
public abstract boolean extraer(double cantidad);

}
