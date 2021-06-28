public class Ejemplo1{
    
    // Supongamos que queremos escribir un método auxiliar que devuelva la división real de dos números reales (en Java), 
    // y que para lo mismo hacemos uso del operador de la librería "/" 
    
    //Un primer código para dicho método podría ser:
    public static double divisionReal (double dividendo, double divisor){ 
        
        return (dividendo / divisor);
    
    }

    // El código es correcto, y el resultado devuelto por el método se corresponde con la división real de dos números reales.
    // Por ejemplo, lo podemos comprobar con un sencillo ejemplo:
    public static void main(String[] args){
        double x = 15.0; 
        double y = 3.0;
        double resultado = divisionReal (x, y);
        System.out.println ("El resultado de la division real de " + x + " entre " + y + " es: " + resultado);

        // Sin embargo, hay, al menos, una situación "excepcional" que no hemos tenido en cuenta al programar 
        // el mismo. ¿Qué sucedería si al realizar la división de ambos números el denominador de la misma fuese 
        // igual a cero?

        // Descomentar codigo para probarlo
        double x2 = 15.0; 
        double y2 = 0;
        double resultadoConCero = divisionReal (x2, y2);
        System.out.println ("El resultado de la division real de " + x2 + " entre " + y2 + " es: " + resultadoConCero);

    }

}