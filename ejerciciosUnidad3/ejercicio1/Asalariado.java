import java.util.Scanner;

public class Asalariado extends Empleado{
    private float sueldo;
    // private String nombre;
    // private int edad;
    Scanner sc = new Scanner(System.in);

    public Asalariado(){

    }

    public Asalariado(String nombre, int edad, float sueldo){
        super(nombre, edad);
        this.sueldo = sueldo;
        // this.nombre = nombre;
        // this.edad = edad;
    }
    
    public float calcularPago(){
        int meses;
        float resultado;
        System.out.println("-----ASALARIADO-----");
        System.out.println("¿Cuántos meses trabajó? ");
        meses = sc.nextInt();
        resultado = meses * sueldo;

        return resultado;
    }

    // @Override
    // public String toString(){
    //     return "[Nombre=" + nombre + ", edad=" + edad + "]";
    // }
    
}