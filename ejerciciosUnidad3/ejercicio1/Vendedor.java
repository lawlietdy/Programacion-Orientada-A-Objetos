public class Vendedor extends SubContratado {
    int porcentaje;    

    public Vendedor() {
    }

    public Vendedor(String nombre, int edad, int horas, float pagoPorHora, int porcentaje) {
        super(nombre, edad, pagoPorHora, horas);
        this.porcentaje = porcentaje;
    }
        

    @Override
    public float calcularPago(){
        float resultado;
        resultado = (horas * pagoPorHora) * porcentaje;

        return resultado;
    }
}
