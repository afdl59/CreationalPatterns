/Enemy factory usa factory method para crear enemigos de tipo orco, elfo o monstruo. Segun que tipo de enemigo se cree, se le asignaran unos atributos u otros.
/Un orco tiene 100 de vida, 10 de ataque y 5 de defensa.
/Un elfo tiene 80 de vida, 15 de ataque y 3 de defensa.
/Un monstruo tiene 120 de vida, 5 de ataque y 10 de defensa.

public class EnemyFactory {
    public static Personaje getPersonaje(String tipo){
        switch(tipo){
            case "orco":
                return new Orco(100, 10, 5, tipo);
            case "elfo":
                return new Elfo(80, 15, 3, tipo);
            case "monstruo":
                return new Monstruo(120, 5, 10, tipo);
            default:
                return null;
        }
    }
}