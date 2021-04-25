public abstract class Empleado{
    private String nombre;
    private int edad;

    public Empleado(){}

    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public String toString(){
        return "[Nombre=" + nombre + ", edad=" + edad + "]";
    }

    // se crea una clase abstracta para que sea obligatoria en las demás 
    public abstract float calcularPago();

}