
// Una clase prototipo que clone a los enemigos creados por el factory method.
import java.util.HashMap;

public class CharacterPrototype {

    // Guardamos en el mapa la colección de personajes.
    private HashMap<String, Personaje> coleccionLv1 = new HashMap<>();
    
    public CharacterPrototype() {

        // Aplicamos el patron de factory para crear las intancias de los personajes genericos.
        CharacterFactoryMethod nivel1Mundo = new CharacterFactory();

        // Generamos pesonajes cada uno de un tipo distinto.
        Personaje elfoLv1 = nivel1Mundo.getPersonaje("elfo");
        Personaje monstruoLv1 = nivel1Mundo.getPersonaje("monstruo");
        Personaje orcoLv1 = nivel1Mundo.getPersonaje("orco");

        coleccionLv1.put("Lv1-Elfo", elfoLv1);
        coleccionLv1.put("Lv1-Monstruo", monstruoLv1);
        coleccionLv1.put("Lv1-Orco", orcoLv1);
    }
    
    public Object prototipo(String level) throws CloneNotSupportedException {
        return coleccionLv1.get(level).clone();
    }

}
