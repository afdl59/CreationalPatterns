public class TestCreationalPatterns {

    public static void main(String[] args) throws Exception {
 
        // Aplicamos el patron de factory method para seleccionar un personaje segun su tipo.
        CharacterFactoryMethod inicioMundo = new CharacterFactory();
        // Creamos cada uno de los siguientes tipos de personajes:
        Personaje elfoJuan = inicioMundo.getPersonaje("elfo");
        Personaje monstruoPaco = inicioMundo.getPersonaje("monstruo");
        Personaje orcoMiguel = inicioMundo.getPersonaje("orco");
        
        System.out.println("─── ⋆⋅☆⋅⋆ ─── PERSONAJES ─── ⋆⋅☆⋅⋆ ──");

        elfoJuan.descripcion();
        monstruoPaco.descripcion();
        orcoMiguel.descripcion(); 

        // Aplicamos el patron de prototipo de personajes para clonar personajes de la colección que creamos para el nivel 1.
        System.out.println("\n─── ⋆⋅☆⋅⋆ ─── CLONES ─── ⋆⋅☆⋅⋆ ──");
        CharacterPrototype clonPrototipo = new CharacterPrototype();

        // Creamos clones de los personajes que tenemos en la colección. 
        Personaje clon = (Personaje) clonPrototipo.prototipo("Lv1-Elfo");
        Personaje clon2 = (Personaje) clonPrototipo.prototipo("Lv1-Elfo");

        System.out.println(clon.toString() + " Vida: " + clon.getVida() + " Ataque: " + clon.getAtaque() + " Defensa: " + clon.getDefensa());
        System.out.println(clon2.toString() + " Vida: " + clon2.getVida() + " Ataque: " + clon2.getAtaque() + " Defensa: " + clon2.getDefensa());

        clon = (Personaje) clonPrototipo.prototipo("Lv1-Orco");
        clon2 = (Personaje) clonPrototipo.prototipo("Lv1-Orco");

        System.out.println(clon.toString() + " Vida: " + clon.getVida() + " Ataque: " + clon.getAtaque() + " Defensa: " + clon.getDefensa());
        System.out.println(clon2.toString() + " Vida: " + clon2.getVida() + " Ataque: " + clon2.getAtaque() + " Defensa: " + clon2.getDefensa());

        clon = (Personaje) clonPrototipo.prototipo("Lv1-Monstruo");
        clon2 = (Personaje) clonPrototipo.prototipo("Lv1-Monstruo");
        System.out.println(clon.toString() + " Vida: " + clon.getVida() + " Ataque: " + clon.getAtaque() + " Defensa: " + clon.getDefensa());
        System.out.println(clon2.toString() + " Vida: " + clon2.getVida() + " Ataque: " + clon2.getAtaque() + " Defensa: " + clon2.getDefensa());

    }
}
