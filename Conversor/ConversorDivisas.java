/**
 * ConversorDivisas
 */
public class ConversorDivisas {

    private double tipoDeCambio;

    public ConversorDivisas(){
        tipoDeCambio = 0;
    }

    public ConversorDivisas(double tipoDeCambio){
        this.tipoDeCambio = tipoDeCambio;
    }
    
    public double pesosAEuros(double valorPesos){
        return valorPesos / tipoDeCambio;
    }

    public double eurosAPesos(double valorEuro){
        return valorEuro * tipoDeCambio;
    }

    public double pesosADolar(double valorPesos){
        return valorPesos / tipoDeCambio;
    }

    public double dolarAPesos(double valorDolar){
        return valorDolar * tipoDeCambio;
    }

    
}