package Curso;

public class Matematica {
    private double PI = 3.1416F;

    public static void main(String args[]) {
        int radio = 5;
        Matematica m = new Matematica();
        System.out.println("El área del círculo con radio " + radio + " es: " + m.area(radio));
    }

    public double area(int radio) {
        return PI * radio * radio;
    }
}