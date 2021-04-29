public class MainRestaurante{

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(16, 2);

        System.out.println("Platos: " + restaurante.getNumPlatos());

        // Servir plato
        restaurante.sirvePlato();
        restaurante.sirvePlato();
        restaurante.sirvePlato();

        // verificar si se sirvio el plato
        System.out.println("Platos: " + restaurante.getNumPlatos());

        // Obtener total de huevos y chorizo en en el refrigerados
        System.out.println("Huevos: " + restaurante.getDocenasHuevos() + "\nChorizo: " + restaurante.getKilosChorizo() + " gramos");
    }
}