public class MainJugador {
    public static void main(String[] args) {
        // Crear un nuevo jugador
        Jugador angel = new Jugador(10, "Teodoro del Angel", "delantero");

        // Almacenar cantidad de goles
       if(!angel.addGol(20)){
           System.out.println("No se puede agregar goles de portero");
       }

        // Almacenar cantidad de minutos
        angel.addMinutes(90);

        // Mostrar la información
        System.out.println(angel.toString());

        // Comprobación de que no se puede agregar goles a un portero
        Jugador pancho = new Jugador(12, "Francisco", "portero");
        if(!pancho.addGol(20)){
            System.out.println("No se puede agregar goles de portero");
        }
    }
}
