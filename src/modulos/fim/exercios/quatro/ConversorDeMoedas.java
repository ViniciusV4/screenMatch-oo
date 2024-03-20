package modulos.fim.exercios.quatro;

public class ConversorDeMoedas implements ConversaoFinanceira{
    private double real;
    private double dolar;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converterDolarParaReal() {
        return dolar * 5;
    }
}
