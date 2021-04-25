public class Prueba {
    public static void main(String[] args) {
        Vendedor pedro = new Vendedor("Pedro", 25, 100, 200, 5);
        Vendedor maria = new Vendedor("Maria", 30, 100, 200, 10);

        // Pedro
        System.out.println("Datos: " + pedro.toString());
        System.out.println("Sueldo: " + pedro.calcularPago());
        // Maria
        System.out.println("Datos: " + maria.toString());
        System.out.println("Sueldo: " + maria.calcularPago());


    }
}
