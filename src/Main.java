import com.developer.rodrigo.screenmatch.calculo.CalculadoraDeTempo;
import com.developer.rodrigo.screenmatch.calculo.FiltroRecomendacao;
import com.developer.rodrigo.screenmatch.model.Filme;
import com.developer.rodrigo.screenmatch.model.Serie;

public class Main {
    public static void main(String[] args) {

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();


        Filme filme1 = new Filme();
        filme1.setNome("Matrix");
        filme1.setAnoDeLancamento(1999);
        filme1.setDuracaoEmMinutos(136);
        filme1.exibirFichaTecnica();
        filme1.avaliar(9.5);
        filme1.avaliar(9.8);
        System.out.println("Avaliação média do filme é: " + filme1.avaliacaoMedia());
        System.out.println("Duração total do título: " + filme1.getDuracaoEmMinutos() + " minutos.");
        filtroRecomendacao.filtrar(filme1);
        System.out.println("|--------------------------------------------------|");


        Serie serie1 = new Serie();
        serie1.setNome("Silicon Valley");
        serie1.setAnoDeLancamento(2014);
        serie1.exibirFichaTecnica();
        serie1.setTemporadas(6);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodio(30);
        serie1.avaliar(8.5);
        serie1.avaliar(8.9);
        System.out.println("Avaliação média da série é: " + serie1.avaliacaoMedia());
        System.out.println("Duração total do título: " + serie1.getDuracaoEmMinutos() + " minutos.");
        filtroRecomendacao.filtrar(serie1);
        System.out.println("|--------------------------------------------------|");


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiDuracao(filme1);
        calculadora.incluiDuracao(serie1);
        System.out.println("Duração total dos titulos inclusos: " + calculadora.getTempoTotal() + " minutos.");
        System.out.println("|--------------------------------------------------|");






    }
}