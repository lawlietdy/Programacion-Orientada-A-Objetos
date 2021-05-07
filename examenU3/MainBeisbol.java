/**
 * Un equipo de beisbol se compone de tres tipos de jugadores: pitchers, 
 * jugadores de posición y bateadores designados. Los datos de cada jugador 
 * son: el número de uniforme, nombre y su posición. En esta liga, los pitchers 
 * lanzan, participan a la defensiva pero no batean. Los bateadores designados no
 * lanzan y no participan a la defensiva (sólo batean). Los jugadores de posición
 * no lanzan, pero participan a la defensiva y batean. Modele un sistema 
 * orientado a objetos con clases heredadas con el que controle los ponches 
 * recetados por los pitchers, los hits bateados por los otros jugadores y los 
 * errores cometidos por quienes participan a la defensiva.
 */

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
