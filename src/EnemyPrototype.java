
/Una clase prototipo que clone a los enemigos creados por el factory method.

public abstract class EnemyPrototype implements Cloneable{
    private int vida;
    private int ataque;
    private int defensa;
    private String tipo;

    public EnemyPrototype(int vida, int ataque, int defensa, String tipo) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract void presentacion();

    public abstract void toString();
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}