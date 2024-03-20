package modulos.fim.exercios.um;

public class Musica {
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroDeAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Nome: " + artista);
        System.out.println("Foi lançado no ano de: " + anoDeLancamento);
        System.out.println("Possui nota: " + avaliacao);
        System.out.println("Número de avaliações: " + numeroDeAvaliacoes);
        System.out.println("A média de avaliações do: " + artista + " é " + pegarMedia());
    }

    void avaliar(double nota) {
        avaliacao += nota;
        numeroDeAvaliacoes++;
    }

    double pegarMedia() {
        return avaliacao / numeroDeAvaliacoes;
    }
}
