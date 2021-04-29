public class Restaurante{

    int docenasHuevos;
    double kilosChorizo;


    public Restaurante(int docenasHuevos, double kilosChorizo) {
        this.docenasHuevos = docenasHuevos;
        this.kilosChorizo = kilosChorizo * 1000; // Como se agrega en kilos se transforma a gramos 1kg = 1000g
    }

    public void addHuevos(int cantidad){
        docenasHuevos += cantidad;
    }

    public void addChorizo(double cantidad){
        kilosChorizo += cantidad * 1000;
    }

    public int getNumPlatos(){
        int platos = 0;
        // Verifica si por lo menos alcanza para un plato, sino devuelve cero
        if(docenasHuevos >= 2 && kilosChorizo >= 200){

            // Optiene la cantidad de platos que se puede hacer por cada uno
            int huevos = docenasHuevos / 2;
            int chorizo = (int) kilosChorizo / 200;

            // Verifica si alcanzan más platos para huevos, de ser así retorna el numero de
            // platos de chorizo ya que sino hay suficiente chorizo no puede haber más platos aunque haya mas huevos
            if( huevos > chorizo )
                 platos = chorizo;
            else if (chorizo > huevos)
                platos =  huevos;
            else
                platos = huevos; // En caso de que sean igual se puede retornar cualquiera de los dos
             
        } else
            platos = 0;   
        
        return platos;
    }

    public void sirvePlato(){
        docenasHuevos -= 2;
        kilosChorizo -= 200;
    }


    public int getDocenasHuevos() {
        return this.docenasHuevos;
    }

    public double getKilosChorizo() {
        return this.kilosChorizo;
    }
    
    
}