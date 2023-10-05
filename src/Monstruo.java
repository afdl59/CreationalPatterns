//crea la clase monstruo

public class Monstruo extends Personaje {

    public Monstruo(int vida, int ataque, int defensa, String tipo) {
        super(vida, ataque, defensa, tipo);
    }

    @Override
    public void presentacion() {
        System.out.println("Soy un monstruo");
    }

    @Override
    public void descripcion() {
        System.out.println("Monstruo{" + "vida=" + getVida() + ", ataque=" + getAtaque() + ", defensa=" + getDefensa() + '}');
    }
}