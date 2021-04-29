import javax.swing.JOptionPane;

public class MainPeso{

    public static void main(String[] args) {
        String medida;
        int opcion;
        do{
            // Menu
            medida = JOptionPane.showInputDialog(null, "Ingrese el tipo de peso: \n- onzas\n- libras\n- kilogramos\n- gramos\nSi desea salir escriba 'salir'", "Ingresar medida", JOptionPane.INFORMATION_MESSAGE);
            if(medida.equals("salir")) break;
            // Ingresar peso
            float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el peso: ", "Peso", JOptionPane.INFORMATION_MESSAGE));
            // Inicializa el constructor
            Peso conversor = new Peso(peso, medida);
            // pregunta a que lo quiere convertir
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Convertir " + peso +" " + medida + " a: \n1 onzas\n2 libras\n3 kilogramos", "Convertir a", JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Resultado: " + conversor.getOnzas() , "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Resultado: " + conversor.getLibras() , "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Resultado: " + conversor.getPeso() , "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida: " + conversor.getPeso() , "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        }while(!medida.equals("salir"));
        

        // Probando getLibras

        // Probando getOnzas

        // Probando getPeso
        
    }
}