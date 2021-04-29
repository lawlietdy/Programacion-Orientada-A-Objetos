public class Distancia{

    public Distancia(){}

    public float millasAMetros(float distanciaEnMillas){
        return distanciaEnMillas * 1609.43f;
    }

    public float millasAKilometros(float distanciaEnMillas){
        return distanciaEnMillas * 1.6093f;
    }
}