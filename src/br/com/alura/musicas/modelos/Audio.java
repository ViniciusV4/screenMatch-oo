package br.com.alura.musicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalDeCutidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalDeCutidas() {
        return totalDeCutidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        totalDeCutidas++;
    }

    public void reproduz() {
        totalReproducoes++;
    }
}
