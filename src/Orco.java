// Crea la clase orco

public class Orco extends Personaje {

    public Orco(int vida, int ataque, int defensa, String tipo) {
        super(vida, ataque, defensa, tipo);
    }

    @Override
    public void presentacion() {
        System.out.println("Soy un orco");
    }

    @Override
    public void descripcion() {
        System.out.println("Orco{" + "vida=" + getVida() + ", ataque=" + getAtaque() + ", defensa=" + getDefensa() + '}');
    }
}