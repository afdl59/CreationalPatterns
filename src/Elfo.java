//Crea la clase elfo

public class Elfo extends Personaje {

    public Elfo(int vida, int ataque, int defensa, String tipo) {
        super(vida, ataque, defensa, tipo);
    }

    @Override
    public void presentacion() {
        System.out.println("Soy un elfo");
    }

    @Override
    public void descripcion() {
        System.out.println("Elfo{" + "vida=" + getVida() + ", ataque=" + getAtaque() + ", defensa=" + getDefensa() + '}');
    }
}