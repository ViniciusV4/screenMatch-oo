package modulos.fim.exercios.um;

public class Main {

    public static void main(String[] args) {
        Pessoa marcos = new Pessoa();
        marcos.helloWolrd();

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.dobroDoValor(10));

        Musica musica = new Musica();

        musica.artista = "Djonga";
        musica.anoDeLancamento = 2018;
        musica.avaliar(10);
        musica.avaliar(10);
        musica.avaliar(10);

        musica.exibirFichaTecnica();



    }
}
