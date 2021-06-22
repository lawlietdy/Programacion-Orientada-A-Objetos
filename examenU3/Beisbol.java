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
