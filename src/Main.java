import com.developer.rodrigo.screenmatch.models.Filme;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setNome("Matrix");
        filme1.setAnoDeLancamento(1999);
        filme1.setDuracaoEmMinutos(136);
        filme1.setIncluidoNoPlano(true);
        filme1.exibirFichaTecnica();

        Filme filme2 = new Filme();
        filme2.setNome("Interestelar");
        filme2.setAnoDeLancamento(2014);
        filme2.setDuracaoEmMinutos(169);
        filme2.setIncluidoNoPlano(false);
        filme2.exibirFichaTecnica();
    }
}