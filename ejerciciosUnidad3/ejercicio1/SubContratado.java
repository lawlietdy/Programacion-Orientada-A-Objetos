import java.util.Scanner;

public class SubContratado extends Empleado{
    private int horas;
    private float pagoPorHora;
    Scanner sc = new Scanner(System.in);

    public SubContratado(){

    }

    public SubContratado(String nombre, int edad, float pagoPorHora, int horas){
        super(nombre, edad);
        this.horas = horas;
        this.pagoPorHora = pagoPorHora;
    }
    
    public float calcularPago(){
        float resultado;
        resultado = horas * pagoPorHora;
        return resultado;
    }
}