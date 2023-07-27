package modelo;

public class CajaDeAhorro extends CuentaBancaria {
	
    private int extraccionesRealizadas;
    private int maxExtraccionesMensuales;

    public CajaDeAhorro(String titular, int maxExtraccionesMensuales) {
        super(titular);
        this.extraccionesRealizadas = 0;
        this.maxExtraccionesMensuales = maxExtraccionesMensuales;
    }

    @Override
	public boolean extraer(double cantidad) {
	boolean resultado = false;
    if (extraccionesRealizadas >= maxExtraccionesMensuales || cantidad > saldo) {
        resultado = false;
    }
    saldo -= cantidad;
    extraccionesRealizadas++;
    resultado = true;
    return resultado;
    }

}
