package Paquete2;

public class Prueba {
	 public static void main(String[] args) {
	        CuentaBancaria cuenta = new CuentaBancaria("Mateo");
	        System.out.println("Titular: " + cuenta.getTitular());
	        System.out.println("Saldo inicial: " + cuenta.getSaldo());

	        cuenta.depositar(5000);
	        cuenta.depositar(350);
	        System.out.println("Saldo después de los depósitos: " + cuenta.getSaldo());
	        System.out.println("Cantidad de depósitos: " + cuenta.getCantidadDepositos());

	        boolean extraccionExitosa = cuenta.extraer(500);
	        System.out.println("Extracción exitosa: " + extraccionExitosa);
	        System.out.println("Saldo después de la extracción: " + cuenta.getSaldo());
	        System.out.println("Cantidad de extracciones: " + cuenta.getCantidadExtracciones());

	        extraccionExitosa = cuenta.extraer(5000);
	        System.out.println("Extracción exitosa: " + extraccionExitosa);
	        System.out.println("Saldo después del segundo intento de extracción: " + cuenta.getSaldo());

	        System.out.println(cuenta.toString());
	    }
}
