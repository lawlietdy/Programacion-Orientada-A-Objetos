

public class MainBeisbol {
    public static void main(String[] args) {
        // crear un jugador
        Beisbol angel = new Beisbol(10, "Teodoro del Angel", "bateador");

        // Agregar ponche
        angel.addPonches();

        // Agregar hit
        angel.addHits();

        // agregar errores
        angel.addError();

        // Mostrar información
        System.out.println(angel.toString());
    }
}
