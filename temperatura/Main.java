import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Temperatura celcius = new Temperatura();
        Temperatura farenheit = new Temperatura();
        Scanner sc = new Scanner(System.in);
        int opcion;
        double resultado, grados; 

        String bandera = "seguir";
        do{
            System.out.println("\nPrograma de conversión de grados: ");
            System.out.println("1. Grados celcius a farenheit");
            System.out.println("2. Grados farenheit a celcius");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Seleccionaste Grados celcius a farenheit");
                    System.out.print("Grados celcius a convertir: ");
                    grados = sc.nextDouble();
                    farenheit.calcularFarenheit(grados);
                    resultado = farenheit.getResultado();
                    System.out.print("\nEl resultado es: " + resultado + "°C\n");
                    break;
                case 2:
                    System.out.println("Seleccionaste Grados farenheit a celcius");
                    System.out.print("Grados farenheit a convertir: ");
                    grados = sc.nextDouble();
                    celcius.calcularCelcius(grados);;
                    resultado = celcius.getResultado();
                    System.out.print("\nEl resultado es: " + resultado + "°F\n");
                    break;    
                case 3:
                    bandera = "parar";
                    break;
                default: 
                    System.out.println("Opción invalida, seleccion 1, 2 o 3");
                    break;
            }
        }while(bandera.equals("seguir"));

        sc.close();
    }
    
}