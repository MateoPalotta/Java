package Paquete2;

public class Prueba {
	 public static void main(String[] args) {
	        CuentaBancaria cuenta = new CuentaBancaria("Mateo");
	        System.out.println("Titular: " + cuenta.getTitular());
	        System.out.println("Saldo inicial: " + cuenta.getSaldo());

	        cuenta.depositar(5000);
	        cuenta.depositar(350);
	        System.out.println("Saldo despu�s de los dep�sitos: " + cuenta.getSaldo());
	        System.out.println("Cantidad de dep�sitos: " + cuenta.getCantidadDepositos());

	        boolean extraccionExitosa = cuenta.extraer(500);
	        System.out.println("Extracci�n exitosa: " + extraccionExitosa);
	        System.out.println("Saldo despu�s de la extracci�n: " + cuenta.getSaldo());
	        System.out.println("Cantidad de extracciones: " + cuenta.getCantidadExtracciones());

	        extraccionExitosa = cuenta.extraer(5000);
	        System.out.println("Extracci�n exitosa: " + extraccionExitosa);
	        System.out.println("Saldo despu�s del segundo intento de extracci�n: " + cuenta.getSaldo());

	        System.out.println(cuenta.toString());
	    }
}
