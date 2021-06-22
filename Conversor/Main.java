import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        ConversorDivisas conversor1 = new ConversorDivisas();
        ConversorDivisas conversorDolar = new ConversorDivisas(20.42);


        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Convertir de Pesos a Dolares \n" +
                                                "2. Convertir de Pesos a Euros\n" +
                                                "3. Convertir de Euros a Pesos\n" +
                                                "4. Convetir de Dolares a Pesos\n" +
                                                "5. Salir\n", "MENU", JOptionPane.INFORMATION_MESSAGE));
 
            switch (opcion) {
                case 1:
                    double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos a convertir", "1. Convertir de Pesos a Dolares", JOptionPane.INFORMATION_MESSAGE));
                    double resultado = conversorDolar.pesosADolar(100);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);     
                    break;
                case 2:
                    System.out.println("2. Convertir de Pesos a Euros");
                    break;
                case 3:
                    System.out.println("3. Convertir de Euros a Pesos");
                    
                    break;
                case 4:
                    System.out.println("4. Convetir de Dolares a Pesos");
                    
                    break;
                case 5:
                    System.out.println("Saliendo del programa....");

                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opcion != 5);
    }
}
