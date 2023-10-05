public class TestCreationalPatterns {

    public static void main(String[] args) {
        CharacterFactoryMethod inicioMundo = new CharacterFactory();
        //Generamos pesonajes cada uno de un tipo distinto.
        Personaje elfoJuan = inicioMundo.getPersonaje("elfo");
        Personaje monstruoPaco = inicioMundo.getPersonaje("monstruo");
        Personaje orcoMiguel = inicioMundo.getPersonaje("orco");
        //
        System.out.println("─── ⋆⋅☆⋅⋆ ── PERSONAJES ─── ⋆⋅☆⋅⋆ ──");
        elfoJuan.descripcion();
        monstruoPaco.descripcion();
        orcoMiguel.descripcion(); 
    }

}
