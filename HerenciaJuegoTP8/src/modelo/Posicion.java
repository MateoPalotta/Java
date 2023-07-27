package modelo;

public class Posicion {
    private double posX;
    private double posY;

    public Posicion(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setXY(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void incrementaPos(double valorX, double valorY) {
        this.posX += valorX;
        this.posY += valorY;
    }

    public double distancia(Posicion otraPosicion) {
        double distanciaX = Math.abs(posX - otraPosicion.getPosX());
        double distanciaY = Math.abs(posY - otraPosicion.getPosY());
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }
}
