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

public class Beisbol {
    int numeroUniforme;
    String nombre;
    String posicion; // Jugadores de pocision, pitchers, bateadores
    int ponches;
    int hits;
    int cantidadErrores;


    public Beisbol(int numeroUniforme, String nombre, String posicion) {
        this.numeroUniforme = numeroUniforme;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public boolean addPonches(){
        boolean respuesta;
        if(posicion.equals("jugador de posicion"))
            respuesta = false;
        else{
            ponches += 1;
            respuesta = true;
        }

        return respuesta;
    }

    public void addHits(){
        hits += 1;
    }

    public void addError(){
        cantidadErrores += 1;
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

    public int getPonches() {
        return this.ponches;
    }

    public void setPonches(int ponches) {
        this.ponches = ponches;
    }

    public int getHits() {
        return this.hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getCantidadErrores() {
        return this.cantidadErrores;
    }

    public void setCantidadErrores(int cantidadErrores) {
        this.cantidadErrores = cantidadErrores;
    }


    @Override
    public String toString() {
        return
            " numeroUniforme='" + getNumeroUniforme() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", posicion='" + getPosicion() + "'" +
            ", ponches='" + getPonches() + "'" +
            ", hits='" + getHits() + "'" +
            ", cantidadErrores='" + getCantidadErrores() + "'";
    }

}
