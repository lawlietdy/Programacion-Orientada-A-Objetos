/**
 * Un equipo de futbol debe controlar las estadísticas de sus jugadores y para ello 
 * requiere un sistema computacional orientado a objetos con relaciones de herencia.
 * Los datos de cada jugador son el número de uniforme, nombre y su posición (portero, 
 * defensa, medio y delantero). Además, el equipo desea almacenar la cantidad de goles 
 * anotados por cada jugador (excepto el portero) y los minutos jugados. Defina las clases 
 * con sus relaciones de herencia de la manera más apropiada para modelar este sistema e 
 * impleméntelas a través de un proyecto.
 */
public class Jugador{

    int numeroUniforme;
    String nombre;
    String posicion;
    int goles;
    int minutos;


    public Jugador(int numeroUniforme, String nombre, String posicion) {
        this.numeroUniforme = numeroUniforme;
        this.nombre = nombre;
        this.posicion = posicion;
    }


    public int getNumeroUniforme() {
        return this.numeroUniforme;
    }

    public void setNumeroUniforme(int numeroUniforme) {
        this.numeroUniforme = numeroUniforme;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles(){
        return this.goles;
    }

    public int getMinutos(){
        return this.minutos;
    }

    // Retorna un valor falso o verdadero si se cumple la condicion
    // se deberá evaluar en la clase principal
    public boolean addGol(int cantidadGoles){
        boolean respuesta;
        if(posicion.equals("portero"))
            respuesta = false;
        else{
            goles += cantidadGoles;
            respuesta = true;
        }
        return respuesta;
    }

    public void addMinutes(int min){
        minutos += min;
    }


    public String toString() {
        return
            " numeroUniforme='" + getNumeroUniforme() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", posicion='" + getPosicion() + "'" +
            ", goles='" + getGoles() + "'" +
            ", minutos='" + getMinutos() + "'";
    }

}