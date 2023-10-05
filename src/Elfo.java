/Crea la clase elfo

public class Elfo extends Personaje {

    public Elfo(int vida, int ataque, int defensa, String tipo) {
        super(vida, ataque, defensa, tipo);
    }

    @Override
    public String toString() {
        return "Elfo{" + "vida=" + getVida() + ", ataque=" + getAtaque() + ", defensa=" + getDefensa() + ", tipo=" + getTipo() + '}';
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
        System.out.println("Soy un elfo");
    }
}