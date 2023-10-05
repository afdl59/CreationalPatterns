/crea la clase monstruo

public class Monstruo extends Personaje {

    public Monstruo(int vida, int ataque, int defensa, String tipo) {
        super(vida, ataque, defensa, tipo);
    }

    @Override
    public String toString() {
        return "Monstruo{" + "vida=" + getVida() + ", ataque=" + getAtaque() + ", defensa=" + getDefensa() + ", tipo=" + getTipo() + '}';
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
        System.out.println("Soy un monstruo");
    }
}