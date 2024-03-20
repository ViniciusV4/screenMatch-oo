import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeavaliacoes());
        System.out.println(meuFilme.obterMediaAvaliacoes());

        Serie serie = new Serie();

        serie.setNome("Prison Break");
        serie.setAnoDeLancamento(2006);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(20);
        serie.exibeFichaTecnica();
        serie.setMinutosPorEpisodio(45);
        System.out.println("Tempo necessario para maratonar " + serie.getNome() + " = " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar 2");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(220);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(serie);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNome("Episodio 1");
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVizualizacoes(99);
        filtroRecomendacao.filtra(episodio);


    }
}
