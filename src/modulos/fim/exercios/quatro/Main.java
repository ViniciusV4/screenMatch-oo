package modulos.fim.exercios.quatro;

public class Main {
    public static void main(String[] args) {
//        ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();
//        conversorDeMoedas.setDolar(100);
//        System.out.println("Teho " + conversorDeMoedas.getDolar() + " dolares. Convertendo para real, tenho " + conversorDeMoedas.converterDolarParaReal());

        CalcularSalaRetangular calcularSalaRetangular = new CalcularSalaRetangular();

        calcularSalaRetangular.setAltura(1000);
        calcularSalaRetangular.setLargura(1000);
        System.out.println("A area do meu retangulo é: " + calcularSalaRetangular.calcularArea());
        System.out.println("E o perimetro do meu retangulo é: " + calcularSalaRetangular.calcularPerimetro());

    }
}
