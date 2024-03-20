package br.com.alura.musicas.principal;
import br.com.alura.musicas.modelos.MinhasPreferidas;
import br.com.alura.musicas.modelos.Musica;
import br.com.alura.musicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast podcast1 = new Podcast();
        podcast1.setHost("Mitico");
        podcast1.setTitulo("PodPah");

        for (int i = 0; i < 2000; i++) {
            podcast1.reproduz();
            podcast1.curte();
        }


        Musica musica1 = new Musica();
        musica1.setTitulo("A vida é desafio");
        musica1.setArtista("Racionais MC'c");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
            musica1.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(podcast1);
        minhasPreferidas.inclui(musica1);


    }
}
