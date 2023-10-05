/Crea la clase orco

public class Orco extends Personaje {

    public Orco(int vida, int ataque, int defensa, String tipo) {
        super(vida, ataque, defensa, tipo);
    }

    @Override
    public String toString() {
        return "Orco{" + "vida=" + getVida() + ", ataque=" + getAtaque() + ", defensa=" + getDefensa() + ", tipo=" + getTipo() + '}';
    }

    @Override
    public int getVida() {
        return super.getVida();
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }

    @Override
    public int getDefensa() {
        return super.getDefensa();
    }

    @Override
    public void presentacion() {
        System.out.println("Soy un orco");
    }
}