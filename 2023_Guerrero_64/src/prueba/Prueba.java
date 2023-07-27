package prueba;

import modelo.Guerrero;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guerrero g1;
		g1 = new Guerrero("Aragorn");


		g1.setX(10);
		g1.setY(-35);
		
		System.out.println(g1);
		g1.mueve(4, 32);
		g1.recibeDano(80);
		System.out.println(g1);
		g1.recibeDano(50);
		System.out.println(g1);
		
		Guerrero g2 = new Guerrero("Jon Snow",400,1500,5.6,-7.8);
		
		System.out.println(g2);
		
	}

}
