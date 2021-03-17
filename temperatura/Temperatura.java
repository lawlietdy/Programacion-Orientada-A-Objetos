public class Temperatura {
    
    private double grados;
    private double resultado;

    public void calcularCelcius(double grados){
        resultado = (grados - 32) / 1.8;
    }

    public void calcularFarenheit(double grados){
        resultado = 1.8 * grados + 32;
    }

    public double getGrados(){
        return grados;
    } 

    public double getResultado(){
        return resultado;
    }


}
