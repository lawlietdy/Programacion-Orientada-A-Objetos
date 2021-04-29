import javax.swing.JOptionPane;

public class MainDistancia{

    public static void main(String[] args) {
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea calcular?\n1. Millas a metros\n2. Millas a kilometros\n3. Salir", "MENU", JOptionPane.DEFAULT_OPTION));
            Distancia distancia = new Distancia();
            float resultado = 0;
            float longitud;
            if( opcion == 3) break;
            longitud = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese distancia en millas: ", "Entrada", JOptionPane.DEFAULT_OPTION));
            switch(opcion){
                case 1:
                    resultado = distancia.millasAMetros(longitud);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Resultado", JOptionPane.DEFAULT_OPTION);
                    break;

                case 2:
                    resultado = distancia.millasAKilometros(longitud);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Resultado", JOptionPane.DEFAULT_OPTION);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }while(opcion != 3);
    }
}