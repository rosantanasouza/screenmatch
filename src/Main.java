import com.developer.rodrigo.screenmatch.calculo.CalculadoraDeTempo;
import com.developer.rodrigo.screenmatch.model.Filme;
import com.developer.rodrigo.screenmatch.model.Serie;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setNome("Matrix");
        filme1.setAnoDeLancamento(1999);
        filme1.setDuracaoEmMinutos(136);
        filme1.exibirFichaTecnica();
        System.out.println("Duração total do título: " + filme1.getDuracaoEmMinutos() + " minutos.");
        System.out.println();


        Serie serie1 = new Serie();
        serie1.setNome("Silicon Valley");
        serie1.setAnoDeLancamento(2014);
        serie1.exibirFichaTecnica();
        serie1.setTemporadas(6);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodio(30);
        System.out.println("Duração total do título: " + serie1.getDuracaoEmMinutos() + " minutos.");
        System.out.println();


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiDuracao(filme1);
        calculadora.incluiDuracao(serie1);
        System.out.println("Duração total dos titulos inclusos: " + calculadora.getTempoTotal() + " minutos.");

    }
}