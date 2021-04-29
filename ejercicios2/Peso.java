public class Peso{
    float peso;
    String medida;

    public Peso (float peso, String medida){
        this.peso = peso;
        this.medida = medida;
    }

    public float getLibras(){
        float resultado = 0;
        if(medida.equals("libras")){
            resultado = peso;
        }
        if(medida.equals("onzas")){
           // 1 onza es igual a 0.0625
           resultado = peso * 0.0625f; 
        } else if(medida.equals("kilogramos")){
            // 1 kg es igual a 2.2046 Libras
            resultado = peso * 2.2046f;
        } else if(medida.equals("gramos")){
            // 1 gramo es igual a 0.00220462 libras
            resultado = peso * 0.00220462f;
        }
        return resultado;
    }

    public float getOnzas(){
        float resultado = 0;
        if(medida.equals("libras")){
            resultado = peso * 16;
        } else if(medida.equals("onzas")){
            resultado = peso;
        } else if(medida.equals("kilogramos")){
            resultado = peso * 35.2739f;
        } else if(medida.equals("gramos")){
            resultado = peso * 0.035274f;
        }

        return resultado;
    }

    public float getPeso(){
        float resultado = 0;
        if(medida.equals("libras")){
            // 1kg equivale a 0.453592 libras
            resultado = peso * 0.453592f;
        } else if(medida.equals("onzas")){
            // 1kg equivale a 0.02835 oz
            resultado = peso * 0.02835f;
        } else if(medida.equals("kilogramos")){
            resultado = peso;
        } else if(medida.equals("gramos")){
            resultado = peso * 0.001f;
        }

        return resultado;
    }
}